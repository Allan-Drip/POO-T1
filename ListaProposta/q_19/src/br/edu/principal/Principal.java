package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		System.out.println("##################################################");
		System.out.println("Quanto de Watts preciso para iluminar um ambiente?");
		System.out.println("################################################## \n");
		
		double comprimento1 = 0;
		double comprimento2 = 0;
		double area = 0;
		double potencia = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro comprimento do seu c�modo: ");
		comprimento1 = sc.nextDouble();
		System.out.println("Digite o segundo comprimento do seu c�modo: ");
		comprimento2 = sc.nextDouble();
		
		area = comprimento1 * comprimento2;
		
		potencia = area * 18; // pot�ncia foi inicializada como double para n�o precisar de altera��es na linha 21
		
		System.out.println("Em uma �rea de " + area + " m�, dever� ser utilizado um total de " + potencia+ "W para iluminar o local.");
				
	}
}