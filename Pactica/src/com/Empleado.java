package com;

public class Empleado extends Persona{
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	
	
	
	
	public Empleado(String nombre, double sueldo) {
		super(nombre);
		this.idEmpleado = ++Empleado.contadorEmpleado;
		this.sueldo = sueldo;
		
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(idEmpleado);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
	
	
	
	

}
