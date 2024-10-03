package revisao;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Verificação de número par ou ímpar

		int numero;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para saber se é par ou impar: ");
		numero = entrada.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é par.");
		}

		else {
			System.out.println("O número é impar");
		}

	}

}
