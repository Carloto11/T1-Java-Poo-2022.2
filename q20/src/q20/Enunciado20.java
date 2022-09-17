package q20;

import java.util.Scanner;

public class Enunciado20 {
	public static void main(String[] args) {
		
		double angulo, altura, escada, radiano;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos calcular o tamanho da sua escada!");
		
		System.out.println("Digite o �ngulo formado por sua escada (em graus): ");
		angulo = sc.nextDouble();
		
		System.out.println("Digite a altura da parede: ");
		altura = sc.nextDouble();
		
		radiano = angulo*(3.14f/180);
		escada = altura/Math.sin(radiano);
		
		System.out.format("Sua escada mede %.2f metros", escada);
		
	}
}
