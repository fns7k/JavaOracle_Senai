import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// Crie um programa em Java com Eclipse que peça o nome e a idade de duas
		// pessoas, logo após exibir o nome e a idade das pessoas digitadas.
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome da primeira pessoa: ");
		String nomePessoa1 = entrada.nextLine();

		System.out.print("Digite a idade da primeira pessoa: ");
		int idadePessoa1 = entrada.nextInt();
		entrada.nextLine(); // para pular a quebra de linha

		System.out.print("Digite o nome da segunda pessoa: ");
		String nomePessoa2 = entrada.nextLine();

		System.out.print("Digite a idade da segunda pessoa: ");
		int idadePessoa2 = entrada.nextInt();

		System.out.println("Dados das pessoas digitadas:");
		System.out.println("Pessoa 1: " + nomePessoa1 + ", " + idadePessoa1 + " anos");
		System.out.println("Pessoa 2: " + nomePessoa2 + ", " + idadePessoa2 + " anos");
	}

}