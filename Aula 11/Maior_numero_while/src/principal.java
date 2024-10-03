import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int maior, num;
        int count = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero 1: ");
        num = entrada.nextInt();
        maior = num;

        while (count < 5) {
            System.out.print("Numero " + (count + 1) + ": ");
            num = entrada.nextInt();

            if (num > maior) {
                maior = num;
            }

            count++;
        }

        System.out.println("O maior numero digitado eh: " + maior);
    }
}