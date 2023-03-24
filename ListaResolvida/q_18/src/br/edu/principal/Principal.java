package br.edu.principal; 
 import java.util.Scanner; 
  
 public class Principal { 
  
         public static void main(String[] args) { 
        	 
        	 System.out.println("=============================================================="); 
        	 System.out.println("Calculo de quanto restará de ração para dois gatos após 5 dias"); 
        	 System.out.println("==============================================================\n"); 

                 Scanner sc = new Scanner(System.in); 
                 
                 double peso_saco,racao_gato1,racao_gato2,totalfinal; 
                 
                 System.out.println("Digite o peso total do saco de ração em Kg: "); 
                 peso_saco = sc.nextDouble(); 
                 
                 System.out.println("Digite a quantidade em gramas dará ao gato1: "); 
                 racao_gato1 = sc.nextDouble(); 
                 
                 racao_gato1 = racao_gato1 / 1000; 
                 System.out.println("Digite a quantidade em gramas dará ao gato2: "); 
                 racao_gato2 = sc.nextDouble(); 
                 
                 racao_gato2 = racao_gato2 / 1000; 
                 
                 totalfinal = peso_saco - 5*(racao_gato1 + racao_gato2); 
                 System.out.println("Após 5 dias, restará "+ totalfinal + " Kg de ração"); 
                  
         } 
  
 }
 
