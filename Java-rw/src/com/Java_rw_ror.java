package com;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class Java_rw_ror {
	public static void main(String[] args) {
		String linea = "";
		String[] dia = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta", "treinta y uno"};
		String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		int d, m;
		try {
			File archivo = new File("C:\\Users\\raul_\\OneDrive\\Escritorio\\Ceteq\\fechas.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fr);
			File f = new File("C:\\Users\\raul_\\OneDrive\\Escritorio\\Ceteq\\fechasEscritas.txt");
			FileWriter fw = new FileWriter(f, true);
			while((linea = buffer.readLine()) != null) {
				d = Integer.parseInt(linea.substring(0, 2));
				m = Integer.parseInt(linea.substring(2, 4));
				fw.write(dia[d-1] + " de " + mes[m-1] + " de " + linea.substring(4, 8) + "\n");
			}
			fw.close();
			buffer.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}