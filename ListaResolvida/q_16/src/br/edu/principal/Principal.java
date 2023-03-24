package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		System.out.println("======================================================================================================");
		System.out.println("Mostrador do total de convites que devem ser vendidos para arcar com o custo da produção do espetáculo!");
		System.out.println("======================================================================================================\n");

		double custo = 0;
		double convite = 0;
		double quantidade = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do custo do espetáculo: ");
		custo = sc.nextDouble();
		
		System.out.println("Digite o valor do convite do espetáculo: ");
		convite = sc.nextDouble();
		
		quantidade = custo / convite;
		System.out.println("O total de convites que devem ser vendidos para arcar com o custo da produção do espetáculo é: " + quantidade);
	}
}
