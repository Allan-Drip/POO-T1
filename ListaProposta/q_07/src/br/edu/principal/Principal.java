package br.edu.principal; 
  import java.util.Scanner; 
  
 public class Principal { 
 
         public static void main(String[] args) { 
        	 
        	 System.out.println("=================================================================");
        	 System.out.println("Vari�ncia da sua massa corporal em 15 % (para mais ou para menos)");
        	 System.out.println("=================================================================\n");

         Scanner sc = new Scanner(System.in); 
          
         double peso = 0.0; 
         System.out.println("Digite o seu peso(em quilos): "); 
         peso = sc.nextDouble(); 
          
         System.out.println("O seu peso atual � "+peso+" quilos."); 
          
         double engo = ((15 * peso)/100) + peso; 
         double emag = peso - ((20 * peso)/100); 
          
         System.out.println("Se voc� engordar 15% do seu peso ficar� com "+engo+" quilos."); 
         System.out.println("Se voc� emagrecer 20% do seu peso ficar� com "+emag+" quilos."); 
         } 
 }