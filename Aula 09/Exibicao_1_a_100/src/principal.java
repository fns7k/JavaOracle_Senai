
public class principal {

	public static void main(String[] args) {
		// Laços de repetição --> Loops
		// For, while, Do while
		// Exibir os numeros de 1 a 100
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		
		// Primeiro exemplo
		for (int contador =1; contador <=10; contador = contador +1) {
			System.out.println("Curso de programacao em Java" + contador);
		}
		
		
		// Segundo exemplo
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
			
		
		// Exibir os numeros entre 20 e 40
		for (int i = 20; i <= 40; i++) {
			System.out.println(i);
		}
		
		
		// Exibir os numeros multiplos de 5 que estao entre 50 e 100
		for (int i = 50; i <= 100; i += 5) {
			System.out.println(i);
		}
		
		
		// Exibir os numeros de 1 a 10 em ordem decrescente
		for (int i = 10; i >= 1; i --) {
			System.out.println(i);
		}
			
		
		// Exibir os numeros entre 100 e 150
		for (int i =100; i<=150; i++) {
			System.out.println(i);
		}
		
		
		
	}

}
