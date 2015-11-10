package com.jetperu.remesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/actualizarIncidencia")
public class ActualizarIncidenciaController {

	@RequestMapping(value = {"", "/"})
	public String defaultView(){
		return "actualizar-incidencia";
	}
}
