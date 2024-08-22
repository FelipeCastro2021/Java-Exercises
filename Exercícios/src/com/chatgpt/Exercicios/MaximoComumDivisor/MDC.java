package com.chatgpt.Exercicios.MaximoComumDivisor;

import javax.swing.JOptionPane;

public class MDC {
	public static void main(String[] args) {
		int contador = 0;

		do {
			contador = Integer
					.parseInt(JOptionPane.showInputDialog("Digite um número: " + ""
							+ "\n1 - Cadastrar números" 
							+ "\n0 - Sair"));

			switch (contador) {
			case 1:
				int i = Integer.parseInt(JOptionPane.showInputDialog("Quantos números quer cadastrar: "));

				int[] numeros = cadastrarNumeros(i);
				int mdc = calcularMDC(numeros);
				imprimirMDC(numeros, mdc);
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Você não inseriu uma opção válida");
				break;
			}
		} while (contador != 0);

	}

	public static int calcularMDC(int[] numeros) {
		if (numeros.length == 0) {
			throw new IllegalArgumentException("O array de números não pode estar vazio.");
		}
		
		int resultado = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			resultado = mdc(resultado, numeros[i]);
		}

		return resultado;
	}
	
	public static int mdc(int numero1, int numero2) {
		while (numero2 != 0) {
			int resto = numero1 % numero2;
			numero1 = numero2;
			numero2 = resto;
		}
		
		return numero1;
	}

	public static int[] cadastrarNumeros(int contador) {
		int[] array = new int[contador];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número: "));
		}

		return array;
	}

	public static void imprimirMDC(int[] numeros, int mdc) {
		System.out.print("Os números cadastrados são: ");
		
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		
		System.out.println();
		System.out.println("O MDC dos números é: " + mdc);
	}
}
