import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Crie um programa em JAVA utilizando o Eclipse que peça 2 notas entre zero e dez de um aluno. Caso o valor digitado seja inválido, mostre uma mensagem de erro e continue pedindo 
		// as notas até que o usuário informe valores válidos. Assim que o usuário digitar notas válidas, calcular e exibir a média do aluno. (Utilize while)

		int nota1, nota2;
		double media;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite a primeira nota: ");
			nota1 = entrada1.nextInt();
			if(nota1>0 && nota1<11) {
				break;
			} else {
				System.out.println("Primeira nota invalida, digite novamente");
			}
		}
		while(true) {
			System.out.println("Digite a segunda nota: ");
			nota2 = entrada2.nextInt();
			if(nota2>0 && nota2<11) {
				break;
			} else {
				System.out.println("Segunda nota invalida, digite novamente");
			}
		}
		media = (nota1+nota2)/2;
		System.out.println("A média das notas eh: " + media);
	}
}
