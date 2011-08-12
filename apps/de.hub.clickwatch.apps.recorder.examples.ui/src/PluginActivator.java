import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


public class PluginActivator extends AbstractUIPlugin {

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		de.hub.clickwatch.ui.PluginActivator.getInstance(); // activate buddy
	}

}
