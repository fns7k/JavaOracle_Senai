import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Fazer um projeto no Java utilizando Eclipse que peça para o usuário digitar um número e logo após o programa deve exibir a tabuada desse número
		
		int numero;
		int contador = 1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = entrada.nextInt();
		
		while (contador <=10) {
			System.out.println(numero + "x" + contador + " = " + (numero * contador));
			contador++;
		}

	}

}
