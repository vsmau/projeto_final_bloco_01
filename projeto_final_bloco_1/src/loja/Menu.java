package loja;

import java.util.Scanner;

import loja.model.LivroFisico;

import loja.model.LivroDigital;

public class Menu {
	public static void main(String[] args) {

		// Teste da classe livro fisico
		LivroFisico lf1 = new LivroFisico(1, "Harry 1", "JKRolling", 20.0f, 1, 1);
		LivroFisico lf2 = new LivroFisico(2, "Harry 2", "JKRolling", 25.0f, 1, 2);
		
		// Teste da classe livro digital
		LivroDigital ld1 = new LivroDigital(3, "Harry 3", "JKRolling", 15.0f, 2, 256.2f);
		LivroDigital ld2 = new LivroDigital(4, "Harry 4", "JKRolling", 18.0f, 2, 256.2f);
		
		lf1.visualizar();
		lf2.visualizar();
		ld1.visualizar();
		ld2.visualizar();
		
		Scanner scanner = new Scanner(System.in);

		int opcao;

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 VINI'S BOOKS STORE                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Livros à venda                       ");
			System.out.println("            2 - Cadastrar livros                     ");
			System.out.println("            3 - Vender livros                        ");
			System.out.println("            4 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Livros a venda\n\n");
				break;
			case 2:
				System.out.println("Cadastrar livros\n\n");
				break;
			case 3:
				System.out.println("Vender livros\n\n");
				break;
			case 4:
				System.out.println("Livros hoje, livros amanhã, livros sempre!");
				scanner.close();
				sobre();
				System.exit(0);
				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("***********************************************");
		System.out.println("Projeto Desenvolvido por: Vinicius Souza");
		System.out.println("Generation Brasil - vmsoouza@gmail.com");
		System.out.println("github.com/vsmau");
		System.out.println("***********************************************");
	}
}
