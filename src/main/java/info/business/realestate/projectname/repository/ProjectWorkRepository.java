package info.business.realestate.projectname.repository;

import java.util.List;

import info.business.realestate.projectname.models.ProjectWork;
import info.business.realestate.projectname.utility.enums.ProjectWorkStatusEnum;

public interface ProjectWorkRepository {
	public List<ProjectWork> findAllProjects();
	
	public List<ProjectWork> findAllProjectsUsingStatus(ProjectWorkStatusEnum status);
	
//	public String persistAllProject(List<ProjectWork> projectList);
}
