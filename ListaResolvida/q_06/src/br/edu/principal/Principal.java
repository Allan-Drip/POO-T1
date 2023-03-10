package br.edu.principal;
import java.util.Scanner;
public class Principal {

    
	public static void main(String[] args) {
		
		System.out.println("Este programa mostrará o valor do seu salário após as mudanças sofridas pelo mesmo. \n");

		double sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salário: ");
		sal = sc.nextDouble();
		
		 double grat = sal * 1.05;
		 double imp = sal * 1.07;
		 float salreceber = (float) (sal + grat - imp);
		 
		 System.out.println("O valor final do salário será de: " +salreceber);
		
	}
}
