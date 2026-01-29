package org.joonzis.controller;

import org.joonzis.service.CrawlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrawlingController {
	
	@Autowired
	private CrawlingService service;
	
	@RequestMapping("/crawl")
	public String crawl(Model model) {
		model.addAttribute("list", service.doCrawl());
		return "crawl";
	}
}
