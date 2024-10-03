import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/* Programa para pesquisa de satisfação
		 * Pedir para o usuário escolher uma opção
		 * 1 - muito insatisfeito
		 * 2 - insatisfeito
		 * 3 - satisfeito
		 * 4 - muito satisfeito
		 * 5 - extremamente satisfeito
		 */
		
		
		int escolha;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opção de acordo com seu grau de satisfação com a qualidade do filme em cartaz");
		System.out.println("1 - muito insatisfeito\n"
				         + "2 - insatisfeito\n"
				         + "3 - satisfeito\n"
				         + "4 - muito satisfeito\n"
				         + "5 - extremamente satisfeito");
		escolha = entrada.nextInt();
		switch(escolha) {
		case 1:
			System.out.println("Cliente Muito Insatisfeito");
			break;
		case 2:
			System.out.println("Clinte Insatisfeito");
			break;
		case 3:
			System.out.println("Cliente Satisfeito");
			break;
		case 4: 
			System.out.println("cliente Muito satisfeito");
			break;
		case 5:
			System.out.println("Cliente extremamente satisfeito");
			break;
			default:
				System.out.println("Opção Incorreta");
			
			
		}

	}

}
