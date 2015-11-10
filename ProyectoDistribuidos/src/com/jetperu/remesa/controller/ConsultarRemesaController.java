package com.jetperu.remesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consultarRemesasPorCobrar")
public class ConsultarRemesaController {

	@RequestMapping(value = {"", "/"})
	public String defaultView(){
		return "consultar-remesa-por-cobrar";
	}
}
