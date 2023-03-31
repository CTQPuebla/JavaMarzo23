package com;

public abstract class Embarcacion {
	
	public String nombre;
	public String tipoEmbarcacion;
	public String marca;
	public int modelo;
	public int longitudPies;
	public String combustible;
	
	public Embarcacion() {		
	}
	public Embarcacion(String nombre, String tipoEmbarcacion, String marca, int modelo, int longitudPies, String combustible) {
		this.nombre = nombre;
		this.tipoEmbarcacion = tipoEmbarcacion;
		this.marca = marca;
		this.modelo = modelo;
		this.longitudPies = longitudPies;
		this.combustible = combustible;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoEmbarcacion() {
		return tipoEmbarcacion;
	}
	public void setTipoEmbarcacion(String tipoEmbarcacion) {
		this.tipoEmbarcacion = tipoEmbarcacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public int getLongitudPies() {
		return longitudPies;
	}
	public void setLongitudPies(int longitudPies) {
		this.longitudPies = longitudPies;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	@Override
	public String toString() {
		return "Embarcacion [nombre=" + nombre + ", tipoEmbarcacion=" + tipoEmbarcacion + ", marca=" + marca
				+ ", modelo=" + modelo + ", longitudPies=" + longitudPies + ", combustible=" + combustible + "]";
	}
	public abstract void datos();
}
