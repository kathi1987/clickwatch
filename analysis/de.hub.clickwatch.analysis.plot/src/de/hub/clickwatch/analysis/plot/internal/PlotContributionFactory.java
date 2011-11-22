package de.hub.clickwatch.analysis.plot.internal;

import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import de.hub.clickwatch.analysis.plot.IPlotAlgorithm;
import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.ValueSpec;
import de.hub.clickwatch.analysis.results.util.builder.AxisBuilder;
import de.hub.clickwatch.analysis.results.util.builder.ChartBuilder;
import de.hub.clickwatch.analysis.results.util.builder.SeriesBuilder;
import de.hub.clickwatch.analysis.results.util.builder.XYBuilder;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.util.Throwables;

public class PlotContributionFactory extends ExtensionContributionFactory {
	
	private static final String commandId = "de.hub.clickwatch.analysis.plot.ExecutePlot";
	private static final String plotExtensionId = "de.hub.clickwatch.analysis.Plot";
	
	public static final class PlotSpec {
	    private final Chart chart;
	    private final String name;
	    private final IConfigurationElement configElem;	    
	    
	    private int timeAxis;
	    private int windowSize;               
        
	    private PlotSpec(String name, IConfigurationElement configElem) {
            super();
            this.name = name;
            this.chart = ChartBuilder.newChartBuilder().withName(name).withType(XYBuilder.newXYBuilder()).build();
            this.configElem = configElem;
        }
        
        public void addValueSpec(String name, boolean isAxis, int windowSize) {
            ValueSpec spec = null;
            if (isAxis) {
                spec = AxisBuilder.newAxisBuilder().withName(name).withColumn(chart.getValueSpecs().size()).build();
            } else {
                spec = SeriesBuilder.newSeriesBuilder().withName(name).withColumn(chart.getValueSpecs().size()).build();
            }
            
            if (windowSize > 0) {
                timeAxis = chart.getValueSpecs().size();
                this.windowSize = windowSize;
            }
            
            chart.getValueSpecs().add(spec);
        }
        
        public int getTimeAxis() {
            return timeAxis;
        }
        
        public int getWindowSize() {
            return windowSize;
        }
        
        public String getName() {
            return name;
        }
        public IPlotAlgorithm createPlotAlgorithm() throws CoreException {
            return (IPlotAlgorithm)configElem.createExecutableExtension("class");
        }

        public Chart getChart() {
            return chart;
        }        
	}
	
	public static Multimap<String, PlotSpec> plots = null;
	
	public static Multimap<String, PlotSpec> getPlots() {
	    if (plots == null) {
	        plots = ArrayListMultimap.create();
	        IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(plotExtensionId);
	        try {
	            configLoop: for (IConfigurationElement e : config) {
	                String name = e.getAttribute("name");
	                PlotSpec plotSpec = new PlotSpec(name, e);
	                for (IConfigurationElement valueSpec: e.getChildren()) {
	                    boolean isAxis = valueSpec.getAttribute("is_axis").equals("true");
	                    String specName = valueSpec.getAttribute("name");
	                    int windowSize = 0;
	                    if (valueSpec.getAttribute("window_size") != null) {
	                        try {
	                            windowSize = Integer.parseInt(valueSpec.getAttribute("window_size"));
	                        } catch (NumberFormatException nfe) {
	                            continue configLoop;
	                        }
	                    }
	                    plotSpec.addValueSpec(specName, isAxis, windowSize);
	                }
	                plots.put(e.getAttribute("handler"), plotSpec);
	            }
	        } catch (Exception e) {
	            Throwables.propagate(e);
	        }
	    }
	    return plots;
	}

	@Override
    public void createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {
	    ISelectionService service = (ISelectionService)serviceLocator.getService(ISelectionService.class);
	    ISelection selection = service.getSelection();
	    if (selection instanceof IStructuredSelection) {
	        Object selectedObject = ((IStructuredSelection)selection).getFirstElement();
	        if (selectedObject instanceof Handler) {
	            String handlerName = ((Handler)selectedObject).getQualifiedName();
	            for (PlotSpec plotSpec: getPlots().get(handlerName)) {
	                addCommand(serviceLocator, additions, handlerName, plotSpec.getName());
	            }       	            
	        }
	    }
	}

	@SuppressWarnings({ "unchecked" })
	private void addCommand(IServiceLocator serviceLocator, IContributionRoot additions, String handlerName, String plotName) {
		CommandContributionItemParameter p = new CommandContributionItemParameter(
				serviceLocator, handlerName + "_" + plotName, commandId, SWT.PUSH);
		p.label = plotName;
		if (p.parameters == null) {
			p.parameters = new HashMap<Object, Object>();
		}
		p.parameters.put("name", plotName);
		p.parameters.put("handler", handlerName);

		CommandContributionItem item = new CommandContributionItem(p);
		item.setVisible(true);
		additions.addContributionItem(item, null);
	}
}
