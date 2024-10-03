package DAO;

import modelo.jogo;

public class cadastro {
	public static void JogosCadastrados() {
		// Exibir os jogos cadastrados
		jogo jogo1 = new jogo();
		jogo jogo2 = new jogo();
		jogo jogo3 = new jogo();

		// Preencher os valores dos campos
		jogo1.setNome("GTA San Andreas");
		jogo1.setCategoria("Acao");
		jogo2.setNome("Forza Horizon");
		jogo2.setCategoria("Corrida");
		jogo3.setNome("Fifa 2024");
		jogo3.setCategoria("Esportes");
		
		System.out.println("Nome do jogo:" + jogo1.getNome());
		System.out.println("Categoria do jogo: " + jogo1.getCategoria());
		System.out.println("\nNome do jogo:" + jogo2.getNome());
		System.out.println("Categoria do jogo: " + jogo2.getCategoria());
		System.out.println("\nNome do jogo:" + jogo3.getNome());
		System.out.println("Categoria do jogo: " + jogo3.getCategoria());

	}
}
