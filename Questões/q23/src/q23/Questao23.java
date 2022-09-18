package q23;
import java.util.Scanner;

public class Questao23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		float num = input.nextFloat();
		
		int inteiro = (int) (num);
		double fracao = num % 1;
		int arredondado = (int) Math.round(num);
		
		
		
		System.out.printf("Valor inteiro: %d\n", inteiro);
		System.out.printf("Parte fracionada: %.3f\n", fracao);
		System.out.printf("Valor arrendondado: %d\n", arredondado);
	}
}
