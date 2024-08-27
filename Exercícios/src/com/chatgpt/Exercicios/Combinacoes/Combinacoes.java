package com.chatgpt.Exercicios.Combinacoes;

import java.util.Iterator;

public class Combinacoes {
	public static void main(String[] args) {
		int contador1, contador2;
		
		for (contador1 = 1; contador1 <= 3; contador1++) {
			for (contador2 = 0; contador2 < 3; contador2++) {
				System.out.print(contador1 + ", " + contador2 + " | ");
			}
			
			System.out.println();
		}
	}
}
