package com.educacionit;

import java.util.Scanner;

public class Ejercicio02_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float grados;
		String tiempo;
				
		do {		
			System.out.print("Ingrese la temperatura en °: ");
			grados = scanner.nextFloat();
		
			System.out.print("Ingrese el tiempo (Cancelar para finalizar): ");
			tiempo = scanner.next();
		
			char [] toLowerCase = new char [tiempo.length()];
		
			for (int contador = 0; contador < tiempo.length(); contador++) {
				char unCaracter = tiempo.charAt(contador);
			
				if (unCaracter >= 'A' && unCaracter <= 'Z') {
					toLowerCase[contador] = (char)(unCaracter +32);
				} else { 
					toLowerCase[contador] = unCaracter;
				}
			}
		
			tiempo = new String (toLowerCase);
		
			if (tiempo.equals("cancelar")) {
				continue;
			
			} if (grados > 25 && tiempo.equals("soleado")) {
				System.out.println("\nEl tiempo es soleado. Se sugiere salir a caminar y tomar sol.\n");
			} else if (grados > 15 && grados <=25 && tiempo.equals("soleado")) {
				System.out.println("\nEl tiempo es soleado. Se sugiere salir a caminar.\n");
			} else if (grados > 10 && grados <=15 && tiempo.equals("soleado")) {
				System.out.println("\nEl tiempo es soleado. Se sugiere salir a caminar con campera.\n");
			} else if (grados <=10 && tiempo.equals("lluvia")) {
				System.out.println("\nEl tiempo es lluvioso. Se sugiere quedarse en casa o salir con paraguas y campera.\n");
			} else if (grados <=10 && tiempo.equals("nieve")) {
				System.out.println("\nEl tiempo es nevado. Se sugiere salir a esquiar.\n");
			} 	
		} while (!tiempo.equals("cancelar"));
		System.out.println("Finalizado");
		
		scanner.close();
	}
}
