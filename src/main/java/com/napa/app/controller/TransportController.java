package com.napa.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.napa.app.entity.Transportentity;
import com.napa.app.mapper.TMmapper;

@Controller
public class TransportController {
	
	@Autowired
	TMmapper tmmapper;
	
	@RequestMapping(value = "/")
	public String index(Model model) {
		List <Transportentity> list = tmmapper.selectAll();
		model.addAttribute("workers",list);
		return "index";
	}

}
