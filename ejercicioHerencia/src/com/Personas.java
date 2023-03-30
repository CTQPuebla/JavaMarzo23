package com;

public class Personas {
	
	protected String nombre;
	protected int edad;
	protected double peso;
	protected String nacionalidad;
	
	
	
	public Personas(String nombre, int edad, double peso, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.nacionalidad = nacionalidad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String getNacionalidad() {
		return nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}



	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", nacionalidad=" + nacionalidad
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
