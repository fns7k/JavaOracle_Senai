import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/* Crie um programa em Java com o Eclipse que peça para o usuário escolher uma opção de acordo com o seguinte menu:
		*  SenaiFastFood
		*  ************************
		*  1 - Xburguer --> R$12,00
		*  2 - Xsalada --> R$15,00
		*  3 - Xbacon --> R$18,00
		*  4 - Coxinha --> R$8,00
		*  5 - Misto quente --> R$12,00
		*  Ao escolher a opção, exibir mensagem com o lanche escolhido e o valor a ser pago
		*/
		
		int escolha;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opção do menu: ");
		System.out.println("1 - Xburguer --> R$12,00\n"
				         + "2 - Xsalada --> R$15,00\n"
				         + "3 - Xbacon --> R$18,00\n"
				         + "4 - Coxinha --> R$8,00\n"
				         + "5 - Misto quente --> R$12,00");
		escolha = entrada.nextInt();
		switch(escolha) {
		case 1:
			System.out.println("Xburguer --> R$12,00");
			break;
		case 2:
			System.out.println("Xsalada --> R$15,00");
			break;
		case 3:
			System.out.println("Xbacon --> R$18,00");
			break;
		case 4: 
			System.out.println("Coxinha --> R$8,00");
			break;
		case 5:
			System.out.println("Misto quente --> R$12,00");
			break;
		default:
				System.out.println("Opção Incorreta");
		}		
	}
}
