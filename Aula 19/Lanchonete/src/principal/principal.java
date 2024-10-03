package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {

	/*
	 * Crie um programa Java Console para uma hamburgueria. 
	 * 
	 * O Programa deve permitir o cadastro.
	 * 
	 * O Programa deve iniciar exibindo um menu de opções ao operador, nesse menu ele terá as opções:
	 *  - Montar pedido;
	 *  - Cadastrar produto;
	 *  - Encerrar o programa.
	 *  
	 *  A opção "montar pedido" deve exibir um menu de opções de acordo com as categorias:
	 *  "bebidas", "lanches", "porções", "sobremesas", ao final do pedido, o programa deve mostrar o valor a ser pago.
	 *  
	 *  OBS: Para cadastrar produtos, o mesmo deve ser inserido nas devidas categorias.
	 */

	
	
	// Lista de categorias
	private static ArrayList<String> categorias = new ArrayList<>();
	// Lista de produtos por categoria
	private static ArrayList<ArrayList<Produto>> produtosPorCategoria = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Inicializa as categorias e produtos
		inicializarCategorias();

		while (true) {
			// Exibe o menu principal
			System.out.println("Bem-vindo a Hamburgueria:");
			System.out.println("1 - Montar Pedido");
			System.out.println("2 - Cadastrar Produto");
			System.out.println("3 - Encerrar Programa");
			System.out.print("Escolha uma opcao: ");
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				montarPedido();
				break;
			case 2:
				cadastrarProduto();
				break;
			case 3:
				System.out.println("Programa encerrado.");
				return;
			default:
				System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
			}
		}
	}

	// Inicializa as categorias e produtos com categorias vazias
	private static void inicializarCategorias() {
		categorias.add("Bebidas");
		categorias.add("Lanches");
		categorias.add("Porcoes");
		categorias.add("Sobremesas");

		for (int i = 0; i < categorias.size(); i++) {
			produtosPorCategoria.add(new ArrayList<>());
		}
	}

	// Permite ao usuário montar seu pedido
	private static void montarPedido() {
		double totalPedido = 0.0;
		ArrayList<String> itensSelecionados = new ArrayList<>();

		// Loop para montar o pedido
		while (true) {
			System.out.println("\nMontar Pedido:");
			// Exibe as categorias
			for (int i = 0; i < categorias.size(); i++) {
				System.out.println((i + 1) + " - " + categorias.get(i));
			}
			System.out.println("0 - Concluir Pedido");
			System.out.print("Escolha uma categoria (ou 0 para concluir): ");
			int categoriaIndex = scanner.nextInt();

			if (categoriaIndex == 0) {
				break;
			}

			int categoria = categoriaIndex - 1;
			if (categoria < 0 || categoria >= categorias.size()) {
				System.out.println("Categoria invalida.");
				continue;
			}

			ArrayList<Produto> produtosCategoria = produtosPorCategoria.get(categoria);
			if (produtosCategoria.isEmpty()) {
				System.out.println("Nenhum produto cadastrado nesta categoria.");
				continue;
			}

			System.out.println("\nProdutos disponiveis:");
			for (int i = 0; i < produtosCategoria.size(); i++) {
				Produto produto = produtosCategoria.get(i);
				System.out.println((i + 1) + " - " + produto.getNome() + " - R$ " + produto.getPreco());
			}

			while (true) {
				System.out.print("\nSelecione o produto (ou 0 para mudar de categoria): ");
				int produtoSelecionado = scanner.nextInt();

				if (produtoSelecionado == 0) {
					break;
				}

				int produtoIndex = produtoSelecionado - 1;
				if (produtoIndex < 0 || produtoIndex >= produtosCategoria.size()) {
					System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
					continue;
				}

				Produto produto = produtosCategoria.get(produtoIndex);

				System.out.print("Quantidade: ");
				int quantidade = scanner.nextInt();

				double subtotal = produto.getPreco() * quantidade;
				totalPedido += subtotal;
				System.out.println("Subtotal: R$ " + subtotal);

				// Adiciona o item selecionado à lista de itens
				itensSelecionados.add(produto.getNome() + " - Quantidade: " + quantidade);
			}
		}

		// Exibe os itens selecionados
		System.out.println("\nItens selecionados:");
		for (String item : itensSelecionados) {
			System.out.println(item);
		}

		System.out.println("Total do Pedido: R$ " + totalPedido + "\n" + "\n");
	}

	// Permite ao usuário cadastrar novos produtos
	private static void cadastrarProduto() {
		System.out.println("\nCadastrar Produto:");
		System.out.print("Nome: ");
		String nome = scanner.next();
		System.out.print("Preço: ");
		double preco = scanner.nextDouble();
		System.out.println("Categoria:");
		// Exibe as categorias para escolha
		for (int i = 0; i < categorias.size(); i++) {
			System.out.println((i + 1) + " - " + categorias.get(i));
		}
		System.out.print("Escolha a categoria: ");
		int categoriaIndex = scanner.nextInt();

		int categoria = categoriaIndex - 1;
		if (categoria < 0 || categoria >= categorias.size()) {
			System.out.println("Categoria invalida.");
			return;
		}

		Produto produto = new Produto(nome, preco);
		produtosPorCategoria.get(categoria).add(produto);
		System.out.println("Produto cadastrado com sucesso! \n");
	}
}

class Produto {
	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
}
