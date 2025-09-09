import java.util.Scanner;
 
public class Prog06 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// VARIAVEIS
		double raio, area;
		
		// ENTRADA
		System.out.println("Calcular area de uma circunferência");
		System.out.println("Informe o raio: ");
		raio = leitor.nextDouble();
		
		// PROCESSAMENTO
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("área da circunferência: " + area);
		
		leitor.close();
		System.exit(0);
	}// FIM DO MAIN

} // FIM DO PROGRAMA
