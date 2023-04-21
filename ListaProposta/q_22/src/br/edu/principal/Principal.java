package br.edu.principal; 
 import java.util.Scanner; 
  
 public class Principal { 
	 
         public static void main(String[] args) { 
        	 
        	 System.out.println("=========================================================================================");
        	 System.out.println("N�mero de diagonais de um pol�gono convexo regular com base no n�mero de lados do mesmo. ");
        	 System.out.println("=========================================================================================\n");
        	 
                 Scanner sc = new Scanner(System.in); 
                 
                 int n,nd; 
                 
                 System.out.println("Digite o n�mero de lados do poligono: "); 
                 n = sc.nextInt(); 
                 
                 nd = n * (n-3)/2;
                 System.out.println("O n�mero de diagonais desse poligono �: "+nd); 
         } 
  
 }
