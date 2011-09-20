package de.hub.clickwatch.analysis.ui.wizards;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IWorkingSet;


public class ClickWatchProjectInfo {
	
	private URI clickWatchModel;
	private URI clickWatchDataBase;
	private IPath locationPath;
	private String projectName;
	private IWorkingSet[] selectedWorkingSets;
	
	public URI getClickWatchModel() {
		return clickWatchModel;
	}
	
	public void setClickWatchModel(URI clickWatchModel) {
		this.clickWatchModel = clickWatchModel;
	}
	
	public IPath getLocationPath() {
		return locationPath;
	}
	
	public void setLocationPath(IPath locationPath) {
		this.locationPath = locationPath;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public IWorkingSet[] getSelectedWorkingSets() {
		return selectedWorkingSets;
	}
	
	public void setSelectedWorkingSets(IWorkingSet[] selectedWorkingSets) {
		this.selectedWorkingSets = selectedWorkingSets;
	}

	public URI getClickWatchDataBase() {
		return clickWatchDataBase;
	}

	public void setClickWatchDataBase(URI clickWatchDataBase) {
		this.clickWatchDataBase = clickWatchDataBase;
	}	
}
