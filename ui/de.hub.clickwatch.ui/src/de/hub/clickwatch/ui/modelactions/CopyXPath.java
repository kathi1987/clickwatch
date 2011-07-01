package de.hub.clickwatch.ui.modelactions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;


public class CopyXPath implements IObjectActionDelegate {

	private Shell shell;
	private EObject object;


	public CopyXPath() {
		super();
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	private String getXPath(EObject object) {
		if (object == null || object instanceof Resource) {
			return "";
		}
		
		String prefix = getXPath(object.eContainer());
		if (object instanceof Network) {
			if (object.eContainer() == null || object.eContainer() instanceof Resource) {
				return prefix + "/Network";
			} else {
				return prefix + "/subnetwork[@name='" + ((Network)object).getName() + "']";
			}
		} else if (object instanceof Node) {
			return prefix + "/node[@iNetAddress='" + ((Node)object).getINetAddress() + "']";
		} else if (object instanceof Element) {
			return prefix + "/" + ((Element)object).getName();
		} else if (object instanceof Handler) {
			return prefix + "/" + ((Handler)object).getName();
		} else if (object instanceof AnyType) {
			FeatureMap fm = (FeatureMap)object.eContainer().eGet(object.eContainingFeature());
			for (int i = 0; i < fm.size(); i++) {
				if (fm.getValue(i) == object) {
					return prefix + "/" + fm.getEStructuralFeature(i).getName();
				}
			}
			return "";
		} else {
			return "/";
		}
	}
	

	@Override
	public void run(IAction action) {
		if (object == null) {
			return;
		}

		Clipboard clipboard = new Clipboard(shell.getDisplay());
		clipboard.setContents(new Object[] { getXPath(object) },
				new Transfer[] { TextTransfer.getInstance() });
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			object = (EObject) ((IStructuredSelection) selection)
					.getFirstElement();
		} catch (Exception e) {
			MessageDialog.openError(shell, "Clickwatch Error",
					"You can only call this action on an ClickWatch model element");
		}
	}

}
