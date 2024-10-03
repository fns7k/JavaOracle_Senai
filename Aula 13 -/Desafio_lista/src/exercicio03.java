import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// Crie um programa em Java com Eclipse que peça o nome de um aluno e suas três
		// notas. Ao final o programa deve exibir a media de nota do aluno.
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entrada.nextLine();

		System.out.print("Digite a primeira nota do aluno: ");
		double nota1 = entrada.nextDouble();

		System.out.print("Digite a segunda nota do aluno: ");
		double nota2 = entrada.nextDouble();

		System.out.print("Digite a terceira nota do aluno: ");
		double nota3 = entrada.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		System.out.println("Média de nota do aluno " + nomeAluno + ": " + media);
	}

}