package visoes;

import java.util.Scanner;

import modelo.jogo;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("teste\n");
		
		Scanner entrada = new Scanner(System.in);
		
		// Inserir dados do jogo
		// Criando um objeto de jogo
		jogo jogo1 = new jogo();
//		jogo1.setNome("Mario Kart");
		System.out.println("Digite o nome do jogo: ");
		jogo1.setNome(entrada.nextLine());
		
		
		System.out.println("Digite a categoria do jogo: ");
		jogo1.setCategoria(entrada.nextLine());
		
		
		
		
		// Printar o nome do jogo
		System.out.println("O nome do jogo eh: " + jogo1.getNome());
		System.out.println("A categoria do jogo eh: " + jogo1.getCategoria());
		
		
	}

}
