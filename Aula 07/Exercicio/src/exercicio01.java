import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		int somaPares = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();

		System.out.println("Digite o segundo numero: ");
		numero2 = entrada.nextInt();

		System.out.println("Digite o terceiro numero: ");
		numero3 = entrada.nextInt();

		if (numero1 % 2 == 0) {
			somaPares += numero1;
		}

		if (numero2 % 2 == 0) {
			somaPares += numero2;
		}

		if (numero3 % 2 == 0) {
			somaPares += numero3;
		}

		System.out.println("A soma dos numeros pares eh: " + somaPares);
	}
}
