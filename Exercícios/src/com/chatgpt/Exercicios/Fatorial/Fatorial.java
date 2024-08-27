package com.chatgpt.Exercicios.Fatorial;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para fazer o fatorial: ");
		int numero = scan.nextInt();
		int total = 1;
		
		for (int i = 1; i <= numero; i++) {
			total *= i;
			
			if (i == numero) {
				System.out.print(i + " = ");
				break;
			}
			
			System.out.print(i + " * ");
		}
		
		System.out.println(total);
		
		scan.close();
	}
}
