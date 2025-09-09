import java.util.Scanner;
 
public class Prog01 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		// VARIAVEIS
		double nota1, nota2, media;
		
		// CONSTANTE
		final double MEDIA_APROVACAO = 6, MEDIA_EXAME = 5;
		
		// ENTRADA
		System.out.println("Prog 01 - Calculo de Media");
		
		System.out.print("Digite a nota 1: ");
		nota1 = leitor.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		nota2 = leitor.nextDouble();
		
		// PROCESSAMENTO
		media = (nota1 + nota2) /2;
		
		// ENTRADA
		System.out.println("A média é : " + media);
		
		if(media >= MEDIA_APROVACAO) {
			System.out.println("Não fez nada de mais!");
		}
		
		if(media >= MEDIA_EXAME){
			System.out.println("Exame de segunda época te espera!");
		}
		
		else {
			System.out.println("Te vejo semestre que vem!");
		}
		
		leitor.close();
		System.exit(0);
	}// FIM DO MAIN

} // FIM DO PROGRAMA
