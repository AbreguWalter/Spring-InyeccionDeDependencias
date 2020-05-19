package com.bolsadeideas.springboot.id.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.id.app.models.service.IService;

@Controller
public class IndexController {
	
	@Autowired
//	@Qualifier("miServicioPrincipal")
	private IService servicio;
	
//	@Autowired
//	public void setServicio(IService servicio) {
//		this.servicio = servicio;
//	}
	
	//Constructor
//	@Autowired
//	public IndexController(IService servicio) {
//		this.servicio = servicio;
//	}

	@GetMapping({"","/","/index"})
	public String index(Model model) {
		model.addAttribute("objeto",servicio.operacion());
		return "index";
	}

	
}
