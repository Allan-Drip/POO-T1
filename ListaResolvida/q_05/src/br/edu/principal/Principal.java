package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("******************************************************");
		System.out.println("Valor do seu salário após o aumento sofrido pelo mesmo");
		System.out.println("******************************************************\n");

		
		double sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salário atual: ");
		sal = sc.nextDouble();
		
		double perc;
		Scanner pc = new Scanner(System.in);
		System.out.println("Digite o valor do aumento da porcentagem do salário: ");
		perc = pc.nextDouble();
		
		double novosal;
		novosal = sal * ((100+perc)/100);
		System.out.println("O novo valor do salário é de: " +novosal+ " reais");
		
	}
}
