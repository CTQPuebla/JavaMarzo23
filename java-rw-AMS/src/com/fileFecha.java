package com;

import java.io.File;
import java.io.FileWriter;

public class fileFecha {
public static void main(String[] args) {
	
	try {
	File archivo = new File("C:\\Users\\Ware\\Desktop\\fecha.txt");
	String fecha = "03101990";
	String dia =  (fecha.substring(0, 2));
	String mes = (fecha.substring(2, 4));
	String year = fecha.substring(4);
	
	switch(dia){
	//String day;
	case "01": dia = "Uno"; break; case "02": dia= "Dos"; break; case "03": dia ="Tres"; break; case "04": dia= "Cuatro"; break;
	case "05": dia= "Cinco"; break; case "06": dia= "Seis"; break; case "07": dia = "Siete"; break; case "08": dia= "Ocho"; break;case "09": dia= "Nueve"; break;
	case "10": dia= "Diez"; break; case "11": dia= "Once"; break; case "12": dia= "Doce"; break; case "13": dia= "Trece"; break; case "14": dia= "Catorce"; break;
	case "15": dia= "Quince"; break; case "16": dia= "Dieciseis"; break; case "17": dia= "Diecisiete";break; case "18": dia= "Diecisiocho";break; case "19": dia= "Diecinueve";break;
	case "20": dia= "Veinte";break; case "21": dia= "Veitiuno";break; case "22": dia= "Veitidos";break; case "23": dia= "Veititres";break; case "24": dia= "Veiticuatro";break;
	case "25": dia= "Veiticinco";break; case "26": dia= "Veitiseis";break; case "27": dia= "Veitisiete";break; case "28": dia= "Veitiocho";break; case "29": dia= "Veitinueve";break;
	case "30": dia= "Treinta";break; case "31": dia= "Treinta y uno";break;
	default:
		dia=  "";
 }
	
	switch(mes){
	//String day;
	case "01": mes = " de Enero"; break; case "02": mes= "de Febero"; break; case "03": mes ="de Marzo"; break; case "04": mes= "de Abril"; break;
	case "05": mes= "de Mayo"; break; case "06": mes= "de Junio";break; case "07": mes = "de Julio"; break; case "08": mes= "de Agosto"; break; case "09": mes= "de Septiembre"; break;
	case "10": mes= "de Octubre"; break; case "11": mes= "de Noviembre"; break; case "12":mes= "de Diciembre"; break;
		default: mes=  "";
 }
		
	FileWriter line = new FileWriter(archivo, true);
	line.write(dia+" "+mes+" de "+ year+"\n");
	//line.write(mes);
	line.close();
		
	}catch (Exception ex) {
		
	}//fin de catch
}// fin de metodo main
}// fin de clase
