import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Faça um programa em Java utilizando Eclipse que leia 5 numeros e informe a media dos numeros digitados. (Utilize while)
		
		double num;
        int count = 0;
        double soma = 0;
        Scanner entrada = new Scanner(System.in);

        while (count < 5) {
            System.out.print("Numero " + (count + 1) + ": ");
            num = entrada.nextDouble();
            soma += num;
            count++;
        }

        double media = soma / 5;
        System.out.println("A soma dos numeros digitados eh: " + soma);
        System.out.println("A media dos números digitados eh: " + media);
    }

}
