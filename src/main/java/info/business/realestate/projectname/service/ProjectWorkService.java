package info.business.realestate.projectname.service;

import java.util.List;

import info.business.realestate.projectname.models.ProjectWork;
import info.business.realestate.projectname.utility.enums.ProjectWorkStatusEnum;

public interface ProjectWorkService {
	
	public List<ProjectWork> getAllProjects();
	
	public List<ProjectWork> getProjectsUsingStatus(ProjectWorkStatusEnum status);
	
	//public String addProjects();
	
}
