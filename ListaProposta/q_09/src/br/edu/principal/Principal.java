package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		System.out.println("################################## ");
		System.out.println("Vamos calcular a área do trapézio!: ");
		System.out.println("################################## \n");
		
		double BaseMaior = 0;
		double BaseMenor = 0;
		double altura = 0;
		double area = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base MAIOR: ");
		BaseMaior = sc.nextDouble();
		
		System.out.println("Digite o valor da base MENOR: ");
		BaseMenor = sc.nextDouble();
		
		System.out.println("Digite o valor da ALTURA: ");
		altura = sc.nextDouble();
		
		area = ((BaseMaior + BaseMenor) * altura) / 2 ;
		System.out.println("O valor da área é: " + area);
	}
}
