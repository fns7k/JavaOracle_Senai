import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// Exercicios - 01
		//Verificar_maior_idade
		//Crie um programa em Java com Eclipse que peça para o usuario digitar a idade de uma pessoa e em seguida o programa deve verificar 
		//e informar se a pessoa é menor ou maior de idade.
		
		
		int idade;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua idade para saber se é menor ou maior de idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 18) {
			System.out.println("O usuario eh maior de idade");
		}
		
		else {
			System.out.println("O usuario eh menor de idade");
		}

	}

}
