package br.edu.principal; 
 import java.util.Scanner; 
  
 public class Principal { 
  
         public static void main(String[] args) { 
        	 
        	 System.out.println("=============================================================="); 
        	 System.out.println("Calculo de quanto restar� de ra��o para dois gatos ap�s 5 dias"); 
        	 System.out.println("==============================================================\n"); 

                 Scanner sc = new Scanner(System.in); 
                 
                 double peso_saco,racao_gato1,racao_gato2,totalfinal; 
                 
                 System.out.println("Digite o peso total do saco de ra��o em Kg: "); 
                 peso_saco = sc.nextDouble(); 
                 
                 System.out.println("Digite a quantidade em gramas dar� ao gato1: "); 
                 racao_gato1 = sc.nextDouble(); 
                 
                 racao_gato1 = racao_gato1 / 1000; 
                 System.out.println("Digite a quantidade em gramas dar� ao gato2: "); 
                 racao_gato2 = sc.nextDouble(); 
                 
                 racao_gato2 = racao_gato2 / 1000; 
                 
                 totalfinal = peso_saco - 5*(racao_gato1 + racao_gato2); 
                 System.out.println("Ap�s 5 dias, restar� "+ totalfinal + " Kg de ra��o"); 
                  
         } 
  
 }
 
