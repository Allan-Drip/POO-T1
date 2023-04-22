package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
	
		System.out.println("#############################");
		System.out.println("Valor da área de um trapézio ");
		System.out.println("#############################\n");
		
		double bmaior = 0;
		double bmenor = 0;
		double altura = 0;
		double area = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base maior: ");
		bmaior = sc.nextDouble();
		
		System.out.println("Digite o valor da base menor: ");
		bmenor = sc.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
		
		area = ((bmaior+bmenor)*altura)/2;
		System.out.println("O valor da área do trapézio é: "+area);		 
}
}

