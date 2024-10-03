import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		// funcionamento de um programa
		// iniciar e encerrar
		int opcao =1;
		Scanner entrada = new Scanner(System.in);
		
		while(opcao ==1) {
			System.out.println("Nome desenvolvedor: Gustavo");
			System.out.println("Curso Java");
			
			System.out.println("Deseja encerrar o oprograma? Digite 1 para sim");
			opcao = entrada.nextInt();
		
			
		}
		System.out.println("Programa encerrado");
		
		
	}
}
