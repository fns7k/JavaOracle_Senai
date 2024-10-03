import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Contagem regressiva
		// Exibir contagem regressiva com while
		
		Scanner entrada = new Scanner(System.in);
		int resposta;
		
		while(true) {
			System.out.println("Deseja ver contagem regressiva? ");
			System.out.println("Digite 1 para sim");
			resposta = entrada.nextInt();
			if(resposta == 1) {
				// Exibindo contagem regressiva
				for(int i = 10; i>=1; i--) {
					System.out.println(i);
				}
				
			} else {
				System.out.println("Encerrando o programa!");
				break;
			}
		
		}

	}

}
