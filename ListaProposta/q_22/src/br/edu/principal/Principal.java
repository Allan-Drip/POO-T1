package br.edu.principal; 
 import java.util.Scanner; 
  
 public class Principal { 
	 
         public static void main(String[] args) { 
        	 
        	 System.out.println("=========================================================================================");
        	 System.out.println("Número de diagonais de um polígono convexo regular com base no número de lados do mesmo. ");
        	 System.out.println("=========================================================================================\n");
        	 
                 Scanner sc = new Scanner(System.in); 
                 
                 int n,nd; 
                 
                 System.out.println("Digite o número de lados do poligono: "); 
                 n = sc.nextInt(); 
                 
                 nd = n * (n-3)/2;
                 System.out.println("O número de diagonais desse poligono é: "+nd); 
         } 
  
 }
