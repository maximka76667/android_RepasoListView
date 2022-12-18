package com.example.ej_listview;

public class InfoDescargaF {
	private String mes;
	private String anho;
	private boolean descargada;
	private String urlDescarga;
	
	public InfoDescargaF(String mes, String anho, boolean descargada){
		this.mes = mes;
		this.anho = anho;
		this.descargada = descargada;
	}

	public InfoDescargaF(String mes, String anho, boolean descargada, String urlDescarga){
		this.mes = mes;
		this.anho = anho;
		this.descargada = descargada;
		this.urlDescarga = urlDescarga;
	}
	
	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAnho() {
		return anho;
	}

	public void setAnho(String anho) {
		this.anho = anho;
	}

	public boolean estaDescargada() {
		return descargada;
	}

	public void setDescargada(boolean descargada) {
		this.descargada = descargada;
	}

	public String getUrlDescarga() {
		return urlDescarga;
	}

	public void setUrlDescarga(String urlDescarga) {
		this.urlDescarga = urlDescarga;
	}
	

}
