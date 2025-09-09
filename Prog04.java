import java.util.Scanner;
 
public class Prog04 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// VARIAVEIS
		double baseMaior, baseMenor, altura, area;
		
		
		// ENTRADA
		System.out.println("Calcular área de um trapézio");
		System.out.println("Informe a base maior: ");
		baseMaior = leitor.nextDouble();
		System.out.println("Informe a base menor: ");
		baseMenor = leitor.nextDouble();
		System.out.println("Informe a altura: ");
		altura = leitor.nextDouble();
		
		// PROCESSAMENTO
		area = ((baseMaior + baseMenor) * altura)/ 2;
		
		System.out.println("Área do trapézio: " + area);
		
		leitor.close();
		System.exit(0);
	}// FIM DO MAIN

} // FIM DO PROGRAMA
