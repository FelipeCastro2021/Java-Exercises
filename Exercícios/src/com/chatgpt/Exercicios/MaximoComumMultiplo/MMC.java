package com.chatgpt.Exercicios.MaximoComumMultiplo;

import java.util.Scanner;

public class MMC {
	protected static Scanner scan;
	
	public static void main(String[] args) {	
		scan = new Scanner(System.in);
		int contador = 0;

		do {
			System.out.println("============== ESCOLHA UMA DAS OPÇÕES ================" + "\n1 - Cadastrar Números"
					+ "\n0 - Sair");
			contador = MMC.scan.nextInt();

			switch (contador) {
			case 1:
				System.out.println("Quantos números irá cadastrar: ");
				int i = scan.nextInt();

				int[] array = cadastrarArray(i);

				int contador2 = 0;

				do {
					System.out.println("=================== ESCOLHA UMA DAS OPÇÕES ==================="
							+ "\n1 - MDC"
							+ "\n2 - MMC"
							+ "\n0 - Sair");
					contador2 = scan.nextInt();

					switch (contador2) {
					case 1:
						int mdc = calcularMDC(array);
						imprimirResultado(array, mdc);
						break;
					case 2:
						int mmc = mmc(array);
						imprimirResultado(array, mmc);
						break;
					case 0:
						System.out.println("Saindo...");
						break;
					default:
						System.out.println("Você escolheu uma opção inválida");
						break;
					}
				} while (contador2 != 0);
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Nenhuma das opções é válida");
				break;
			}
		} while (contador != 0);
		
		scan.close();
	}
	
	public static int[] cadastrarArray(int contador) {
		int[] array = new int[contador];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Insira um número: ");
			array[i] = scan.nextInt();
		}
		
		return array;
	}

	public static int mmc(int[] array) {
		if (array == null) {
			throw new IllegalArgumentException("O array de números não pode estar vazio.");
		}
		
		int total = 1;
		
		for (int i = 0; i < array.length; i++) {
			total *= array[i];
		}
		
		return total / calcularMDC(array);
	}

	public static int calcularMDC(int[] array) {
		if (array == null) {
			throw new IllegalArgumentException("O array de números não pode estar vazio.");
		}
		
		int resultado = array[0];
		
		for (int i = 1; i < array.length; i++) {
			resultado = mdc(resultado, array[i]);
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
	
	public static void imprimirResultado(int[] array, int resultado) {
		System.out.print("Números cadastrados: ");
		
		for (int element : array) {
			System.out.print(element + " ");
		}
		
		System.out.println();
		System.out.println("Resultado: " + resultado);
	}
}
