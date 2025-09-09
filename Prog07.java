import java.util.Scanner;

public class Prog07 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// VARIAVEIS
		double raio, geratriz, area;
		
		// ENTRADA
		System.out.println("+-------------------------+");
		System.out.println("|Prog 07 - Área de um cone|");
		System.out.println("+-------------------------+");
		System.out.println("Digite a área: ");
		raio = leitor.nextDouble();
		System.out.println("Digite a geratriz: ");
		geratriz = leitor.nextDouble();

		// PROCESSAMENTO
		area = Math.PI * raio * ( raio + geratriz);
		
		// SAIDA
		System.out.printf("A área do cone é: %.2f", area);
		
		leitor.close();
		System.exit(0);
	}

}
