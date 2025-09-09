import java.util.Scanner;

public class Prog10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// CONSTANTE
		final double PORCENTAGEM = 100.00;
				
		// VARIAVEL
		double valorAtual, valorNovo, taxa;
		
		// ENTRADA
		System.out.println("Reajuste de valor");
		System.out.print("Digite o valor atual: ");
		valorAtual = leitor.nextDouble();
		System.out.print("Digite a taxa de sreajuste: ");
		taxa = leitor.nextDouble();

		// PROCESSAMENTO		
		valorNovo = valorAtual * (1 + taxa / PORCENTAGEM);
		
		// SAIDA
		System.out.print("Esse é o valor atual: " + valorAtual);
		System.out.print("Esse é o valor novo: " + valorNovo);
		
		leitor.close();
		System.exit(0);
	}

}