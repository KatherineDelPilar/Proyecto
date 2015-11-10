package com.jetperu.remesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cobrarRemesa")
public class CobrarRemesaController {

	@RequestMapping(value = {"", "/"})
	public String defaultView(){
		return "cobrar-remesa";
	}
}
