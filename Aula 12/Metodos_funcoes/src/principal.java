import java.util.Scanner;

import calculos.informacoes;

public class principal {
	// Método para efetuar a soma de dois números
	public static void somar() {
		int numero1;
		int numero2;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		numero1= entrada1.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2= entrada2.nextInt();
		int soma;
		soma = numero1 + numero2;
		System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + soma);		
	}
	
	
	//subtracao
	//divisao
	//multiplicação
	//raiz quadrada
	//exponenciação
	
	
	public static void subtrair() {
		int numero1;
		int numero2;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		numero1= entrada1.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2= entrada2.nextInt();
		int subtracao;
		subtracao = numero1 - numero2;
		System.out.println("A subtracao de " + numero1 + " - " + numero2 + " = " + subtracao);		
	}
	
	
	public static void dividir() {
		int numero1;
		int numero2;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		numero1= entrada1.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2= entrada2.nextInt();
		int divisao;
		divisao = numero1 / numero2;
		System.out.println("A divisao de " + numero1 + " / " + numero2 + " = " + divisao);		
	}
	
	
	public static void multiplicar() {
		int numero1;
		int numero2;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		numero1= entrada1.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2= entrada2.nextInt();
		int multiplicacao;
		multiplicacao = numero1 * numero2;
		System.out.println("A multiplicacao de " + numero1 + " x " + numero2 + " = " + multiplicacao);		
	}
	
	
	public static void raiz_quadrada() {
		int numero1;
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		numero1= entrada1.nextInt();
		int raiz_quadrada;
		raiz_quadrada = (int) Math.sqrt(numero1);
		System.out.println("A raiz quadrada de " + numero1 + " = " + raiz_quadrada);		
	}
	
	
	public static void exponenciacao() {
		int numero1;
		int numero2;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		numero1= entrada1.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2= entrada2.nextInt();
		int exponenciacao;
		exponenciacao =(int) Math.pow(numero1, numero2);
		System.out.println("A multiplicacao de " + numero1 + " ^ " + numero2 + " = " + exponenciacao);		
	}
	
	
	

	public static void main(String[] args) {
		// Programa que faz as quatros operações básicas 
		/*somar();
		subtrair();
		dividir();
		multiplicar();
		raiz_quadrada();
		*/exponenciacao();
	}

}
