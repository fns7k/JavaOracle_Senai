package lacos_repeticao_while;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// While
		// Exibir os numeros de 1 a 10
		for (int i=1;i<10;i++) {
			System.out.println(i);
		} // for
		
		System.out.println("**************");
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}

		// Verificação de usuario e senha
		// RA--> 9876     senha --> 1234
		int ra =0;
		int senha =0;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		while(ra != 9876 || senha !=1234) {
			System.out.println("Digite o numero do seu RA: ");
			ra = entrada1.nextInt();
			
			System.out.println("Digite a sua senha: ");
			senha = entrada2.nextInt();
			
			//System.out.println("informaçoes incorretas");
		}
		System.out.println("Acesso ao sistema");
	}

}
