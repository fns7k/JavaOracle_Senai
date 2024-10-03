import java.util.Random;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*
		 * Sortear números entre 1 e 60
		 * A cada sorteio, mostrar os números que ja foram sorteados.
		 * Os números sorteados não podem se repetir.
		 * Acaba quando o usuário decidir encerrar o sorteio ou quando todos os números forem sorteados.
		 * 
		 * Dicas:
		 * 1 - Utilize um vetor (matriz) para armazenar os números sorteados;
		 * 2 - Sugestão de utilizar while (true) para dar continuidade ao programa;
		 * 3 - Na seção 4 do material, há formas de gerar números.
		 * 
		 * 
		 * Não usei ArrayList devido a não saber direito, então fiz dessa forma abaixo.
		 */
		
		
		
		Random bingo = new Random();		// Inicializa um objeto Random para geração de números aleatórios
		boolean[] sorteios = new boolean[60];		 // Vetor para armazenar os numeros sorteados
		int quantidadeSorteios = 0;			// Inicializa a variável para contar a quantidade de sorteios

		Scanner entrada = new Scanner(System.in);

		
		
		System.out.println("Super Bingo");
		System.out.println("\n");

		
		
		while (true) {		// Loop
			
			int numeroSorteado;

			
			do {			// faça X enquanto Y
				numeroSorteado = bingo.nextInt(60) + 1;			// Sorteio de um número entre 1 e 60
			} while (sorteios[numeroSorteado - 1]); 		// Verifica se o número ja foi sorteado

			
			sorteios[numeroSorteado - 1] = true; 		// Marca o número sorteado como verdadeiro
			quantidadeSorteios++;

			
			System.out.println("\n");
			System.out.println("Numero sorteado: " + numeroSorteado);
			System.out.print("Numeros sorteados: ");

			
			for (int i = 0; i < 60; i++) {
				if (sorteios[i]) {			// Verifica se o número foi sorteado
					System.out.print((i + 1) + " - ");			// Imprime o número sorteado
				} //if
			} //for
			System.out.println();			// Linha em branco

			
			if (quantidadeSorteios == 60) {
				System.out.println("Todos os numeros foram sorteados!");
				break;
			} //if

			
			System.out.print("Deseja continuar sorteando? (s/n): ");
			String resposta = entrada.next();

			
			if (resposta.equalsIgnoreCase("n")) {
				System.out.println("Programa encerrado");
				break;
			} //if
		} //while
	} //main
} //class
