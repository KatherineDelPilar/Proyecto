package com.jetperu.remesa.bean;

import java.util.Calendar;

public class RemesaBean {

	private Integer numero;
	private Integer PIN;

	private double monto;
	private String estado;
	private String fecha;
	private String nombreAgencia;
	private String nombreMoneda;

	public Integer getPIN() {
		return PIN;
	}

	public void setPIN(Integer pIN) {
		PIN = pIN;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombreAgencia() {
		return nombreAgencia;
	}

	public void setNombreAgencia(String nombreAgencia) {
		this.nombreAgencia = nombreAgencia;
	}

	public String getNombreMoneda() {
		return nombreMoneda;
	}

	public void setNombreMoneda(String nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}
}
