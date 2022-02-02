package controller;

import java.util.Scanner;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		boolean global = true;
		
		while (global == true) {
		
			int cf = 0;
			int choices = 0;
		System.out.println("");	
		System.out.println("");			
		System.out.println("=============================================");
		System.out.println("OLá bem vindo ao The BashBank o melhor banco\n em linha de comando para você <3");
		System.out.println("=============================================");	
		
		System.out.println("Escolha uma opção abaixo:");
		System.out.println("1 - Criar uma nova conta");
		System.out.println("2 - Acessar conta");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
	
		cf = sc.nextInt();
		
//		clearConsole cls = new clearConsole();
	


		if (cf == 1) {
			while (cf == 1){
				
				choices = 0;
				
				System.out.println("  ");
				System.out.println("Escolha 1 das opções abaixo");
				System.out.println("1 - Abrir uma conta corrente");
				System.out.println("2 - Abrir uma conta poupança");
				System.out.println("3 - Voltar para o menu principal");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
				
				
				
				
				choices = sc.nextInt();
				
				switch(choices) {
				
				case 1:
					System.out.println("  ");
					System.out.println("Você abriu uma conta corrente por favor\n preencha os dados abaixo:");
					
					Cliente cl = new Cliente();
					Conta cc = new ContaCorrente(cl);
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					cl.setNome(null);
					System.out.println(" ");
					System.out.println(" ");
					
					
					System.out.println(cl.getNome()); 
					System.out.println(cc.getAgencia());
					System.out.println(cc.getNumero());
					System.out.println(cc.getSaldo());
					
					while(cf == 1) {
						choices = 0;
						System.out.println("");
						System.out.println("Digite 1 para voltar ao menu: ");
						choices = sc.nextInt();
						switch (choices) {
						
						case 1:
							cf = 0;
							break;
					}}
				
	
					break;
				
				case 2:
					System.out.println("  ");
					System.out.println("Você abriu uma conta poupança por favor\n preencha os dados abaixo:");
					
					Cliente cl1 = new Cliente();
					Conta cc1 = new ContaCorrente(cl1);
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					cl1.setNome(null);
					System.out.println(" ");
					System.out.println(" ");
					
					
					System.out.println(cl1.getNome()); 
					System.out.println(cc1.getAgencia());
					System.out.println(cc1.getNumero());
					System.out.println(cc1.getSaldo());
				
					while(cf == 1) {
						choices = 0;
						System.out.println("");
						System.out.println("Digite 1 para voltar ao menu: ");
						choices = sc.nextInt();
						switch (choices) {
						
						case 1:
							cf = 0;
							break;
					}}
			
			
					break;
				
				case 3:
					cf = 0;
					break;
				
				default:
					System.out.println("  ");
					System.out.println("Digito inválido, por favor digite\n apenas oque aparece na tela");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					break;
				
					
			}
				
				
				
		}
			}else if(cf == 2) {

				while (cf == 2) {
					System.out.println("  ");
					System.out.println("Escolha 1 das opções abaixo");
					System.out.println("1 - Acessar conta corrente");
					System.out.println("2 - Acessar conta poupança");
					System.out.println("3 - Voltar para o menu principal");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					
					choices = sc.nextInt();
					
				switch(choices) {

					case 1:
						System.out.println("  ");
						System.out.println("Você entrou na sua conta corrente por favor\n informe as ações abaixo:");
						System.out.println("1 - Sacar da conta");
						System.out.println("2 - Depositar na conta");
						System.out.println("3 - Transferir para outra conta");
						System.out.println("4 - ver extrato e informações da conta");
						
						
						Cliente cl = new Cliente();
						Conta cc = new ContaCorrente(cl);
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						cl.setNome(null);
						System.out.println(" ");
						System.out.println(" ");
						
						
						System.out.println(cl.getNome()); 
						System.out.println(cc.getAgencia());
						System.out.println(cc.getNumero());
						System.out.println(cc.getSaldo());
						
						while(cf == 1) {
							choices = 0;
							System.out.println("");
							System.out.println("Digite 1 para voltar ao menu: ");
							choices = sc.nextInt();
							switch (choices) {
							
							case 1:
								cf = 0;
								break;
							}}
						
						
						break;
						
					case 2:
						System.out.println("  ");
						System.out.println("Você entrou na sua conta poupança corrente por favor\n informe as ações abaixo:");
						System.out.println("1 - Sacar da conta");
						System.out.println("2 - Depositar na conta");
						System.out.println("3 - Transferir para outra conta");
						
						
						Cliente cl1 = new Cliente();
						Conta cc1 = new ContaCorrente(cl1);
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						cl1.setNome(null);
						System.out.println(" ");
						System.out.println(" ");
						
						
						System.out.println(cl1.getNome()); 
						System.out.println(cc1.getAgencia());
						System.out.println(cc1.getNumero());
						System.out.println(cc1.getSaldo());
						
						while(cf == 1) {
							choices = 0;
							System.out.println("");
							System.out.println("Digite 1 para voltar ao menu: ");
							choices = sc.nextInt();
							switch (choices) {
							
							case 1:
								cf = 0;
								break;
							}}
						
						
						break;
						
					case 3:
						cf = 0;
						break;
						
					default:
						System.out.println("  ");
						System.out.println("Digito inválido, por favor digite\n apenas oque aparece na tela");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("  ");
						break;
						
						
					}
			}
			
		}
			
			
		}		
	}
}
		
	
		
		
		
		
		
		
//		Cliente cl = new Cliente();
//		
//		Conta cc = new ContaCorrente(venilton);
//	
//		
//		cc.depositar(100);
//		cc.transferir(100, poupanca);
//		
//		cc.imprimirExtrato();
//		poupanca.imprimirExtrato();
//		
//		System.out.println("------------");
//		System.out.println(bk.getContas());

	

// incluir novas classes e atributos para:
// liste todos os clientes
// Torne o projeto interativo

// incluir lombok no projeto
// tratamento de excepção com TRY CATCHe FINNALY