package info.business.realestate.projectname.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import info.business.realestate.projectname.models.ProjectWork;
import info.business.realestate.projectname.service.ProjectWorkService;
import info.business.realestate.projectname.utility.enums.ProjectWorkStatusEnum;

@Controller
public class HomePageController {
	
	@Autowired
	ProjectWorkService service;
	
	@GetMapping("/")
	public String getHomeContent() {
		
		List<ProjectWork> projectWorkList = service.getProjectsUsingStatus(ProjectWorkStatusEnum.COMPLETED);
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		modelAndView.addObject("projectworklist", projectWorkList);
		
		return "new";
	}
	
}
