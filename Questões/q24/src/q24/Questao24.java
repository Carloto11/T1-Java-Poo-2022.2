package q24;
import java.util.Scanner;


public class Questao24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Escreva um horário: ");
		
		double hora = input.nextDouble();
		
		int h_minuto = ((int) (hora)) * 60;
		
		int m = (int) ((hora % 1) * 100);
		
		int total = h_minuto + m;
		System.out.println("A hora completa em minutos: " + total);
	}
}
