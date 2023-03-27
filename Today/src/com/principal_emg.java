package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;



public class principal_emg {
	
	public static void main(String[] args) throws Exception {
		
		
		
		// PROGRAMA PARA IMPRIMIR LO QUE HYA EN UN BLOG DE NOTAS AQUI
		
		 String linea = "";
		 try {
		  File archivo = new File("C:\\Users\\Ceteq\\Desktop\\notasimple.txt");
		 FileReader fr = new FileReader(archivo);
		  BufferedReader buffer = new BufferedReader(fr); // Lee el contenido del archivo  while ((linea = buffer.readLine()) != null) {
		 File archivo1 = new File ("C:\\Users\\Ceteq\\Desktop\\fechas.txt");
		 FileWriter linea2 = new FileWriter(archivo1, true); 
		  
		 
		  while ((linea = buffer.readLine()) != null ) {
			  System.out.println("Linea "+ linea);
			  
			 String dia = linea.substring(0,2);
			 String mes = linea.substring(2,4);
			 String ano = linea.substring(4,8);
			 
			 
			 int dia1 = Integer.parseInt(dia);
			 int mes1 = Integer.parseInt(mes);
		
			 
			 String [] d = {"uno","dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho","nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciseis","diecisiete", "dieciocho", "diecinueve", "veinte","veintiuno","ventidos", "veintitres", "veinticuatro", "veinticinco", "veinteseis", "veintisiete", "veintiocho", "veintinueve", "treinta", "treninta y uno" };
			 String [] m = {"enero", " febrero", " marzo", " abril", " mayo", " junio", " julio", " agosto", " septiembre", " octubre", " noviembre", " diciembre"};
			 
			 
			System.out.println("Dia "+ d[dia1-1] + " del mes" + m[mes1-1] + " del año "+ ano);
			linea2.write("Dia "+ d[dia1-1] + " del mes" + m[mes1-1] + " del año "+ ano+"\n");
			
			
		  }
				
					linea2.close();
					buffer.close();
					
			
		  }   catch (Exception e) {
			  e.getStackTrace();
		  
		  }
	}
}



		 
	
// -------------------------------------------------------------

//			programa para caso contrario.

//
//		
//String abc = "abcdefghi"; 
//FileWriter line = new FileWriter(archivo, true); 
// 
//for (int i = 0; i <abc.length(); i++) { 
//  
// line.write(abc.charAt(i)); 
//} 
//line.close();

//--------------------------------------------------------
		 
		 
		 
		 
				 
		  
		  
		  
		

			 
		
			 
			 
		 
		 

	

	








	
	
