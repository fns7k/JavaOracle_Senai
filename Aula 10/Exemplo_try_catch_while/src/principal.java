import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class principal {

	public static void main(String[] args) {
		
		try {
			// Verificação de erro
			int opcao;
			Scanner entrada = new Scanner(System.in);
			// Exibir contagem regressiva
			while(true) {
				// Contagem regressiva com while
				int i=10;
				while(i>=1) {
					System.out.println(i);
					i--;
					TimeUnit.SECONDS.sleep(1);
				}
				
				System.out.println("Deseja encerrar o programa?");
				System.out.println("0 para sim");
				opcao = entrada.nextInt();
				if(opcao == 0) {
					break;
				}
			}
			
			
		}catch (Exception e) {
			System.out.println("Erro");
		}

	}

}
