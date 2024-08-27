package com.chatgpt.Exercicios.CampeonatoFutebol;

import javax.swing.JOptionPane;

public class Futebol {
	public static void main(String[] args) {
		String[] times = new String[3];
		System.out.println("------------------");
		System.out.println("CAMPEONATO FUTEBOL");
		System.out.println("------------------");
		
		for (int i = 0; i < times.length; i++) {
			times[i] = JOptionPane.showInputDialog("Digite um time de futebol: ");
		}
		
		System.out.println("------------------");
		System.out.println("TABELA DE PARTIDAS");
		System.out.println("------------------");
		
		for (int i = 0; i < times.length; i++) {
			for (int j = 0; j < times.length; j++) {
				if (i != j) {
					System.out.println(times[i] + "[ ] X [ ]" + times[j]);
				}
			}
		}
	}
}
