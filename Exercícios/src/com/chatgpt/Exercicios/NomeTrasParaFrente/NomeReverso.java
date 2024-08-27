package com.chatgpt.Exercicios.NomeTrasParaFrente;

import javax.swing.JOptionPane;

public class NomeReverso {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Type your name: ");
		
		for (int i = nome.length() - 1; i >= 0; i--) {
			System.out.print(nome.charAt(i));
		}
	}
}
