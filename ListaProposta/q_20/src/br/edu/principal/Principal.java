package br.edu.principal;

import java.util.Scanner;

public class Principal { 
  
         public static void main(String[] args) { 
        	 
        	 System.out.println("===================================================="); 
        	 System.out.println("C�lculo do comprimento de uma escada apoiada no ch�o"); 
        	 System.out.println("====================================================\n"); 
        	 
                   Scanner sc = new Scanner(System.in); 
                  
                 Double dist = 0.0; 
                 System.out.print("Digite a dist�ncia da escada para a parede: "); 
                 dist = sc.nextDouble(); 
                  
                 Double ang = 0.0; 
                 System.out.print("Digite o �ngulo formado entre a escada e o ch�o: "); 
                 ang = sc.nextDouble(); 
                  
                 Double radiano = ang * Math.PI / 180; 
                 Double escada = dist / Math.cos(radiano); 
                  
                 System.out.println("O comprimento da escada deve ser: "+escada); 
                 } 
  
         } 
 






