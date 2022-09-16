package javaPoo2022;

import java.util.Scanner;

public class Enunciado16 {
	public static void main(String[] args) {
		float horasTrabalhadas, valorSalMin, valorHoraTrab, valorSalBruto, imposto, valorSalLiq;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite as suas horas trabalhadas no decorrer do mês:");
		horasTrabalhadas = sc.nextFloat();
		
		System.out.println("Digite o valor do salário mínimo:");
		valorSalMin = sc.nextFloat();
		
		valorHoraTrab = valorSalMin/2;
		valorSalBruto = valorHoraTrab*horasTrabalhadas;
		imposto = valorSalBruto*3/100;
		valorSalLiq = valorSalBruto - imposto;
		
		System.out.format("O valor do seu salário líquido (aquele salário a ser recebido) é de R$%.2f", valorSalLiq);
	}
}
