package com;

public class Principal {

	public static void main(String[] args) {
		
		
		//Creacion de objeto
		ClaseA a = new ClaseA();
		
		ClaseB b = new ClaseB();
		
		a.setYy( (byte) 27);
		System.out.println(a);
		
		b.setYy( (byte) 15);
		System.out.println(a);
		
		a.cualquierCosa();
		b.cualquierCosa();
		
		
	}
}
