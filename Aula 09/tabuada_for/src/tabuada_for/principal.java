package tabuada_for;

public class principal {


	public static void main(String[] args) {
		// Fazer um projeto no Java utilizando Eclipse que seja uma tabuada de 1 ate o 10 utilizando função for
		
		
		for (int i = 1; i <= 10; i++) {		// Loop externo para alterar de 1 a 10 para o multiplicador i
		    System.out.println("Tabuada do " + i + ":");
		    
		    for (int j = 1; j <= 10; j++) { 	// Loop interno para alterar de 1 a 10 para o multiplicador j
		        System.out.println(i + " x " + j + " = " + (i * j));
		        
		    } 	// Fim do loop interno
		} 	// Fim do loop externo

		
		
	}
}
