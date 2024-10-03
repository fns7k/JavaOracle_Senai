import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// Exercicios - 03
		// Par_impar
		// principal
		// Crie um programa Java com Eclipse que peça para o usuário digitar um número, logo após o programa deve verificar e exibir 
		//se o número é par ou ímpar.
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para saber se é par ou impar: ");
		numero = entrada.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("O número é par.");
		}
		
		else {
			System.out.println("O número é impar");
		}

	}

}
