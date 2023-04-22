package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
		
        	 System.out.println("==========================================================");
        	 System.out.println("Cálculo de um depósito menos um imposto de cada de cheque ");   
        	 System.out.println("==========================================================\n");

                 Scanner sc = new Scanner(System.in); 
                 
                 double salario,cheque1,cheque2,cf1,cf2,saldo; 
                 
                 System.out.println("Digite o valor do seu salário: "); 
                 salario = sc.nextDouble(); 
                 
                 
                 System.out.println("Digite o valor do depósito: "); 
                 saldo = sc.nextDouble(); 
                 
                 System.out.println("Digite o valor do cheque1: "); 
                 cheque1 = sc.nextDouble(); 
                 
                 System.out.println("Digite o valor do cheque2: "); 
                 cheque2 = sc.nextDouble(); 
                 
                 cf1 = cheque1 * 0.0038; 
                 cf2 = cheque2 * 0.0038; 
                 saldo = salario - cheque1 - cheque2 - cf1 - cf2; 
                 System.out.println("O valor do saldo atual é de: "+(saldo)); 
         } 
  
 }




