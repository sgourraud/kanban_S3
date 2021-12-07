package org.rygn.kanban.controller;

import java.util.List;

import org.rygn.kanban.domain.Developer;
import org.rygn.kanban.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperController {
	
	@Autowired
	private DeveloperService developerService;
	
	@GetMapping("/developers")
	public List<Developer> findAllDevelopers() {
		return developerService.findAllDevelopers();
	}
}