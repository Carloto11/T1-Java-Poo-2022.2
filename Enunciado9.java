package javaPoo2022;

import java.util.Scanner;

public class Enunciado9 {
	public static void main(String[] args) {
		float base, altura, area;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor da base (em metro):");
		base = leia.nextFloat();
		
		System.out.println("Digite o valor da altura (em metro) :");
		altura = leia.nextFloat();
		
		area  = (base*altura)/2;
		
		System.out.format("O valor da área é de %.2f metro(s).", area);
	}
}
