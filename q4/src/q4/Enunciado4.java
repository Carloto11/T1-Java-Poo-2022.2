package q4;

import java.util.Scanner;

public class Enunciado4 {
	public static void main(String[] args) {
			float sal, novoSal;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qual o valor do seu salário?");
			sal = sc.nextFloat();

			novoSal = sal + (sal*25/100);
			
			System.out.format("Seu novo salário é R$%.2f", novoSal);
	}
}
