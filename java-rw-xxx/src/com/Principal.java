package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class Principal {
	public static void main(String[] args) {
		String linea = ""; // Comodin
		try {
			File lectura = new File("C:\\Users\\César\\Desktop\\fechasnumeros.txt");
			File escritura = new File("C:\\Users\\César\\Desktop\\fechasletras.txt");
			FileReader fr = new FileReader(lectura);
			BufferedReader buffer = new BufferedReader(fr);
			FileWriter line = new FileWriter(escritura, false);
			while ((linea = buffer.readLine()) != null) {	
				line.write(cifrar(linea)+"\n");
			}  line.close();
		} catch (Exception ex) { ex.printStackTrace(); }
	}
	public static String cifrar(String linea) {
		String[] dias = { "Primero", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Once",
				"Doce", "Trece", "Catorce", "Quince", "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve", "Veinte",
				"Veintiuno", "Veintidos", "Veintitres", "Veinticuatro", "Veinticinco", "Veintiseis", "Veintisiete","Veintiocho",
				"Veintinueve", "Treinta", "Treintaiuno" };
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		int dia = Integer.parseInt(linea.substring(0, 2));
		int mes = Integer.parseInt(linea.substring(2, 4));
		return dias[dia-1]+ " de "+meses[mes-1] + " de " + linea.substring(4, linea.length());
	}
}
