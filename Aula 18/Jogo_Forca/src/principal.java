import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Criar um programa em Java utilizando Eclipse que simule o chamado "jogo da forca".

		Scanner scanner = new Scanner(System.in);
		String entrada;

		// Palavra secreta decidida
		String palavra = "aranha";

		// Letras já descobertas
		char[] letrasDescobertas = new char[palavra.length()];

		// Inicializar letras descobertas
		for (int i = 0; i < palavra.length(); i++) {
			letrasDescobertas[i] = '_';
		}

		// Número de tentativas decidido
		int tentativas = 5;

		// Loop principal do jogo
		while (tentativas > 0) {
			// Mostrar palavra atual
			System.out.print("Palavra: ");
			for (char letra : letrasDescobertas) {
				System.out.print(letra + " ");
			} // for
			System.out.println();

			// Pedir letra ao usuário
			System.out.print("Digite uma letra: ");
			entrada = scanner.nextLine();
			char letra = entrada.charAt(0);

			// Verificar se a letra está na palavra
			boolean letraEncontrada = false;
			for (int i = 0; i < palavra.length(); i++) {
				if (palavra.charAt(i) == letra) {
					letrasDescobertas[i] = letra;
					letraEncontrada = true;
				} // if
			} // for

			// Se a letra não foi encontrada, decrementar tentativas
			if (!letraEncontrada) {
				tentativas--;
				System.out.println("Erro! Você tem " + tentativas + " tentativas restantes.");
			} // if

			// Verificar se a palavra foi completamente descoberta
			boolean palavraCompleta = true;
			for (char letraDescoberta : letrasDescobertas) {
				if (letraDescoberta == '_') {
					palavraCompleta = false;
					break;
				} // if
			} // for

			// Se a palavra foi completamente descoberta, parar o jogo
			if (palavraCompleta) {
				System.out.println("Parabéns! Você descobriu a palavra: " + palavra);
				break;
			} // if
		} // while

		// Se as tentativas acabaram, mostrar mensagem de derrota
		if (tentativas == 0) {
			System.out.println("Você perdeu! A palavra era: " + palavra);
		} // if

	} // main

} // class
