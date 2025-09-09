import java.util.Scanner;
 
public class Prog02 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// VARIAVEIS
		double largura, comprimento, area;
		
		
		// ENTRADA
		System.out.println("Calcular área de um retângulo");
		System.out.println("Informe a largura: ");
		largura = leitor.nextDouble();
		System.out.println("Informe a comprimento: ");
		comprimento = leitor.nextDouble();
		
		// PROCESSAMENTO
		area = largura * comprimento;
		
		System.out.println("Área do retangulo: " + area);
		
		leitor.close();
		System.exit(0);
	}// FIM DO MAIN

} // FIM DO PROGRAMA
