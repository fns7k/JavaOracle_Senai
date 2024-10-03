package aprovado_reprovado_media;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/* Crie um programa em Java com Eclipse que leia o nome de um aluno e suas três notas. Logo após, o programa deve calcular a média e informar de acordo com o status do aluno 
		 * de acordo com as seguintes caracteristicas:
		 * Média entre menor que 4 --> reprovado;
		 * Média maior que 4 e menor que 6 --> recuperação;
		 * Média maior ou igual a 6 --> aprovado
		 */
		
		String aluno;
		double nota1, nota2, nota3;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		Scanner entrada4 = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		aluno = entrada1.next();
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada2.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada3.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = entrada4.nextInt();
		
		double media = (nota1 + nota2 + nota3)/3;
		
		if (media < 4) {
			System.out.println("Reprovado");
		}
		
		else if (media > 4 && media < 6) {
			System.out.println("Recuperação");
		}
		
		else {
			System.out.println("Aprovado");
		}
	}

}
