package model;

import java.util.Scanner;

import repository.IConta;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor a ser depositado: ");
		valor = sc.nextDouble();
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor a ser sacado: ");
		valor = sc.nextDouble();
		System.out.println("Digite 1 se deseja transferir para conta corrente");
		System.out.println("Digite 2 se dejsa transferir para conta poupança");
		int i = sc.nextInt();
		if(i == 1) {
			System.out.println("Você depositou na conta corrente");
			//contaDestino = 
			contaDestino.depositar(valor);
		}else if (i == 2) {
			System.out.println("Você depositou na conta poupança");
			//contaDestino =
			contaDestino.depositar(valor);
		}
		
	}

	public int getAgencia() {
		System.out.println("A agencia da sua conta é: ");
		return agencia;
	}

	public int getNumero() {
		System.out.println("O numero da sua conta é: ");
		return numero;
	}

	public double getSaldo() {
		System.out.println("O saldo da sua conta é: \n" + saldo);
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
