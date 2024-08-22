package com.chatgpt.Exercicios.Fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int iteracoes = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de repetições: "));
		
		int num1 = 0;
		int num2 = 1;
		
		for (int i = 0; i < iteracoes; i++) {
			System.out.print(num1 + " ");
			
			int proximoNumero = num1 + num2;
			num1 = num2;
			num2 = proximoNumero;
		}
	}
}
