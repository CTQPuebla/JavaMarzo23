package com;

//Sirve para especializar modelos, hacer concreciones

public class ClaseB extends ClaseA{

	float a;
	boolean b;
	char c;
	
	byte yy;
	
	public ClaseB() {
			
	}

	public ClaseB(float a, boolean b, char c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "ClaseB [a=" + a + ", b=" + b + ", c=" + c + ", yy=" + yy + "]";
	}

	public byte getYy() {
		return yy;
	}

	public void setYy(byte yy) {
		this.yy = yy;
	}
	
//	@Override
	public void cualquierCosa() {
	System.out.println("Mensaje desde la clase B");
	
}
}