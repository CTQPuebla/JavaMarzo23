package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		e1.setVivo(true);
		e1.setNombre("Miguel Angel Alvarez");
		e1.setFechaNac("24/Oct/88");
		e1.setArea("2");
		e1.Identidad();
		
		System.out.println(e1);
		e1.Alive();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Porfavor ingrese el numero de estudiantes a inscribir: ");
		int x = sc.nextInt();
		sc.nextLine();
		String algo;
		Estudiante arrayEstudiante[] = new Estudiante[x];
		for(int i = 0; i < arrayEstudiante.length; i++) {
			System.out.println("Ingresa el monbre del alumno "+i+":");
			algo = sc.nextLine();
			System.out.println(algo);
			arrayEstudiante[i].setNombre(algo);
		}
		do {
			for(int i = 0; i < x; i++) {
				System.out.println("El monbre del alumno "+(i+1)+":");
				arrayEstudiante[i].getNombre();
			}
		}while(true);
		
		
		
	}
}
