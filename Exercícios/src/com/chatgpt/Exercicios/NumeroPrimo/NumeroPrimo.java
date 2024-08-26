package com.chatgpt.Exercicios.NumeroPrimo;

import javax.swing.JOptionPane;

public class NumeroPrimo {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um número: "));
		int contador = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}	
		
		if (contador == 2) {
			System.out.println("É um número primo");
		} else {			
			System.out.println("Não é um número primo");
		}
	}
}
