package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        System.out.println("===========================================================");
        System.out.println("Calculadora de salário baseado no número de horas trabalhadas");
        System.out.println("===========================================================\n");

        double horasTrabalhadas;
        double salarioMinimo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();
        
        System.out.println("Digite o valor do salário mínimo: ");
        salarioMinimo = sc.nextDouble();
        
        double valorHoraTrabalhada = salarioMinimo / 2;
        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        double imposto = salarioBruto * 0.03;
        double salarioLiquido = salarioBruto - imposto;
        
        System.out.println("O salário líquido a receber é de: R$" + salarioLiquido);
    }
}

