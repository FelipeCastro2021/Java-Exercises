package com.chatgpt.Exercicios.Palindromo;

import javax.swing.JOptionPane;

public class Palindromo {
	public static void main(String[] args) {
		// Palíndromo: 
		// Escreva um programa que determine se uma palavra é um palíndromo (lê-se da mesma forma de trás para frente).
		
		String palavra = JOptionPane.showInputDialog("Escreva uma palavra: ");
		String palavraInvertida = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			palavraInvertida += palavra.charAt(i);
		}
		
		System.out.print("A palavra " + palavra + " é um palíndromo (lê-se da mesma forma de trás para frente): ");
		
		if (palavra.toLowerCase().equals(palavraInvertida.toLowerCase())) {
			System.out.println("É um palíndromo");
			System.out.println("Palavra: " + palavra + " | Palavra Invertida: " + palavraInvertida);
		} else {
			System.out.println("Não é um palíndromo");
			System.out.println("Palavra: " + palavra + " | Palavra Invertida: " + palavraInvertida);
		}
	}
}
