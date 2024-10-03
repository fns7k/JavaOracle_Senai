import java.util.Random;

public class principal {

	public static void main(String[] args) {
		// 02 - Crie um programa em Java com Eclipse que sorteie seis numeros simulando um jogo da Mega Sena. 
		// Faça com que o programa exiba os seis numeros sorteados 
		
		Random sorteio = new Random();
        
        int[] numeros = new int[6];
        
        for (int i = 0; i < 6; i++) {
            numeros[i] = sorteio.nextInt(60) + 1;
        }
        
        System.out.println("Números sorteados:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " ");
        }
	}
}
