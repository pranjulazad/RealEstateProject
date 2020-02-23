package info.business.realestate.projectname.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import info.business.realestate.projectname.service.ProjectWorkService;
import info.business.realestate.projectname.utility.enums.ProjectWorkStatusEnum;

@Controller
public class ProjectWorkController {

	@Autowired
	ProjectWorkService service;
	
	@GetMapping("/completed/projects")
	public String getListOfCompletedProjects() {
		
		return null;
	}
	
	@GetMapping("/current/projects")
	public String getListOfCurrentProjects() {
		return null;
	}
	
	@GetMapping("/upcoming/projects")
	public String getListOfUpcomingProjects() {
		return null;
	}
	
//	@GetMapping("/add/projects")
//	public String addProjects() {
//		service.addProjects();
//		return null;
//	}
	
}
