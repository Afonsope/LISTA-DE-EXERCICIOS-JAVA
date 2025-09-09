import java.util.Scanner;

public class Prog12 {

	public static void main(String[] args) {
        
		Scanner leitor = new Scanner(System.in);
		
		//VARIÁVEIS
		double celsius, farenheit;
		
		// ENTRADA
		System.out.println("Prog12 - Conversão de Temperatura");
		System.out.print("Informe os Graus em Farenheit: ");	
		farenheit = leitor.nextDouble();
		
		// PROCESSAMENTO
		celsius = (farenheit -32)/1.8;
		
		// SAIDA
		System.out.println("------------------------------");
		System.out.println("Graus celcius: " + celsius);
		System.out.println("------------------------------");
		
		if (celsius > 30) {
			System.out.println("muito calor");
		}
		else if (celsius > 20) {
			System.out.println("Temperatura agradavel");
		}
		else {
		System.out.println("Muito Frio");	
		}
		
		leitor.close();
		System.exit(0);
	}
}
