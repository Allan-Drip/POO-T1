package br.edu.principal; 
 import java.util.Scanner; 
  
 public class Principal { 
  
         public static void main(String[] args) { 
                  
        	 System.out.println("=====================================");
        	 System.out.println("C�lculo do �ngulo formado pela escada");
        	 System.out.println("=====================================\n");

        	 
                 Scanner sc = new Scanner(System.in); 
                 
                 double ang,alt,radiano,escada; 
                 
                 System.out.println("Digite o valor do  �ngulo formado pela escada e o ch�o(valor em graus): "); 
                 ang = sc.nextDouble(); 
                 
                 System.out.println("Digite o valor da altura da parede: "); 
                 alt = sc.nextDouble(); 
                 
                 radiano = ang*3.14/180; 
                 escada = alt / Math.sin(radiano); 
                 System.out.printf("A medida da escada ser� de: %.2f",escada); 
         } 
  
 }





