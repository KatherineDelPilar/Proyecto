package com.jetperu.remesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consultarHistorial")
public class ConsultarHistorialController {

	@RequestMapping(value = {"", "/"})
	public String defaultView(){
		return "consultar-historial";
	}
}
