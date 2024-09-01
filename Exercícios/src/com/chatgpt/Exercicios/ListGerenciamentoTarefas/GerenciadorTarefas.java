package com.chatgpt.Exercicios.ListGerenciamentoTarefas;

import java.util.ArrayList;

public class GerenciadorTarefas {
	private ArrayList<String> tarefas = new ArrayList<>();
	
	public void adicionar(String tarefa) {
		if (tarefa == null || tarefa.trim().isEmpty()) {
			return;
		}
		
		tarefas.add(tarefa);
		System.out.println("Tarefa adicionada");
	}
	
	public void exibir() {
//		System.out.println(tarefas);
		System.out.println("Lista de tarefas: ");
//		for (String tarefa : tarefas) {
//			System.out.println(tarefa);
//		}
		for (int i = 0; i < tarefas.size(); i++) {
			System.out.println((i+1) + "º tarefa: " + tarefas.get(i));
		}
	}
	
	public void remover(String tarefa) {
		if (tarefa == null || tarefa.trim().isEmpty()) {
			return;
		}

		tarefas.remove(tarefa);
	}

	public ArrayList<String> getTarefas() {
		return tarefas;
	}

	public void setTarefas(ArrayList<String> tarefas) {
		this.tarefas = tarefas;
	}
}
