package de.hub.clickwatch.transformationLauncher.propertyTester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IImportDeclaration;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.CompilationUnit;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;

import de.hub.clickwatch.main.IClickWatchMain;

public class HasTransformationMain extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		Boolean ret = false;

		// java files are CompilationUnits
		if (receiver instanceof CompilationUnit) {
			CompilationUnit c = ((CompilationUnit) receiver);
			try {
				// check the imports for the correct interface
				for (IImportDeclaration imp : c.getPrimary().getImports()) {
					if (imp.getElementName().equals(
							IClickWatchMain.class.getName())) {
						ret = true;
						break;
					}
				}

			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (receiver instanceof IFile) { // xtend files are only
												// recognized as IFile objects
			if (((IFile) receiver).getName().endsWith(".xtend"))
				ret = true;
		} else if (receiver instanceof IEditorInput) { // if the user right
														// clicks inside an
														// editor
			if (receiver instanceof FileEditorInput) {
				FileEditorInput fInput = (FileEditorInput) receiver;

				String file = fInput.getFile().getFullPath().toString();
				if (file.endsWith(".xtend") || file.endsWith(".java")) {
					ret = true;
				}
			}
		}

		return ret;
	}

}
