
public class exercicio_03 {

	public static void main(String[] args) {
		// 03 - Crie um programa em Java que calcule e mostre a área e o perímetro de um círculo com raio de valor 6

		// Cálculo de area e perimetro do circulo
				// areaCirculo = raio² * PI
				// pi = 3,14
				double areaCirculo;
				double raio = 6;
				areaCirculo = raio * raio * 3.14;
				System.out.println("A area do circulo com raio de valor 6 é: " + areaCirculo);
				
				// perimetro = 2 * pi * raio
				double perimetro; 
				perimetro = 2 * 3.14 * raio;
				System.out.println("O valor do perimetro com raio de valor 6 é: " + perimetro);
	}

}
