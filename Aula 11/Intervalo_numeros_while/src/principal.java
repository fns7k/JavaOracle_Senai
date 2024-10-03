import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Faça um programa em Java com Eclipse que receba dois números inteiros e exiba os números inteiros que estão no intervalo compreendido por pelos números digitados. (Utilize whille)

		Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Os numeros inteiros no intervalo compreendido sao: ");
        int i = num1;
        while (i <= num2) {
            System.out.println(i);
            i++;
        }
	}

}
