package q22;

import java.util.Scanner;

public class Enunciado22 {
	public static void main(String[] args) {
		float valorSalario, quantKw, valorKw, valorReais, desconto, valorDesconto;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Vamos calcular seus quilowatts, o valor a ser pago pela sua residência e o valor a ser pago com desconto de 15%!");
		
		System.out.println("Qual o valor do seu salário mínimo?");
		valorSalario = sc.nextFloat();
		
		System.out.println("Quantos quilowatts você utiliza?");
		quantKw = sc.nextFloat();
		
		valorKw = (valorSalario/5);
		valorReais = (valorKw*quantKw);
		desconto = (valorReais*(15/100));
		valorDesconto = (valorReais - desconto);
		
		System.out.format("O valor, em reais, de cada quilowatt é de %.2f", valorKw);
		System.out.format("O valor, em reais, a ser pago por essa residência é de %.2f", valorReais);
		System.out.format("O valor, em reais, a ser pago por essa residência com desconto é de %.2f", valorDesconto);
	}
}
