package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EjercicioFechas_lavp {
	public static void main(String [] args) {
		 String linea = "";
		 int index =0; 
		 String[] dia = new String[] {"0","Primero","Segundo","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Vieciocho","Dieciinueve","Veinte","Veintiuno","Veintidos","Vientitres","Veinticuatro","Veinticino","Veintiseis","Veintisiete","Veintiocho","Veintinueve","Terinta","Treinta y uno"};
		   
		 try {
			  File archivo = new File ("C:\\Users\\Pichardo\\Desktop\\notasimple.txt"); // Representacion del archivo en memoria
			  FileReader fr = new FileReader(archivo); // Sabe leer el archivo
			  BufferedReader buffer = new BufferedReader(fr); // Lee el contenido del archivo 
			  
			  while ((linea = buffer.readLine()) != null) {
				  index++;
				  System.out.println("Linea: " + linea);  }
			  
			  
//			  String abc = "\nabcdefghi"; 
//			   FileWriter line = new FileWriter(archivo, true); 
//			    
//			   for (int i = 0; i <abc.length(); i++) { 
//			     
//			    line.write(abc.charAt(i)); 
//			   } 
//			   line.close();
			  
			  
			 } catch (Exception ex) {

			 }
		 System.out.println("Cantidad de lineas = "+index);
		 System.out.println(dia.);
		
	}
}
