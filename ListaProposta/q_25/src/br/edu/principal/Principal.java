package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		System.out.println("######################################");
		System.out.println("Conversor de horas, minutos e segundos.");
		System.out.println("###################################### \n");
		
		int minutos = 0;
		int horas = 0;
		int horas_em_minutos = 0;
		int minutos_totais = 0;
		int segundos = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor das HORAS: ");
		horas = sc.nextInt();
		
		System.out.println("Digite o valor dos MINUTOS: ");
		minutos = sc.nextInt();
		
		horas_em_minutos = 60 * horas; // 1 hora possui 60 minutos.
		minutos_totais = horas_em_minutos + minutos;
		segundos = minutos_totais * 60; // 1 minuto possui 60 segundos.
		
		System.out.println(horas + " horas possuem " + horas_em_minutos + " minutos. \n");
		System.out.println("Ao total, o horário digitado possui " + minutos_totais + " minutos.\n");
		System.out.println( "E " +minutos_totais + " minutos possuem " + segundos + " segundos.");
	}
}
