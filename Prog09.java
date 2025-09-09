import java.util.Scanner;

public class Prog09 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
				
		// VARIAVEL
		double valor1, valor2, troca;
		
		// ENTRADA
		System.out.println("Troca de valores");
		
		System.out.print("Digite o primeiro número: ");
		valor1 = leitor.nextDouble();
		
		System.out.print("Digite o seundo número: ");
		valor2 = leitor.nextDouble();

		// PROCESSAMENTO		
		troca = valor1;
		valor1 = valor2;
		valor2 = troca;
		
		// SAIDA
		System.out.print("O primeiro número é: " + valor1 + "| O segundo número é: " + valor2);
		
		leitor.close();
		System.exit(0);
	}

}