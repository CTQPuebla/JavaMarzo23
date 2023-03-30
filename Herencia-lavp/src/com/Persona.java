package com;

public class Persona {
	boolean vivo;
	String genero;
	String Nombre;
	String fechaNac;
	String nacionalidad;
	String colorCabello;
	
	public Persona() {
		
	}

	public Persona(boolean vivo, String genero, String nombre, String fechaNac, String nacionalidad,
			String colorCabello) {
		this.vivo = vivo;
		this.genero = genero;
		this.Nombre = nombre;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.colorCabello = colorCabello;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getColorCabello() {
		return colorCabello;
	}

	public void setColorCabello(String colorCabello) {
		this.colorCabello = colorCabello;
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [vivo=" + vivo + ", genero=" + genero + ", Nombre=" + Nombre + ", fechaNac=" + fechaNac
				+ ", nacionalidad=" + nacionalidad + ", colorCabello=" + colorCabello + "]";
	}
	

}
