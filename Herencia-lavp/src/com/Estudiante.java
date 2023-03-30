package com;

public class Estudiante extends Persona{
	
	String areaEspecial;
	String area;
	int semestre;
	int numeroCuenta;
	
	
	public Estudiante() {
		
	}


	public Estudiante(String areaEspecial, String area, int semestre, int numeroCuenta) {
		this.areaEspecial = areaEspecial;
		this.area = area;
		this.semestre = semestre;
		this.numeroCuenta = numeroCuenta;
	}


	public String getAreaEspecial() {
		return areaEspecial;
	}


	public void setAreaEspecial(String areaEspecial) {
		this.areaEspecial = areaEspecial;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public int getSemestre() {
		return semestre;
	}


	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public int numeroCuenta() {
		return numeroCuenta;
	}


	public void numeroCuenta(int numeroCuenta) {
		this.numeroCuenta =numeroCuenta;
	}	
	
	@Override
	public String toString() {
		return "Estudiante [areaEspecial=" + areaEspecial + ", area=" + area + ", semestre=" + semestre
				+ ", numeroCuenta=" + numeroCuenta + ", vivo=" + vivo + ", genero=" + genero + ", Nombre=" + Nombre
				+ ", fechaNac=" + fechaNac + ", nacionalidad=" + nacionalidad + ", colorCabello=" + colorCabello + "]";
	}


	public void Identidad() {
		System.out.println("Pertenezco al Area: "+area);
	}
	
	public void Alive() {
		System.out.println(vivo);
	}


	
	
}
