import java.util.Scanner;

public class cadastramento_pessoa {

	public static void main(String[] args) {
		// Faça um programa em Java com Eclipse que peça as seguintes informações do usuário:
		// - Nome, 
		// - Idade,
		// - Endereço,
		// - Profissão,
		// - Telefone de contato,
		// - Email,
		// - CPF,
		// - RG
		// Ao final, exibir as informações digitadas
		
		
		// Entrada de dados
		String nome;
		int idade;
		String endereco;
		String profissao;
		String telefone;
		String email;
		String cpf;
		String rg;
		
		
		// Biblioteca para entrada de dados
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		Scanner entrada4 = new Scanner(System.in);
		Scanner entrada5 = new Scanner(System.in);
		Scanner entrada6 = new Scanner(System.in);
		Scanner entrada7 = new Scanner(System.in);
		Scanner entrada8 = new Scanner(System.in);
		
		
		// Pedir interação do usuário
		System.out.println("Digite o seu nome: ");
		nome = entrada.nextLine();

		System.out.println("Digite a sua idade: ");
		idade = entrada1.nextInt();
		
		System.out.println("Digite o seu endereço: ");
		endereco = entrada2.nextLine();
		
		System.out.println("Digite a sua profissão: ");
		profissao = entrada3.nextLine();
		
		System.out.println("Digite o seu telefone: ");
		telefone = entrada4.nextLine();
		
		System.out.println("Digite o seu email: ");
		email = entrada5.nextLine();
		
		System.out.println("Digite o seu CPF: ");
		cpf = entrada6.nextLine();
		
		System.out.println("Digite o seu RG: ");
		rg = entrada7.nextLine();
		
		
		// Exibindo as informações
		System.out.println("O nome do usuário é: " + nome + "\n"
				           + "A idade do usuário é: " + idade + "\n"
        				   + "A profissão do usuário é: " + profissao + "\n"
        				   + "O telefone do usuário é: " + telefone + "\n"
        				   + "O email do usuário é: " + email + "\n"
        				   + "O CPF do usuário é: " + cpf + "\n"
        				   + "O rg do usuário é: " + rg);
		
		
	}

}
