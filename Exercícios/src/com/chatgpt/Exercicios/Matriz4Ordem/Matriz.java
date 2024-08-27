package com.chatgpt.Exercicios.Matriz4Ordem;

public class Matriz {
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int somaDiagonal = 0;
		int produtoLinha2 = 1;
		int maiorColuna3 = matriz[0][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i + 1;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
				if (i == j) { 
					somaDiagonal += matriz[i][j];
				}
			}
			
			System.out.println();
		}
		
		for (int i = 0; i < matriz.length; i++) {
			produtoLinha2 *= matriz[1][i]; 
		}
		
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][3] > maiorColuna3) {
				maiorColuna3 = matriz[i][3]; 
			}
		}
		
		System.out.println("Soma da diagonal da matriz: " + somaDiagonal);
		System.out.println("O produto dos valores da Segunda Linha: " + produtoLinha2);
		System.out.println("O maior valor da 3º coluna: " + maiorColuna3);
	}
}
