package classificacao_idade;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Crie um programa em Java com Eclipse que leia a idade de uma pessoa e classifique de acordo com a faixa etária:
		/* 
		 * Criança: Idade de 1 a 13 anos;
		 * Adolescente: Idade maior que 13 anos e menor ou igual a 20 anos;
		 * Adulto: Idade maior que 20 anos e menor ou igual a 60 anos;
		 * Idoso: Idade maior que 60 anos.
		*/
		
		int idade;
		Scanner entrada = new Scanner(System.in);
		idade = entrada.nextInt();
		
		if (idade <= 13) {
			System.out.println("Criança");
		}
		else if (idade > 13 && idade <= 20) {
			System.out.println("Adolescente");
		}
		else if (idade >20 && idade <= 60) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
	}
}
