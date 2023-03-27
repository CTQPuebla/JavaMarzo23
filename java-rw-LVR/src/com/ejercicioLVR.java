package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ejercicioLVR {
	public static void main(String[] args) {
		int n;
		int m;
		String linea = "";
		String[] num= {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce"};
		String[] mes= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		
		
		try {
		  File archivo = new File("C:\\Users\\ThinkPad\\Desktop\\numeros.txt"); // Representacion del archivo en memoria  
		  FileReader fr = new FileReader(archivo); // Sabe leer el archivo
		  BufferedReader buffer = new BufferedReader(fr); // Lee el contenido del archivo  
		  File archivo2 = new File("C:\\Users\\ThinkPad\\Desktop\\letra.txt");
		  FileWriter fw = new FileWriter(archivo2,true); 
		  
		  while ((linea = buffer.readLine()) != null) {
			  n=Integer.parseInt(linea.substring(0,2));
			  m=Integer.parseInt(linea.substring(2,4));
			  fw.write(num[n-1] + "de" + mes[m-1] + "de" + linea.substring(4,0) +"\n");
	    
 }	  
	fw.close();
	buffer.close();
		}catch(Exception e) {
			e.getStackTrace();
	
			
		}
		
		
	}	
		
	}


