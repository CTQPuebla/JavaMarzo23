package com;

import java.util.Arrays;

public class Principal {
   public static void main(String[] args) {
	   
	   /*
	    * 
	    */
	   //Array2D                    filas - columnas
	   String [][] matriz = new String[4][5];
	   
	   System.out.println(Arrays.deepToString(matriz));
	   
	   //Agregar valor manualmente
	   matriz[0][0] = "x";
	   matriz[3][3] = "y";
	   System.out.println(Arrays.deepToString(matriz));
	   
	   System.out.println(matriz[2][3]);
	   //Declarar una matriz llena desde el inicio
	   int[][] numeros = { {10,20,30},
			               {5,15,25},
			               {60,70,80},
			               {55,65,75} }; 
	   //4x3
	   
	   int[][] dummy = new int[5][3];
	   
	   
	   //Itera sobre las filas
	   for (int i = 0; i < dummy.length; i++) {
		   
		//Iterar sobre columnas
		 for (int j = 0; j < dummy[i].length; j++) {
			
		System.out.println(i + "-"+j);
		 }
		 System.out.println();
	   }
	   
   }
}
