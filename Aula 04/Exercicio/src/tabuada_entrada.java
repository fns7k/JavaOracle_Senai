import java.util.Scanner;

public class tabuada_entrada {

	public static void main(String[] args) {
		// Faça um programa em Java com Eclipse que peça para o usuário digitar um número entre 1 e 10, logo após exibir a tabuada do número digitado.
		
		// Entrada de dados
		int numero;
		
		// Biblioteca para entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		// Pedir interação do usuário
		System.out.println("Digite um número entre 1 e 10: ");
		numero = entrada.nextInt();
		
		
		// Exibindo a tabuada
		System.out.println("A tabuada do número " + numero + " é: \n" 
				           + numero + " * 1 = " + (numero * 1) + "\n" 
				           + numero + " * 2 = " + (numero * 2) + "\n" 
				           + numero + " * 3 = " + (numero * 3) + "\n" 
				           + numero + " * 4 = " + (numero * 4) + "\n" 
				           + numero + " * 5 = " + (numero * 5) + "\n" 
				           + numero + " * 6 = " + (numero * 6) + "\n" 
				           + numero + " * 7 = " + (numero * 7) + "\n" 
				           + numero + " * 8 = " + (numero * 8) + "\n" 
				           + numero + " * 9 = " + (numero * 9) + "\n" 
				           + numero + " * 10 = " + (numero * 10) + "\n"        );
		
		

	}

}
