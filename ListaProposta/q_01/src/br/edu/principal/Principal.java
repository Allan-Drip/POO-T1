package br.edu.principal; 
 import java.util.Scanner; 
  
 public class Principal { 
         public static void main(String[] args){
        	 
        	 System.out.println("=========================="); 
        	 System.out.println("Subtra��o de dois n�meros."); 
        	 System.out.println("==========================\n"); 
        	 
                Scanner sc = new Scanner(System.in); 
                
                double n1,n2,resultado;
                
                System.out.println("Digite um n�mero : "); 
                 n1 = sc.nextDouble(); 
                 
                 System.out.println("Digite outro n�mero :  "); 
                 n2 = sc.nextDouble(); 
                 
                 resultado = n1 - n2;
                 System.out.println("O resultado da subtra��o do primeiro n�mero com o segundo n�mero foi: "+resultado);
         }
 }