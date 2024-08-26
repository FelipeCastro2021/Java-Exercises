package com.chatgpt.Exercicios.ContagemInteligente;

import javax.swing.JOptionPane;

public class Contagem {
	public static void main(String[] args) {
		System.out.println("CONTAGEM INTELIGENTE");
		System.out.println("--------------------");
		
		int inicio = Integer.parseInt(JOptionPane.showInputDialog("Inicio: "));
		int fim = Integer.parseInt(JOptionPane.showInputDialog("Fim: "));
		
		System.out.println(" CONTANDO ");
		System.out.println("--------------------");
		
		if (inicio < fim) {
			contagemProgressiva(inicio, fim);
		} else {
			contagemRegressiva(inicio, fim);
		}
	}
	
	public static void contagemProgressiva(int inicio, int fim) {
		for (int i = inicio; i <= fim; i++) {
			System.out.println(" " + i + "..");
		}
	}
	
	public static void contagemRegressiva(int inicio, int fim) {
		for (int i = inicio; i >= fim; i--) {
			System.out.println(" " + i + "..");
		}
	}
}
