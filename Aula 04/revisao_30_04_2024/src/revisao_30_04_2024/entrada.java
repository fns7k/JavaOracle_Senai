package revisao_30_04_2024;

import java.util.Scanner;

public class entrada {

	public static void main(String[] args) {
		// Entrada de dados
		int idade;
		String nomeUsuario;
		
		// Biblioteca para entrada de dados
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		
		// Pedir interação do usuário
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		
		System.out.println("Agora digite o seu nome: ");
		nomeUsuario = entrada1.nextLine();
		
		// Exibindo a idade do usuário
		System.out.println("O nome do usuário é: " + nomeUsuario);
		System.out.println("A idade do usuário é: " + idade + " anos");
		
		
		
	}

}
