import java.util.Scanner;

public class soma2numeros {

	public static void main(String[] args) {
		// Faça um programa em Java com o Eclipse que peça para o usuário digitar dois números, logo após exibir a soma dos números digitados.
		
		// Entrada de dados
				int numero1;
				String numero2;
				
				// Biblioteca para entrada de dados
				Scanner entrada = new Scanner(System.in);
				Scanner entrada1 = new Scanner(System.in);
				
				// Pedir interação do usuário
				System.out.println("Digite o primeiro número: ");
				numero1 = entrada.nextInt();
				
				System.out.println("Agora digite o segundo número: ");
				numero2 = entrada1.nextLine();
				
				// Exibindo a idade do usuário
				System.out.println("O primeiro numero digitado foi: " + numero1 + " e o segundo número foi: " + numero2);
				
	}

}
