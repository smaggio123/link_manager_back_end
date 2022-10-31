package net.javaguide.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguide.springboot.model.LinkManager;
import net.javaguide.springboot.repository.LinkRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class LinkManagerController {
	@Autowired
	private LinkRepository linkRepository;

	@GetMapping("links")
	public List<LinkManager> getLinks() {
		return this.linkRepository.findAll();
	}
}
