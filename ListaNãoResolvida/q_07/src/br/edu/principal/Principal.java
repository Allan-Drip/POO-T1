package br.edu.principal; 
  import java.util.Scanner; 
  
 public class Principal { 
 
         public static void main(String[] args) { 
        	 
        	 System.out.println("=================================================================");
        	 System.out.println("Variância da sua massa corporal em 15 % (para mais ou para menos)");
        	 System.out.println("=================================================================\n");

 Scanner sc = new Scanner(System.in); 
          
         double peso = 0.0; 
         System.out.println("Digite o seu peso(em quilos): "); 
         peso = sc.nextDouble(); 
          
         System.out.println("O seu peso atual é "+peso+" quilos."); 
          
         double engo = ((15 * peso)/100) + peso; 
         double emag = peso - ((20 * peso)/100); 
          
         System.out.println("Se você engordar 15% do seu peso ficará com "+engo+" quilos."); 
         System.out.println("Se você emagrecer 20% do seu peso ficará com "+emag+" quilos."); 
         } 
 }
