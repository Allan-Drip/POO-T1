package br.edu.principal; 
  
 import java.util.Scanner; 
  
 public class Principal { 
  
         public static void main(String[] args) { 
        	 
        	 System.out.println("========================================================================");
        	 System.out.println("Mostrador da parte inteira, fracion�ria e arredondada de um n�mero real");
        	 System.out.println("========================================================================\n");
        	 
                 Scanner sc = new Scanner(System.in); 
                 
                 
                 System.out.println("Digite um n�mero real: "); 
                 double num = sc.nextDouble(); 
                 double x = Math.floor(num); 
                 double y = num - x; 
                 double z = Math.round(num); 
                 
                  System.out.println("A parte inteira do n�mero digitado �: " + x); 
                 System.out.println("A parte fracionaria do n�mero digitado �: " + y); 
                 System.out.println("A parte arredondada do n�mero digitado �: " + z); } 
         } 
 
