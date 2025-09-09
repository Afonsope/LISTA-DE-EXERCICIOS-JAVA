import java.util.Scanner;

public class Prog14 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// CONSTANTE
		final double VALOR_HORA_HOMEM = 35.00, VALOR_IMPOSTO = 0.08;
		
		// VARIAVEI
		int horaTrabalhada;
		double salarioBruto, desconto, salarioLiquido; 
		
		// ENTRADA
		System.out.println("+----------------------------+");
		System.out.println("|Prog 14 - Cálculo de salário|");
		System.out.println("+----------------------------+");
		System.out.println("Digite as horas trabalhadas: ");
		horaTrabalhada = leitor.nextInt();
		
		// PROCESSAMENTO
		salarioBruto = horaTrabalhada * VALOR_HORA_HOMEM;
		desconto = salarioBruto * VALOR_IMPOSTO;
		salarioLiquido = salarioBruto - desconto;
		
		// SAIDA
		System.out.println("+----------------------------+");
		System.out.printf("|Salário Bruto: R$ %.2f", salarioBruto);
		System.out.println("\n+----------------------------+");
		System.out.printf("|Desconto: R$ %.2f", desconto);
		System.out.println("\n+----------------------------+");
		System.out.printf("|Salário liquido: R$ %.2f", salarioLiquido);
		System.out.println("\n+----------------------------+");
		
		leitor.close();
		System.exit(0);
	}

}
