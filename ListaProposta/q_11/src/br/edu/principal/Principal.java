package br.edu.principal; 
 import java.util.Scanner; 
  
 public class Principal { 
       
	 public static void main(String[] args){
		 
		 System.out.println("============================");
		 System.out.println("Valor da área de um losango.");
		 System.out.println("============================\n");
		 
                 Scanner sc = new Scanner(System.in); 
                
                 double dimaior,dimenor; 
                 System.out.println("Digite o valor da Diagonal maior: "); 
                 
                 dimaior = sc.nextDouble(); 
                 System.out.println("Digite o valor da Diagonal menor: "); 
                 
                 dimenor = sc.nextDouble(); 
                 System.out.println("O valor da área do losango : "+(dimaior*dimenor)/2); 
         } 
  
 }