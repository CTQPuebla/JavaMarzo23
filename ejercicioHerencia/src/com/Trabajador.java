package com;

public class Trabajador extends Personas {

	
	protected int codigoTrabajador;
	protected double sueldo;
	protected String cargo;
	
	
	
	
	
	
 public Trabajador (String nombre, int edad, double peso, String nacionalidad, int codigoTrabajador, double sueldo, String cargo) {
	 super(nombre, edad, peso, nacionalidad);
	 this.codigoTrabajador = codigoTrabajador;
	 this.sueldo = sueldo;
	 this.cargo = cargo;	 
 }
	
 public void mostrarDatos (){
	 
	 System.out.println("Nombre: "+ getNombre() +
			"\nEdad: "+ getEdad() +
			"\nPeso: " + getPeso() +
			"\nNacionalidad: " + getNacionalidad () +
			"\nCodigo del Trabajador: " + codigoTrabajador +
			"\nSueldo: " + sueldo +
			"\nCargo: " + cargo);
	 
 }
	
 
 
 
 
}
