package com.chatgpt.Exercicios.OrdenacaoVetor;

import java.util.Scanner;

public class OrdenacaoVetor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[4];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = scan.nextInt();
		}
		
		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[i] > numeros[j]) {
					int copia = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = copia;
				}
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		scan.close();
	}
}
