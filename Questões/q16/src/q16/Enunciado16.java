package q16;

import java.util.Scanner;

public class Enunciado16 {
	public static void main(String[] args) {
		float horasTrabalhadas, valorSalMin, valorHoraTrab, valorSalBruto, imposto, valorSalLiq;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Vamos calcular seu sal�rio l�quido!");
		System.out.println("Digite as suas horas trabalhadas no decorrer do m�s:");
		horasTrabalhadas = sc.nextFloat();
		
		System.out.println("Digite o valor do sal�rio m�nimo:");
		valorSalMin = sc.nextFloat();
		
		valorHoraTrab = valorSalMin/2;
		valorSalBruto = valorHoraTrab*horasTrabalhadas;
		imposto = valorSalBruto*3/100;
		valorSalLiq = valorSalBruto - imposto;
		
		System.out.format("O valor do seu sal�rio l�quido (aquele sal�rio a ser recebido) � de R$%.2f", valorSalLiq);
	}
}