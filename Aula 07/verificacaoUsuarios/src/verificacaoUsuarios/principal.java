package verificacaoUsuarios;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Verificar se usuario e senha estão corretos
		// usuario --> Operador --> Senha --> 1234
		// usuario --> Administrador --> senha --> 9876
		// Estilo netflix e instagram

		String usuario;
		int senha;

		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);

		System.out.println("Digite o nome do usuario: ");
		usuario = entrada.nextLine();
		System.out.println("Digite a senha do usuario: ");
		senha = entrada1.nextInt();

		if (usuario.equalsIgnoreCase("Administrador") && senha == 9876) { // IgnoreCase --> maiusculo ou minisculo não fazer diferença na escrita para o usuario
			System.out.println("Bem-vindo, Administrador! Acesso ao sistema liberado.");
		} else if (usuario.equalsIgnoreCase("Operador") && senha == 1234) {
			System.out.println("Bem-vindo, Operador! Acesso liberado.");
		} else {
			System.out.println("Acesso negado");
		}

	}

}
