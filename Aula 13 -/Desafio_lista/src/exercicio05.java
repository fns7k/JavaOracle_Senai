import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// Crie um programa em Java com Eclipse que peça a idade de uma pessoa, ao
		// final, o programa deve exibir se a pessoa paga ou não passagem. Pagam
		// passagem pessoas com mais de 6 anos e menos de 60 anos.

		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a idade da pessoa: ");
		int idade = scanner.nextInt();

		if (idade > 6 && idade < 60) {
			System.out.println("A pessoa paga passagem.");
		} else {
			System.out.println("A pessoa não paga passagem.");
		}
	}

}