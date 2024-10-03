import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class professor {

	public static void main(String[] args) {
		// Desafio 1 -- Feito pelo professor

		ArrayList<Integer> geral = new ArrayList<>();
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();

		// Pede para encerrar quando o usuario digitar 0
		int opcao, numero;
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);

		while (true) {
			numero = entrada1.nextInt();
			geral.add(numero);
			if (numero % 2 == 0) {
				pares.add(numero);
			} else {
				impares.add(numero);
			}
			System.out.println("Digite 0 para encerrar o programa");
			opcao = entrada.nextInt();
			if (opcao == 0) {
				break;
			}
		} // while

		// Colocar em ordem crescente
		Collections.sort(geral);
		Collections.sort(pares);
		Collections.sort(impares);

		// Exibindo as tres listas
		System.out.println("Lista de pares");
		for (int num : pares) {
			System.out.println(num);
		}

		System.out.println("Lista de impares");
		for (int num : impares) {
			System.out.println(num);
		}

		System.out.println("Exibindo todos os numeros");
		for (int num : geral) {
			System.out.println(num);
		}
	}

}
