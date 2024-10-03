import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// Crie um programa em Java com Eclipse que peça para o usuário digitar um
		// numero de 1 a 10, logo após exibir a tabuada do número digitado
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número de 1 a 10: ");
		int numero = entrada.nextInt();

		if (numero < 1 || numero > 10) {
			System.out.println("Número inválido. Por favor, digite um número entre 1 e 10.");
		} else {
			System.out.println("Tabuada do " + numero + ":");
			for (int i = 1; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + (numero * i));
			}
		}
	}

}