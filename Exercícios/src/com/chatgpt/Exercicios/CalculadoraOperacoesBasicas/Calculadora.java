package com.chatgpt.Exercicios.CalculadoraOperacoesBasicas;

import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		// Calculadora com Operações Básicas:
		// Escreva um programa que implemente uma calculadora que realiza as operações
		// básicas (soma, subtração, multiplicação e divisão).

		int resposta;
		int num1 = 10;
		int num2 = 2;

		do {
			resposta = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA DAS OPÇÕES: " + "\n1 - Soma"
					+ "\n2 - Subtração" + "\n3 - Multiplicação" + "\n4 - Divisão" + "\n0 - Sair"));

			switch (resposta) {
			case 1:
				soma(num1, num2);
				break;
			case 2:
				subtracao(num1, num2);
				break;
			case 3:
				multiplicacao(num1, num2);
				break;
			case 4:
				divisao(num1, num2);
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção selecionada é inválida!");
				break;
			}
		} while (resposta != 0);
	}
	
	public static void soma(int num1, int num2) {
		int soma = num1 + num2;
		System.out.println("Soma de " + num1 + " + " + num2 + " = " + soma);
	}
	
	public static void subtracao(int num1, int num2) {
		int subtracao = num1 - num2;
		System.out.println("Subtração de " + num1 + " - " + num2 + " = " + subtracao);
	}
	
	public static void multiplicacao(int num1, int num2) {
		int multiplicacao = num1 * num2;
		System.out.println("Multiplicação de " + num1 + " * " + num2 + " = " + multiplicacao);
	}
	
	public static void divisao(int num1, int num2) {
		double divisao = (double) num1 / num2;
		System.out.println("Divisão de " + num1 + " / " + num2 + " = " + divisao);
	}
}
