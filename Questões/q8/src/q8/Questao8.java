package q8;
import java.util.Scanner;
public class Questao8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		double deposito, taxa, rendimento, total;
		
		
		System.out.println("Digite o valor do depósito: ");
		deposito = input.nextDouble();
		
		
		System.out.println("Digite o valor da taxa de juros: ");
		taxa = input.nextDouble();
		
		rendimento = deposito * (taxa/100);
		total = deposito + rendimento;
		
		
		System.out.printf("Valor do rendimento: R$%.2f\n", rendimento);
		System.out.printf("Valor total após redimento: R$%.2f", total);
		
		
		
	}
}
