package com;

public class celular {
	
protected String marca,modelo;
protected String tipoSistema;	
protected double tamano;
protected int almacenamiento;


 


 public celular() {
	 
 }
 
 public celular(String marca,String modelo,
		 String tipoSistema,double tamano,int almacenamiento) {
	 
	
	this.marca = marca;
	this.modelo = modelo;
	this.tipoSistema=tipoSistema;
	this.tamano = tamano;
	this.almacenamiento = almacenamiento;
	
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String isTipoSistema() {
	return tipoSistema;
}

public void setTipoSistema(String tipoSistema) {
	this.tipoSistema = tipoSistema;
}

public double getTamano() {
	return tamano;
}

public void settamano(double tamano) {
	this.tamano = tamano;
}

public int getAlmacenamiento() {
	return almacenamiento;
}

public void setAlmacenamiento(int almacenamiento) {
	this.almacenamiento = almacenamiento;
}

@Override
public String toString() {
	return "celular [marca=" + marca + ", modelo=" + modelo + " tipoSistema=" + tipoSistema
			+ ", tamano=" + tamano + ", almacenamiento=" + almacenamiento + "]";
}

public void datosAndroid() {
	// TODO Auto-generated method stub
	
}

public void datosAple() {
	// TODO Auto-generated method stub
	
}

}
