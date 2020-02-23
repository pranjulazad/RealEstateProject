package info.business.realestate.projectname.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.business.realestate.projectname.models.ProjectWork;
import info.business.realestate.projectname.repository.ProjectWorkRepositoryImpl;
import info.business.realestate.projectname.utility.enums.ProjectWorkStatusEnum;

@Service
public class ProjectWorkServiceImpl implements ProjectWorkService{

	@Autowired
	ProjectWorkRepositoryImpl repo;
	
	//List<ProjectWork> list;
	
	
	public ProjectWorkServiceImpl() {
//		list = new ArrayList<ProjectWork>();
//		list.add(new ProjectWork("project 1", "project 1", 77, "Kota",
//				new Date(), new Date(), new String[] {"/image/complete.jpg"}, ProjectWorkStatusEnum.COMPLETED));
//		list.add(new ProjectWork("project 2", "project 2", 88, "Kota",
//				new Date(), new Date(), new String[] {"/image/ongoing.jpg"}, ProjectWorkStatusEnum.ONGOING));
//		list.add(new ProjectWork("project 3", "project 3", 99, "Kota",
//				new Date(), new Date(), new String[] {"/image/upcoming.jpg"}, ProjectWorkStatusEnum.UPCOMING));
	}
	
	@Override
	@Transactional
	public List<ProjectWork> getAllProjects() {
		
		return null;
	}

	@Override
	@Transactional
	public List<ProjectWork> getProjectsUsingStatus(ProjectWorkStatusEnum status) {
		
		return null;
	}

//	@Override
//	@Transactional
//	public String addProjects() {
//		String status = repo.persistAllProject(list);
//		System.out.println("status------------------------->" + status);
//		return status;
//	}

}
