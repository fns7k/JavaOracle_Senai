package verificarDuasEtapas;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Verificar se usuario e senha estão corretos
		// usuario --> Operador
		// senha --> 1234
		// Estilo netflix e instagram

		String usuario;
		int senha;

		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Digite o nome do usuario: ");
		usuario = entrada1.nextLine();

		if (usuario.equalsIgnoreCase("Operador")) { // IgnoreCase --> maiusculo ou minisculo não fazer diferença na
													// escrita para o usuario

			System.out.println("Digite a senha do usuario: ");

			senha = entrada2.nextInt();

			if (senha == 1234) {
				System.out.println("Acesso ao sistema liberado.");

			} else {
				System.out.println("Acesso negado, senha incorreta.");
			}

		} else {
			System.out.println("Acesso negado, usuario incorreto.");
		}

	}

}
