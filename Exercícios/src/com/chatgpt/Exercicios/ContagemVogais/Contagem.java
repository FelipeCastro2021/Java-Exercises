package com.chatgpt.Exercicios.ContagemVogais;

import javax.swing.JOptionPane;

public class Contagem {
	public static void main(String[] args) {
		// Contagem de Vogais: 
		// Escreva um programa que conte o número de vogais em uma palavra.
		
		String palavra = JOptionPane.showInputDialog("Insira uma palavra: ");
		int contador = 0;
		
		for (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.toUpperCase().charAt(i);
			if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
				contador++;
			}
		}
		
		System.out.println("Na palavra: " + palavra + " há " + contador + " vogais");
	}
}
