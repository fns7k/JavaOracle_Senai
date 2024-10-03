
public class principal {

	public static void main(String[] args) {
		// Matrizes, Arrays, Vetores, Listas...
		String aluno[];
		aluno = new String[3];
		aluno[0] = "Gustavo";
		aluno[1] = "Alisson";
		aluno[2] = "Rodrigo";
		
		// Exibindo elementos da matriz
		System.out.println(aluno[0]);
		
		// Exibindo todo mundo na matriz
		for(int i = 0; i<3; i++) {
			System.out.println(aluno[i]);
		}
		
		int numerosPares[] = new int[4];
		int InicioNumerosPares = 20;
		
		// 4 numeros pares a partir do 20
		for(int i = 0; i<4; i++) {
			numerosPares[i] = InicioNumerosPares;
			InicioNumerosPares +=2;
		}
		
		// For para exibir
		// Exibindo numeros pares
		for(int i =0; i<4; i++) {
			System.out.println(numerosPares[i]);
		}
		
		System.out.println("\n");
		
		// Matrizes de times de futebol
		String times[] = {"São Paulo", "Santos", "Palmeiras", "Bragantino"};
		
		// For para exibir
		for(int i =0; i<times.length;i++) {
			System.out.println(times[i]);
		}
		
		
	}

}
