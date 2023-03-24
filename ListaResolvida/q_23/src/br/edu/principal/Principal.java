package br.edu.principal; 
  
 import java.util.Scanner; 
  
 public class Principal { 
  
         public static void main(String[] args) { 
        	 
        	 System.out.println("========================================================================");
        	 System.out.println("Mostrador da parte inteira, fracionária e arredondada de um número real");
        	 System.out.println("========================================================================\n");
        	 
                 Scanner sc = new Scanner(System.in); 
                 
                 
                 System.out.println("Digite um número real: "); 
                 double num = sc.nextDouble(); 
                 double x = Math.floor(num); 
                 double y = num - x; 
                 double z = Math.round(num); 
                 
                  System.out.println("A parte inteira do número digitado é: " + x); 
                 System.out.println("A parte fracionaria do número digitado é: " + y); 
                 System.out.println("A parte arredondada do número digitado é: " + z); } 
         } 
 
