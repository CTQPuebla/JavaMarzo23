package com;

public class Aplicacion {

	String nombre;
	String Tipo;
	String Funcionalidad;
	double pesoMb;
	
	Aplicacion(){
		
	}

	public Aplicacion(String nombre, String tipo, String funcionalidad, double pesoMb) {
		
		this.nombre = nombre;
		Tipo = tipo;
		Funcionalidad = funcionalidad;
		this.pesoMb = pesoMb;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getFuncionalidad() {
		return Funcionalidad;
	}

	public void setFuncionalidad(String funcionalidad) {
		Funcionalidad = funcionalidad;
	}

	public double getPesoMb() {
		return pesoMb;
	}

	public void setPesoMb(double pesoMb) {
		this.pesoMb = pesoMb;
	}

	@Override
	public String toString() {
		return "Aplicacion [nombre=" + nombre + ", Tipo=" + Tipo + ", Funcionalidad=" + Funcionalidad + ", pesoMb="
				+ pesoMb + "]";
	}
	
	
}
