package com.chatgpt.Exercicios.Triangulo;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado: ");
		int primeiroLado = scan.nextInt();
		
		System.out.println("Digite o segundo lado: ");
		int segundoLado = scan.nextInt();
		
		System.out.println("Digite o terceiro lado: ");
		int terceiroLado = scan.nextInt();
		
		boolean triangulo = (primeiroLado + segundoLado) > terceiroLado && (primeiroLado + terceiroLado) > segundoLado && (terceiroLado + segundoLado) > primeiroLado;
		boolean equilatero = primeiroLado == segundoLado && segundoLado == terceiroLado;
		boolean escaleno = primeiroLado != segundoLado && segundoLado != terceiroLado && primeiroLado != terceiroLado;
		
		System.out.println("É um TRIÂNGULO: " + triangulo);
		System.out.println("O triângulo é EQUILATERO? " + equilatero);
		System.out.println("O triângulo é ESCALENO? " + escaleno);
		
		scan.close();	
	}
}
