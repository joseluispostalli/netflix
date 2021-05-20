package Terceira_Parte;

import java.util.Scanner;

import Primeira_Parte.*;
import Segunda_Parte.*;

public class Principal {
	
	private static final Scanner tc = new Scanner(System.in);
	private static Registrodefilme regfilme;
	private static Registrodepessoa regpess;
	
	private static void adicionarpessoa() {
		String nome;
		Pessoa pess;
		System.out.println("Inscrever Pessoa:   ");
		System.out.println("Digite o Nome Completo: ");
		nome = tc.nextLine();			
		pess = new Pessoa(nome);
		regpess.adicionarpessoa(pess);
	}
	
	private static void adicionarfilme() {
		String titulo, produtora;
		Filme film;
		System.out.println("Adicionar o filme:    ");
		System.out.println("Titulo: ");
		titulo = tc.nextLine();
		System.out.println("Produtora: ");
		produtora = tc.nextLine();
					
		film = new Filme(titulo, produtora);
		regfilme.adicionarfilme(film);
	}
      


	public static void main(String[] args){
		regfilme = new Registrodefilme();
		regpess = new Registrodepessoa();
		
		Filme l1 = new Filme ("O miranha", "Riuberti");
		regfilme.adicionarfilme(l1);
		
		Pessoa c1 = new Pessoa ("Jholeno");
		regpess.adicionarpessoa(c1);

		
		int operaçao;
		do {
			System.out.println("\n Menu:\n");
			System.out.println(" 0 Sair");
			System.out.println(" 1 Adicionar Filme");
			System.out.println(" 2 Adicionar Pessoa");
			System.out.print("\n Opcao: ");
			operaçao = tc.nextInt();
			tc.nextLine();

			switch (operaçao) {
			case 0: 
				System.out.println("saindo do sistema");
				break;
			case 1:
				adicionarfilme();
				break;
			case 2:
				adicionarpessoa();
				break;
	
			default:
				System.out.println("n existe essa opção");
				break;
			}
		} while (operaçao != 0);
	}
}
