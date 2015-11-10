package com.jetperu.remesa.controller;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.datacontract.schemas._2004._07.Remesa;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tempuri.IRemesaProxy;

import com.google.gson.Gson;
import com.jetperu.remesa.bean.RemesaBean;

@Controller
@RequestMapping("/remesa")
public class RemesaController {

	@RequestMapping(value = { "", "/" })
	public String defaultView() {

		return "consultar-remesa";
	}

	@RequestMapping(value = "/consultar-remesa", method = RequestMethod.POST)
	@ResponseBody
	public String consultarEstadoRemesa(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam("numeroTransaccion") int numeroTransaccion) throws RemoteException {

		IRemesaProxy iRemesaProxy = new IRemesaProxy();
		Remesa remesa = iRemesaProxy.obtenerRemesa(numeroTransaccion);
		
		Map<String, Object> mapResultado = new HashMap<String, Object>();
		int resultado = 0;
		
		RemesaBean remesaBean = null;
		if (remesa != null) {
			remesaBean = new RemesaBean();
			remesaBean.setNumero(remesa.getNumero());
			remesaBean.setPIN(remesa.getPIN());
			remesaBean.setNombreAgencia(remesa.getAgencia().getNombre());
			remesaBean.setNombreMoneda(remesa.getMoneda().getNombre());
			remesaBean.setMonto(remesa.getMonto().doubleValue());
			remesaBean.setEstado(remesa.getEstado());
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			remesaBean.setFecha(dateFormat.format(remesa.getFecha().getTime()));
		} else {
			resultado = 2;
		}
		
		response.setContentType(MediaType.APPLICATION_JSON.toString());
		
		mapResultado.put("remesa", remesaBean);
		mapResultado.put("resultado", resultado);
		
		return new Gson().toJson(mapResultado);
	}

}
