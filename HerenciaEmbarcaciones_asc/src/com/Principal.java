package com;

import java.util.Scanner;

public class Principal extends Velero {
	
	public Principal(String nombre, String tipoEmbarcacion, String marca, int modelo, int longitudPies,
			String combustible, int torqueHp, int cantidadCamarotes, int cantidadVelas, String tipoQuilla) {
		super(nombre, tipoEmbarcacion, marca, modelo, longitudPies, combustible, torqueHp, cantidadCamarotes, cantidadVelas,
				tipoQuilla);
	}
	public static void main(String[] args) {
		Embarcacion arrayEmbarcaciones[] = new Embarcacion[6];
		arrayEmbarcaciones[0] = new Yate("Pichos III","Yate","Princess",2014,72,"Diesel",3240,5);
		arrayEmbarcaciones[1] = new Yate("Ti Amo","Yate","Azimut",2018,90,"Diesel",3860,7);
		arrayEmbarcaciones[2] = new Velero("Mahala","Velero","Beneteau",1946,45,"Diesel",120,2,2,"Recta");
		arrayEmbarcaciones[3] = new Velero("Siete Mares","Velero","Beneteau",1985,65,"Diesel",180,3,3,"De Bulbo");
		arrayEmbarcaciones[4] = new Lancha("Ximaro","Lancha","SunSeeker",2022,54,"Gasolina",2860,1,"En V");
		arrayEmbarcaciones[5] = new Lancha("La Rana","Lancha","Boston",2005,48,"Gasolina",1680,1,"Fondo Plano");

		String nombre;
		boolean noExiste = true;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Introduzca el nombre de la embarcación, tal como aparece en su factura o pedimento de importación:");
		nombre = sc.nextLine();
		for(int i = 0; i < arrayEmbarcaciones.length; i++) {
			
			if((arrayEmbarcaciones[i].getNombre().contains(nombre)&&(arrayEmbarcaciones[i].getTipoEmbarcacion().contains("Yate")))) {
			arrayEmbarcaciones[i].datos();
			i=arrayEmbarcaciones.length;
			noExiste = false;
			}else if((arrayEmbarcaciones[i].getNombre().contains(nombre)&&(arrayEmbarcaciones[i].getTipoEmbarcacion().contains("Velero")))) {
			arrayEmbarcaciones[i].datos();
			noExiste = false;
			i=arrayEmbarcaciones.length;
			}else if((arrayEmbarcaciones[i].getNombre().contains(nombre)&&(arrayEmbarcaciones[i].getTipoEmbarcacion().contains("Lancha")))) {
				arrayEmbarcaciones[i].datos();
				noExiste = false;
				i=arrayEmbarcaciones.length;
		    }else if(i == arrayEmbarcaciones.length-1) {				    	
		    	System.out.println("Su embarcación no se encuentra en nuestra flota"); 	
		    }
	}
  }
}
