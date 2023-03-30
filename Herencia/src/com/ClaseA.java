package com;

public final class ClaseA {

	public int x;
	private String y;
	protected double z;
	
	// final - crear miembros inmutables
	static final long numeroGrande = 9559595959L; //constante, no va a cambiar en la ejecución
	
	
	
	
	byte yy;
	
	public ClaseA() {
		
	}

	public ClaseA(int x, String y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static long getNumerogrande() {
		return numeroGrande;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "ClaseA [x=" + x + ", y=" + y + ", z=" + z + ", yy=" + yy + "]";
	}

	public byte getYy() {
		return yy;
	}

	public void setYy(byte yy) {
		this.yy = yy;
	}
	
	
	//Metodo nativo de la clase A
	public final void cualquierCosa() {
		System.out.println("Mensaje desde la clase A");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
