package com.chatgpt.Exercicios.AptoDirigir;

import java.util.Scanner;

public class Dirigir {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==============================="
				+ "\n DEPARTAMERNTO DE TRÂNSITO"
				+ "\n===============================");
		
		System.out.println("Ano Atual (yyyy): ");
		int anoAtual = scan.nextInt();
		System.out.println("Ano de Nascimento (yyyy): ");
		int anoNasc = scan.nextInt();
		int idade = anoAtual - anoNasc;
		boolean aptoTirarCarteira = idade >= 18;
		
		System.out.println("---------- STATUS ----------");
		System.out.println(" IDADE: " + idade + " ANOS");
		
		if (aptoTirarCarteira) {
			System.out.println(" APTO A TIRAR CARTEIRA");
		} else {
			System.out.println(" NÃO ESTÁ APTO A TIRAR A CARTEIRA");
		}
		
		
		System.out.println("----------------------------");
		
		scan.close();
	}
}
