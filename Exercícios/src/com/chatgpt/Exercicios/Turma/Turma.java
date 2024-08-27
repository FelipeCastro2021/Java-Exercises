package com.chatgpt.Exercicios.Turma;

import java.util.Scanner;

public class Turma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] nomes = new String[4];
		int[] notas1 = new int[4];
		int[] notas2 = new int[4];
		double[] media = new double[4];
		double somaMedia = 0;
		double mediaTurma = 0;
		int totalAulunosAcimaMedia = 0;
		
		for (int i = 0; i < media.length; i++) {
			System.out.println("Type your name: ");
			nomes[i] = scan.next();
			
			System.out.println("Type your first grade: ");
			notas1[i] = scan.nextInt();
			
			System.out.println("Type your second grade: ");
			notas2[i] = scan.nextInt();
			
			media[i] = ((double) (notas1[i] + notas2[i]) / 2);
			somaMedia += media[i];
		}
		
		System.out.println("==========================");
		System.out.println("LISTAGEM DE ALUNOS");
		System.out.println("==========================");
		mediaTurma = somaMedia / media.length;
		
		for (int i = 0; i < media.length; i++) {
			System.out.println(nomes[i] + " " + media[i]);
			System.out.println("==========================");
			
			if (media[i] > mediaTurma)totalAulunosAcimaMedia++;
		}
		
		System.out.println("Soma das Médias: " + somaMedia);
		System.out.println("Média das turmas: " + mediaTurma);
		System.out.println("==========================");
		System.out.println("Quantidade de alunos com a nota acima da média da turma: " + totalAulunosAcimaMedia);
		
		scan.close();
	}
}
