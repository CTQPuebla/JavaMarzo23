package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerA {
	public static void main(String[] args) {

		String linea = "";
		try {

		
		
			File archivo = new File("C:\\Users\\Ware\\Desktop\\nostasimple.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fr); 

			while ((linea = buffer.readLine()) != null) {
				System.out.println("Linea: " + linea);
			}
		} catch (Exception ex) {
			
			//ex.printStackTrace();

		}

	}
}
