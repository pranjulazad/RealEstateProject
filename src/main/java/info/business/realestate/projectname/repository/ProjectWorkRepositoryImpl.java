package info.business.realestate.projectname.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import info.business.realestate.projectname.models.ProjectWork;
import info.business.realestate.projectname.utility.enums.ProjectWorkStatusEnum;

@Repository
public class ProjectWorkRepositoryImpl implements ProjectWorkRepository{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<ProjectWork> findAllProjects() {
	
		//create query
		
		TypedQuery<ProjectWork> query = entityManager.createQuery("from ProjectWork", ProjectWork.class);
		
		//execute query and get data
		List<ProjectWork> listOfProjects = query.getResultList();
		
		return listOfProjects;
	}

	@Override
	public List<ProjectWork> findAllProjectsUsingStatus(ProjectWorkStatusEnum statusProvided) {
		
		//create query
		TypedQuery<ProjectWork> query = entityManager.createQuery("from ProjectWork where status:=statusProvided", ProjectWork.class);
		query.setParameter("statusProvided", statusProvided);
		
		//execute query and get data
		List<ProjectWork> listOfProjects = query.getResultList();
		
		return listOfProjects;
				
	}

//	@Override
//	public String persistAllProject(List<ProjectWork> projectList) {
//		
//		try {
//			for(ProjectWork project : projectList) {
//				entityManager.persist(project);
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			return "Failed";
//		}
//		
//		
//		return "Success";		
//	}

}
