package loja;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

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
