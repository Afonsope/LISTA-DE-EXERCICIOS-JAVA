import java.util.Scanner;

public class Prog15 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// CONSTANTE
		final double PREMIO = 780000;
		
		// VARIAVEL
		double pontosC1, pontosC2, pontosC3, soma;
		
		// ENTRADA
		System.out.print("Digite a pontuação do Candidato 1: ");
		pontosC1 = leitor.nextInt();
		System.out.print("\nDigite a pontuação do Candidato 2: ");
		pontosC2 = leitor.nextInt();
		System.out.print("\nDigite a pontuação do Candidato 3: ");
		pontosC3 = leitor.nextInt();
		
		// PROCESSAMENTO
		soma = pontosC1 + pontosC2 + pontosC3;
		
		// SAIDA
		System.out.println("---------------------PREMMIAÇÃO----------------------");
		System.out.printf("Prêmio do Candidato 1: R$ %.2f", pontosC1 / soma * PREMIO);
		System.out.printf("\nPrêmio do Candidato 2: R$ %.2f", pontosC2 / soma * PREMIO);
		System.out.printf("\nPrêmio do Candidato 3: R$ %.2f", pontosC3 / soma * PREMIO);
		
		leitor.close();
		System.exit(0);
	}

}
