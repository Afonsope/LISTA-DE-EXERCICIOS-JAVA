import java.util.Scanner;
 
public class Prog03{
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// VARIAVEIS
		double base, altura, area;
		
		
		// ENTRADA
		System.out.println("Calcular área de um triangulo");
		System.out.println("Informe a base: ");
		base = leitor.nextDouble();
		System.out.println("Informe a altura: ");
		altura = leitor.nextDouble();
		
		// PROCESSAMENTO
		area = (base * altura) / 2;
		
		System.out.println("Área do triangulo: " + area);
		
		leitor.close();
		System.exit(0);
	}// FIM DO MAIN

} // FIM DO PROGRAMA
