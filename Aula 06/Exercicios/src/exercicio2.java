import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// Verificar_maior_menor
		// principal
		// Crie um programa em java com eclipse que peça para o usuario digitar dois números, logo após o programa deve informar qual o 
		//maior e qual o menor número digitado.
		
		int numero1;
		int numero2;
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o primeiro numero: ");
		numero2 = entrada1.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O numero " + numero1 + "eh maior que o numero " + numero2);
		}
		
		else {
			System.out.println("O numero " + numero2 + "eh maior que o numero " + numero1);
		}
	}

}
