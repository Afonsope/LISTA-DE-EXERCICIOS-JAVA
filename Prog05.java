import java.util.Scanner;
 
public class Prog05 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// VARIAVEIS
		double raio, altura, volume;
		
		
		// ENTRADA
		System.out.println("Calcular volume da circunferência");
		System.out.println("Informe o cario: ");
		raio = leitor.nextDouble();
		System.out.println("Informe a altura: ");
		altura = leitor.nextDouble();
		
		// PROCESSAMENTO
		volume = Math.PI * raio * raio * altura;
		
		System.out.println("Volume da circunferência: " + volume);
		
		leitor.close();
		System.exit(0);
	}// FIM DO MAIN

} // FIM DO PROGRAMA
