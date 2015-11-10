package com.jetperu.remesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registrarObservacion")
public class RegistrarObservacionController {

	@RequestMapping(value = {"", "/"})
	public String defaultView(){
		return "registrar-observacion";
	}
}
