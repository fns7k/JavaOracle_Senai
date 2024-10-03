import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		// Arraylist
		ArrayList<String> nomesAlunos = new ArrayList<>();
		
		// Preencher minha ArrayList
		nomesAlunos.add("Pedro");
		nomesAlunos.add("Cauã");
		nomesAlunos.add("Willian");
		nomesAlunos.add("Eduardo");
		
		// Exibindo minha ArrayList
		for(int i= 0; i<nomesAlunos.size(); i++) {
			System.out.println(nomesAlunos.get(i));
		}
		
		// Exibindo de uma segunda forma
		for(String alu : nomesAlunos) {
			System.out.println(alu);
		}

	}

}
