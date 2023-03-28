package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
	
		System.out.println("############################# ");
		System.out.println("Qual a sua massa em gramas??? ");
		System.out.println("############################# \n");
		
		double massa = 0;
		double gramas = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua massa em kilogramas: ");
		massa = sc.nextDouble();
		
		gramas = massa * 1000;
		System.out.println("Sua massa em gramas é: " + gramas);
}
}
