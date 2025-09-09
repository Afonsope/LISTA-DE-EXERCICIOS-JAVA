import java.util.Scanner;

public class Prog13 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// CONSTANTE
		final double DOLAR = 5.41;
				
		// VARIAVEL
		double real, conversao;
		
		// ENTRADA
		System.out.println("Conversão para dólares");
		System.out.print("Quantos reais você quer converter: R$");
		real = leitor.nextDouble();		
		
		// PROCESSAMENTO
		conversao = real / DOLAR;
		
		// SAIDA
		System.out.printf("Você terá US$ %.2f", conversao);
		
		leitor.close();
		System.exit(0);
	}

}