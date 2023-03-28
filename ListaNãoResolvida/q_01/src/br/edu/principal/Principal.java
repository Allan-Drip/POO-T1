package br.edu.principal; 
 import java.util.Scanner; 
  
 public class Principal { 
         public static void main(String[] args){
        	 
        	 System.out.println("=========================="); 
        	 System.out.println("Subtração de dois números."); 
        	 System.out.println("==========================\n"); 
        	 
                Scanner sc = new Scanner(System.in); 
                
                double n1,n2,resultado;
                
                System.out.println("Digite um número : "); 
                 n1 = sc.nextDouble(); 
                 
                 System.out.println("Digite outro número :  "); 
                 n2 = sc.nextDouble(); 
                 
                 resultado = n1 - n2;
                 System.out.println("O resultado da subtração do primeiro número com o segundo número foi: "+resultado);
         }
 }
