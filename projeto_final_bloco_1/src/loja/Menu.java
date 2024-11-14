package loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import loja.model.LivroFisico;
import loja.controller.LivroController;
import loja.model.LivroDigital;

public class Menu {
	public static void main(String[] args) {

		LivroController livros = new LivroController();

// 		SELECIONE AS LINHAS ABAIXO E DÊ O COMANDO " CTRL + / " PARA NÃO PRECISAR INSERIR OS LIVROS MANUALMENTE
//		
//		LivroFisico lf1 = new LivroFisico(livros.gerarNumero(), "Harry 1", "JKRolling", 20.0f, 1, 1);
//		livros.cadastrar(lf1);
//		LivroFisico lf2 = new LivroFisico(livros.gerarNumero(), "Harry 2", "JKRolling", 25.0f, 1, 2);
//		livros.cadastrar(lf2);
//
//		// Teste da classe livro digital
//		LivroDigital ld1 = new LivroDigital(livros.gerarNumero(), "Harry 3", "JKRolling", 15.0f, 2, 256.2f);
//		livros.cadastrar(ld1);
//		LivroDigital ld2 = new LivroDigital(livros.gerarNumero(), "Harry 4", "JKRolling", 18.0f, 2, 256.2f);
//		livros.cadastrar(ld2);
//
//		lf1.visualizar();
//		lf2.visualizar();
//		ld1.visualizar();
//		ld2.visualizar();

		Scanner scanner = new Scanner(System.in);

		// Declaração de variáveis
		int opcao, tipo, tamanho, capa, id;
		String autor, nome;
		float preco;

		// Laço do Menu
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

			// Try caso o valor não seja inteiro
			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite um valor inteiro meu filho!");
				opcao = 0;
			}

			// Lógica do menu de acordo com a entrada do vendedor
			switch (opcao) {

			case 1: // Lista os livros disponiveis para venda
				System.out.println("Livros a venda\n\n");
				livros.listarTodos();
				keyPress();
				break;

			case 2: // Cadastra novos livros
				System.out.println("Cadastrar livros\n\n");
				System.out.println("Digite o nome do livro: ");
				scanner.skip("\\R?");
				nome = scanner.nextLine();
				System.out.println("Digite o nome do autor: ");
				autor = scanner.nextLine();
				System.out.println("Digite o preço do livro: ");
				preco = scanner.nextFloat();

				do { // Enquanto a pessoa não digitar um valor certo, ele repete
					System.out.println("Digite o tipo do livro (1 - Fisico ou 2 - Digital)");
					tipo = scanner.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) { // Cadastra diferente em classe diferente de acordo com o tipo
				case 1 -> {
					System.out.println("Qual o tipo de capa? (1 - Capa Dura ou 2 - Capa Mole)");
					capa = scanner.nextInt();
					livros.cadastrar(new LivroFisico(livros.gerarNumero(), nome, autor, preco, tipo, capa));
				}
				case 2 -> {
					System.out.println("Qual o tamanho do ebook em Mbs?");
					tamanho = scanner.nextInt();
					livros.cadastrar(new LivroDigital(livros.gerarNumero(), nome, autor, preco, tipo, tamanho));
				}
				}

				keyPress();
				break;
			
			case 3: // Venda de livros, retirando do estoque!
				System.out.println("Vendeu um livro?\n\n");
				System.out.println("Qual o ID do livro que vendeu?: ");
				id = scanner.nextInt();
				livros.vender(id);
				keyPress();
				break;
			
			case 4: // Exibe o programa e exibe o sobre
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

	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter zé!");
		}
	}
}
