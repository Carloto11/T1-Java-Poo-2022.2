package q15;
import java.util.Scanner;
public class Questao15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double preço, imposto, lucro, total;
		
		
		System.out.println("Qual o valor do carro na fabrica: ");
		preço = input.nextDouble();
		
		
		
		System.out.println("Qual a porcantagem de lucro do distribuidor: ");
		lucro = preço * input.nextDouble()/100;
		
		
		System.out.println("Qual a percentual do imposto aplicado: ");
		imposto = preço * input.nextDouble()/100;
		
		total = preço+imposto+lucro;
		
		
		System.out.printf("Lucro do distribuidor: R$%.2f\n", lucro);
		System.out.printf("Valor dos impostos: R$%.2f\n", imposto);
		System.out.printf("Preço final: R$%.2f\n", total);
		
	}
}
