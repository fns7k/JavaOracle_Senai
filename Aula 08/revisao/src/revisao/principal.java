package revisao;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// If, if-else, if-else if- else
		// Verificação de média de notas
		// Pedir duas notas de aluno e verificar a média
		// Se a média for maior ou igual a 5, passou
		// Se a média for menor que 5, reprovou
		
		double nota1, nota2;
		
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada1.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada2.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media >= 5) {
			System.out.println("Aluno aprovado");
		}
		
		else {
			System.out.println("Aluno reprovado");
		}
		
	}

}
