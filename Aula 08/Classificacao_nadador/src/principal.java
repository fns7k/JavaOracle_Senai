import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/* Crie um programa em Java com Eclipse que leia a idade de um nadador e o classifique em uma das seguintes categorias:
		 * Idade entre 5 e 7 = “infantil A”
		 * Idade entre 8 e 10 = “infantil B”
		 * Idade entre 11 e 13 = “juvenil A”
         * Idade entre 14 e 17 = “juvenil B”
         * Idade igual ou superior a 18 = “sênior”
		*/
		
		Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite a idade do nadador:");
        int idade = entrada.nextInt();
        
        String categoria;
        
        if (idade >= 5 && idade <= 7) {
            categoria = "infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "juvenil B";
        } else {
            categoria = "sênior";
        }
        
        System.out.println("O nadador está na categoria: " + categoria);
        
	}

}
