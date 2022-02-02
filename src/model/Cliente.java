package model;

import java.util.Scanner;

public class Cliente {

	private String nome;

	public String getNome() {
		return "Nome da conta: " + this.nome;
	}

	public void setNome(String nome) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		this.nome = nome;
	}

}
