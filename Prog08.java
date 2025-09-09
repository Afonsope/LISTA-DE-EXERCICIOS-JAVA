import java.util.Scanner;

public class Prog08 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// CONSTANTES
		final double PESO1 = 0.5, PESO2 = 0.3, PESO3 = 0.2;
				
		// VARIAVEL
		double nota1, nota2, nota3, media;
		
		// ENTRADA
		System.out.println("Prog8 - Média Ponderada");
		
		System.out.print("Digite a nota 1: ");
		nota1 = leitor.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		nota2 = leitor.nextDouble();
		
		System.out.print("Digite a nota 3: ");
		nota3 = leitor.nextDouble();
				
		// PROCESSAMENTO		
		media = nota1 * PESO1 + nota2 * PESO2 + nota3 * PESO3;
		
		// SAIDA
		System.out.println("Média Ponderada: " + media);
		
		if(media >= 6.0) {
			System.out.println("Parabéns, aprovado");
			System.out.println("Ta de exame papai");
		}
		else {
			System.out.println("Reprovado");
		}
        
		
		leitor.close();
		System.exit(0);
	}

}