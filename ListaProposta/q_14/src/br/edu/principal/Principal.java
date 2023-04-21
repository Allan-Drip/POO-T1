package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		System.out.println("##################");
		System.out.println("MARCA��ES DE TEMPO ");
		System.out.println("################## \n");
		
		int AnoNasc = 0;
		int AnoAtual = 0;
		int idade = 0;
		int idadeMeses = 0;
		int idadeDias = 0;
		int idadeSemanas = 0;
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano do seu NASCIMENTO: ");
		AnoNasc = sc.nextInt();
		
		System.out.println("Digite o ano ATUAL: ");
		AnoAtual = sc.nextInt();
		
		idade = AnoAtual - AnoNasc;
		idadeMeses = idade * 12; // 1 ano possui 12 meses
		idadeDias = idade * 365; // 1 ano possui 365 dias
		idadeSemanas = idade * 52; // 1 ano possui 52 semanas
		
		System.out.println("Voc� possui " + idade + " anos, " + idadeMeses + " meses, " + idadeDias + " dias e " + idadeSemanas+ " semanas de vida!");
		
		
	}
}