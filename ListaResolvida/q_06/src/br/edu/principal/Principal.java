package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("***********************************************************");
        System.out.println("O valor do seu salário após as mudanças sofridas pelo mesmo");
        System.out.println("***********************************************************\n");

        double sal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        sal = sc.nextDouble();

        double grat = sal * 0.05;
        double imp = sal * 0.07;
        double salreceber = sal + grat - imp;

        System.out.println("O valor final do salário será de: " + salreceber);
    }
}

