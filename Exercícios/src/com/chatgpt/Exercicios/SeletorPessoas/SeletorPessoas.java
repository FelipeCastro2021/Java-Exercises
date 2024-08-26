package com.chatgpt.Exercicios.SeletorPessoas;

import javax.swing.JOptionPane;

public class SeletorPessoas {
	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("    SELETOR DE PESSOAS      ");
		System.out.println("=========================================");

		String resposta = "S";

		int totalH = 0, totalM = 0;

		do {
			String msg = JOptionPane.showInputDialog("Qual o sexo: [H/M]");
			char sexo = msg.charAt(0);

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade: "));

			int corCabelo = Integer.parseInt(
					JOptionPane.showInputDialog("[1] Preto" + "\n[2] Castanho" + "\n[3] Loiro" + "\n[4] Ruivo"));

			if (sexo == 'H' && idade >= 18 && corCabelo == 2) {
				totalH++;
			}

			if (sexo == 'M' && idade >= 25 && idade <= 30 && corCabelo == 3) {
				totalM++;
			}

			resposta = JOptionPane.showInputDialog("Quer continuar: [S/N]");
		} while (!resposta.equals("N"));

		System.out.println("==================");
		System.out.println(" RESULTADO FINAL");
		System.out.println("==================");
		System.out.println("O Total de homens com mais de 18 anos e cabelos castanhos é: " + totalH);
		System.out.println("O Total de mulheres entre 25 e 30 anos e loiras é: " + totalM);
	}
}
