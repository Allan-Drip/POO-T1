 package br.edu.principal; 
 import java.util.Scanner; 
 public class Principal { 
  
         public static void main(String[] args) { 
        	 
        	 System.out.println("====================================");
        	 System.out.println("C�lculo da �rea do c�rculo em metros");
        	 System.out.println("====================================\n");
        	 

                 double area; 
                 double raio; 
                 
                 Scanner sc = new Scanner(System.in); 
                 
              
                 System.out.println("Digite o valor do raio desse c�rculo: "); 
                 
                 raio = sc.nextDouble(); 
                 area = 3.1415 * Math.pow(raio, 2); 
                 
                 System.out.println("A �rea desse c�rculo ser� de "+area+" metros quadrados."); 
  
         } 
  
 }
