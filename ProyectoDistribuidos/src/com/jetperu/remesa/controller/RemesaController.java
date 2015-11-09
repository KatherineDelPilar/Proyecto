package com.jetperu.remesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/remesa")
public class RemesaController {
	
	@RequestMapping(value = {"","/"})
	public String defaultView(){
		
		return "consultar-remesa";
	}
	
	@RequestMapping(value = "/consultar-remesa" , method = RequestMethod.POST)
	public void consultarEstadoRemesa(@RequestParam("numeroTransaccion") String numeroTransaccion){
		System.out.println(numeroTransaccion);
		
		
		
		
	}
	

}
