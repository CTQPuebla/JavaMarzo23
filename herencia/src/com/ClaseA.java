package com;

public class ClaseA {
	 public int x;
	 private String y;
	 protected double z;
	 byte yy;
	 
	 static final long numeroGrande = 648743212; 
	 
	 public ClaseA() {
	  
	 }
	 public ClaseA(int x, String y, double z) {
	  this.x = x;
	  this.y = y;
	  this.z = z;
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
	 
	 
	 public byte getYy() {
	  return yy;
	 }
	 public void setYy(byte yy) {
	  this.yy = yy;
	 }
	 @Override
	 public String toString() {
	  return "claseA [x=" + x + ", y=" + y + ", z=" + z + ", yy=" + yy + "]";
	 }
	 
	 public void cualquierCosa () {
	  System.out.println("Mensaje desde clase A");
	 }
}
