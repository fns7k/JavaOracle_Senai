import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*
		 * Escreva um programa em Java com Eclipse que solicite vários números ao
		 * usuário, possibilitando encerrar a entrada de dados informando zero. Armazene
		 * os números em uma lista, depois percorrra esta lista alimentando outras duas
		 * listas, uma com números pares e outra com números ímpares. Ordene e imprima
		 * todas as listas em ordem crescente.
		 */
		
		
		
		Scanner entrada = new Scanner(System.in);
		List<Integer> listaOriginal = new ArrayList<>();		// Pesquisei na internet como usar para poder utilizar no código
		List<Integer> listaPares = new ArrayList<>();
		List<Integer> listaImpares = new ArrayList<>();

		System.out.println("Digite vários números (ou 0 para encerrar):");
		int numero = entrada.nextInt();
		while (numero != 0) {
            listaOriginal.add(numero);
            numero = entrada.nextInt();
        }

        // Separando números pares e ímpares
        for (int num : listaOriginal) {
            if (num % 2 == 0) {
                listaPares.add(num);
            } else {
                listaImpares.add(num);
            }
        }

		Collections.sort(listaOriginal);		// Pesquisei na internet como usar para poder utilizar no código
		Collections.sort(listaPares);
		Collections.sort(listaImpares);

		System.out.println("Lista original em ordem crescente:");
		System.out.println(listaOriginal);
		System.out.print("\n");		// Pular linha

		System.out.println("Lista de números pares em ordem crescente:");
		System.out.println(listaPares);
		System.out.print("\n");		// Pular linha

		System.out.println("Lista de números ímpares em ordem crescente:");
		System.out.println(listaImpares);
	}

}