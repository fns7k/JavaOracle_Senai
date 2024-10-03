import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/* Crie um programa em Java com Eclipse que determine se um determinado ano lido é bissexto.
		 * Obs: Um ano é bissexto se for divisível por 400 ou se for divisível por 4 e não for divisível por 100.
		*/
		
		Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano que você deseja verificar se é bissexto:");
        int ano = entrada.nextInt();
        
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        
	}

}
