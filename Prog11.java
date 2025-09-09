import java.util.Scanner;

public class Prog11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
				
		// VARIAVEL
		double numero;
		
		// ENTRADA
		System.out.println("Calculo de números");
		System.out.print("Digite um número: ");
		numero   = leitor.nextDouble();		
		
		// SAIDA
		System.out.print("Dobro do valor " + (numero * 2));
		System.out.print("Metade do valor: " + (numero / 2));
		System.out.print("Ao quadrado: " +  (Math.pow(numero, 2)));
		System.out.print("Ao cubo: " + (Math.pow(numero, 3)));
		
		leitor.close();
		System.exit(0);
	}

}