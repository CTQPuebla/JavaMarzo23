package com;

public class principaLvr {
	public static void main(String[] args) {
		
		celular t1=new android("samsung","a33","android 11",10,32,"local",2022,"velaz@gmail.com");
		celular t2=new aple("aple","iphone 11","IOS 11",10.5,32,2022,2,"si");
		//celular t2=new celular("lg","2010","android",6.5,64);
		
		
		
		t1.datosAndroid();
		System.out.println("\n");
		t2.datosAple();
//	  System.out.println(t1);
//		System.out.println(t2);	
//		celular t3= new celular();
//		t3.setAlmacenamiento(264);
//		t3.setMarca("lg");
		
//		
//		System.out.println(t3);
		
		
	}

}
