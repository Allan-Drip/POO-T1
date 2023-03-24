 package br.edu.principal; 
 import java.util.Scanner; 
 public class Principal { 
  
         public static void main(String[] args) { 
        	 
        	 System.out.println("====================================");
        	 System.out.println("Cálculo da área do círculo em metros");
        	 System.out.println("====================================\n");
        	 

                 double area; 
                 double raio; 
                 
                 Scanner sc = new Scanner(System.in); 
                 
              
                 System.out.println("Digite o valor do raio desse círculo: "); 
                 
                 raio = sc.nextDouble(); 
                 area = 3.1415 * Math.pow(raio, 2); 
                 
                 System.out.println("A área desse círculo será de "+area+" metros quadrados."); 
  
         } 
  
 }
