package com.jetperu.remesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/remesa")
public class RemesaController {
	
	@RequestMapping(value = {"","/"})
	public String defaultView(){
		
		return "consultar-remesa";
	}
	

}
