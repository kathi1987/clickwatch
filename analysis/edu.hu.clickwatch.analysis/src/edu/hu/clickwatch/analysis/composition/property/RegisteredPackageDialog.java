package edu.hu.clickwatch.analysis.composition.property;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreEditorPlugin;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class RegisteredPackageDialog extends ElementListSelectionDialog {

	protected boolean isDevelopmentTimeVersion = true;

	public RegisteredPackageDialog(Shell parent) {
		super(parent, new LabelProvider() {
			@Override
			public Image getImage(Object element) {
				return ExtendedImageRegistry.getInstance().getImage(
						EcoreEditPlugin.INSTANCE
								.getImage("full/obj16/EPackage"));
			}
		});

		setMultipleSelection(true);
		setMessage(EcoreEditorPlugin.INSTANCE
				.getString("_UI_SelectRegisteredPackageURI"));
		setFilter("*");
		setTitle(EcoreEditorPlugin.INSTANCE
				.getString("_UI_PackageSelection_label"));
	}

	public boolean isDevelopmentTimeVersion() {
		return isDevelopmentTimeVersion;
	}

	protected void updateElements() {
		if (isDevelopmentTimeVersion) {
			Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin
					.getEPackageNsURIToGenModelLocationMap();
			Object[] result = ePackageNsURItoGenModelLocationMap.keySet()
					.toArray(
							new Object[ePackageNsURItoGenModelLocationMap
									.size()]);
			Arrays.sort(result);
			setListElements(result);
		} else {
			Object[] result = EPackage.Registry.INSTANCE.keySet().toArray(
					new Object[EPackage.Registry.INSTANCE.size()]);
			Arrays.sort(result);
			setListElements(result);
		}
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite result = (Composite) super.createDialogArea(parent);
		Composite buttonGroup = new Composite(result, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		buttonGroup.setLayout(layout);
		final Button developmentTimeVersionButton = new Button(buttonGroup,
				SWT.RADIO);
		developmentTimeVersionButton
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent event) {
						isDevelopmentTimeVersion = developmentTimeVersionButton
								.getSelection();
						updateElements();
					}
				});
		developmentTimeVersionButton.setText(EcoreEditorPlugin.INSTANCE
				.getString("_UI_DevelopmentTimeVersion_label"));
		Button runtimeTimeVersionButton = new Button(buttonGroup, SWT.RADIO);
		runtimeTimeVersionButton.setText(EcoreEditorPlugin.INSTANCE
				.getString("_UI_RuntimeVersion_label"));
		developmentTimeVersionButton.setSelection(true);

		updateElements();

		return result;
	}

}
