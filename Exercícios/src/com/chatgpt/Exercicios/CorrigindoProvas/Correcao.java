package com.chatgpt.Exercicios.CorrigindoProvas;

import javax.swing.JOptionPane;

public class Correcao {
	public static void main(String[] args) {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de questões: "));
		String[] gabarito = new String[quantidade];
		
		int quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos: "));
		String[] nomes = new String[quantidadeAlunos];
		
		String[] respostas = new String[quantidade];
		double[] media = new double[quantidadeAlunos];
		double somaMedia = 0;
		
		System.out.println("PASSO 1 - Cadastro de Gabarito");
		System.out.println("------------------------------");
		
		for (int i = 0; i < gabarito.length; i++) {
			gabarito[i] = JOptionPane.showInputDialog("Questão " + (i+1) + ": ");
			System.out.println("Questão " + (i+1) + ": " + gabarito[i]);
		}
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("------------------------");
			System.out.println("ALUNO " + (i+1));
			System.out.println("------------------------");
			
			nomes[i] = JOptionPane.showInputDialog("Nome: ");
			System.out.println("Aluno: " + nomes[i]);
			
			System.out.println("RESPOSTAS DADAS");
			
			for (int j = 0; j < gabarito.length; j++) {
				respostas[j] = JOptionPane.showInputDialog("Questão " + (j+1) + ": ");
				System.out.println("Questão " + (j+1) + ": " + respostas[j]);
				
				if (respostas[j].equals(gabarito[j])) {
					media[i] += ((double) 10 / gabarito.length);
				}
			}
		}
		
		System.out.println("NOTAS FINAIS");
		System.out.println("------------------------");
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] + ": " + media[i]);
			somaMedia += media[i];
		}
		
		double mediaTurma = somaMedia / media.length;
		
		System.out.println("------------------------");
		System.out.println("Média da Turma: " + mediaTurma);
	}
}
