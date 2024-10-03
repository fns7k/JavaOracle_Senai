import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Faça um programa em Java com Eclipse que peça para o usuario digitar 3 numeros, logo em seguida o programa deve exibir o maior e o menor numero digitado
		
		int numero;
		int maior = -2147483648;		// Pesquisei o maior valor "int" (inteiro) a ser escrito no Java
        int menor = 2147483647;			// Pesquisei o menor valor "int" (inteiro) a ser escrito no Java
        
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite tres numeros:");
		
		for (int i = 0; i < 3; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            numero = entrada.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
		
        System.out.println("O maior numero digitado é: " + maior);
        System.out.println("O menor numero digitado é: " + menor);
        
        
        
	}

}
