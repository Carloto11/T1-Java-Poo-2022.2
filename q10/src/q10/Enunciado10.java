package q10;

import java.util.Scanner;

public class Enunciado10 {
	public static void main(String[] args) {
		float area, raio;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos calcular a �rea do seu c�rculo!");
		
		System.out.println("Digite o raio do c�rculo (em metros):");
		raio = sc.nextFloat();
		
		area = 3.1415f*raio;
		System.out.format("A sua �rea � em metros %.2f", area);
	}
}