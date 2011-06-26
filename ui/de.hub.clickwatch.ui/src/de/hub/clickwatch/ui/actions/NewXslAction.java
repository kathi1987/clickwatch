package de.hub.clickwatch.ui.actions;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class NewXslAction extends WorkbenchWindowActionDelegate {
	private String filterPath =  System.getProperty("user.home");
	
	protected String createInitialXsl() {
		StringBuffer result = new StringBuffer();
		result.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		result.append("<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n");
		result.append("    <xsl:strip-space elements=\"*\"/>");
		result.append("    <xsl:template match=\"/\">\n");
		result.append("        <xsl:copy-of select=\".\"/>\n");
		result.append("    </xsl:template>\n");
		result.append("</xsl:stylesheet>\n");
		return result.toString();
	}
	
	public void run(IAction action) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		FileDialog dialog =  new FileDialog(window.getShell(), SWT.SAVE | SWT.SINGLE);
		dialog.setText("Create and open a new XSL file");
		
		dialog.setFilterPath(filterPath);
		dialog.open();
		String name =  dialog.getFileNames()[0];
		
		if (!name.endsWith(".xsl")) {
			name = name + ".xsl";
		}

		filterPath =  dialog.getFilterPath();
		IFileStore fileStore =  EFS.getLocalFileSystem().getStore(new Path(filterPath));
		fileStore =  fileStore.getChild(name);
		
		if (!fileStore.fetchInfo().exists()) {
			try {
				OutputStream os = fileStore.openOutputStream(0, null);
				BufferedWriter out = new BufferedWriter(new PrintWriter(os));
				out.write(createInitialXsl());
				out.flush();
			} catch (Exception e) {
				MessageDialog.openError(window.getShell(), "Error", "Could not create file.");
				return;
			}
		} else {
			MessageDialog.openWarning(window.getShell(), "Warning", "File already exists, will open the existing file instead.");
		}
		
		IFileInfo fetchInfo = fileStore.fetchInfo();
		if (!fetchInfo.isDirectory() && fetchInfo.exists()) {
			IWorkbenchPage page =  window.getActivePage();
			try {
				IDE.openEditorOnFileStore(page, fileStore);
			} catch (PartInitException e) {
				MessageDialog.openError(window.getShell(), 
						"Error", "Could not open the created file.");
				return;
			}
		}
	}
}