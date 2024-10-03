package visoes;

import java.util.Scanner;

import modelo.jogador;

public class principal2 {

	public static void main(String[] args) {
		// Inserir e exibir informações de 2 jogadores, utilizar apenas os campos nickname e roupagem.
		// obs: crie um método principal para essa tarefa.

		Scanner entrada = new Scanner(System.in);
		jogador jogador1 = new jogador();
		jogador jogador2 = new jogador();

		System.out.println("Digite o nome do jogador1: ");
		jogador1.setNickname(entrada.nextLine());

		System.out.println("Digite a roupa do jogador1: ");
		jogador1.setRoupagem(entrada.nextLine());
		
		System.out.println("\nDigite o nome do jogador2: ");
		jogador2.setNickname(entrada.nextLine());

		System.out.println("Digite a roupa do jogador2: ");
		jogador2.setRoupagem(entrada.nextLine());

		System.out.println("\nO nome do jogador1 eh: " + jogador1.getNickname());
		System.out.println("A roupa do jogador1 eh: " + jogador1.getRoupagem());
		System.out.println("\nO nome do jogador2 eh: " + jogador2.getNickname());
		System.out.println("A roupa do jogador2 eh: " + jogador2.getRoupagem());
		
	}

}
