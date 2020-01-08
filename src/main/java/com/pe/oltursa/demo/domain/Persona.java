package com.pe.oltursa.demo.domain;

public class Persona {
	private Integer cpersona;
	private Boolean activo;
	private String nombre;
	private String paterno;
	private String materno;
	public Integer getCpersona() {
		return cpersona;
	}
	public void setCpersona(Integer cpersona) {
		this.cpersona = cpersona;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	
}
