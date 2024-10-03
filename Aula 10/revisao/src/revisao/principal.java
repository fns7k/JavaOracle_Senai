package revisao;

public class principal {

	public static void main(String[] args) {
		// Exibir os numeros pares de 100 a 150
		for (int i = 100; i<=150; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("************************");
		// Segunda forma
		for (int i = 100; i<=150; i= i+2) {
				System.out.println(i);
		}

	}

}
