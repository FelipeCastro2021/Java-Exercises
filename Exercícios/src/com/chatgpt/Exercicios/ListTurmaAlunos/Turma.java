package com.chatgpt.Exercicios.ListTurmaAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
	private ArrayList<String> alunos = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	public void adicionar() {
		System.out.println("Qual aluno deseja adicionar? ");
		String aluno = scan.next();
		
		if (aluno == null || aluno.trim().isEmpty()) {
			return;
		}
		
		alunos.add(aluno);
		System.out.println("Aluno adicionado!");
	}
	
	public void exibir() {
		System.out.println("Lista de alunos: ");
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println("Aluno " + (i+1) + "º: " + alunos.get(i));
		}
	}
	
	public void remover() {
		System.out.println("Qual aluno deseja remover? ");
		String aluno = scan.next();
		
		if (aluno == null || aluno.trim().isEmpty()) {
			return;
		}
		
		alunos.remove(aluno);
		System.out.println("Aluno removido!");
	}
	
	public void verificarPresenca() {
		System.out.println("Qual o nome do aluno que deseja verificar? ");
		String aluno = scan.next();
		
		if (aluno == null || aluno.trim().isEmpty()) {
			return;
		}
		
		if (alunos.contains(aluno)) {
			System.out.println(aluno + " está presente na lista!");
		} else {
			System.out.println(aluno + " não está presenta na lista!");
		}
	}
	
	public void iniciar() {
		String mensagem = "";
		
		do {
			System.out.println("Escolha uma das opções apresentadas: "
					+ "\n[1] - Adicionar aluno"
					+ "\n[2] - Exibir alunos"
					+ "\n[3] - Remover aluno"
					+ "\n[4] - Verificar aluno");
			int condicao = scan.nextInt();
			
			switch(condicao) {
			case 1:
				this.adicionar();
				break;
			case 2:
				this.exibir();
				break;
			case 3:
				this.remover();
				break;
			case 4:
				this.verificarPresenca();
				break;
			default: 
				System.out.println("Opções inserida é inválida");
				break;
			}
			
			System.out.println("Deseja sair da lista de alunos: ");
			mensagem = scan.next().toUpperCase();
		} while(!mensagem.equals("S"));
		System.out.println("Saindo da lista de alunos...");
	}
}
