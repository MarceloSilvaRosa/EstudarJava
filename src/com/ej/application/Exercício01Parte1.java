package com.ej.application;

import java.util.Locale;
import java.util.Scanner;

public class Exercício01Parte1 {

    public static void main(String[] args) {

        //Soma();

        //Raio();

        Diferenca();


    }

    public static void Diferenca(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.print("Digite um número:");
        A = sc.nextInt();
        System.out.print("Digite um número:");
        B = sc.nextInt();
        System.out.print("Digite um número:");
        C = sc.nextInt();
        System.out.print("Digite um número:");
        D = sc.nextInt();

        diferenca = A*B-C*D;

        System.out.print("Resultado: "+diferenca);


    }

    public static void Raio() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, raio, pi = 3.14159;

        System.out.print("digite o raio: ");
        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("area do area =%.4f%n", area);

        sc.close();

    }


    public static void Soma() {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        System.out.print("Digite um numero N1 = ");
        int n1 = sc.nextInt();
        System.out.print("Digite um numero N2 = ");
        int n2 = sc.nextInt();

        System.out.println("Numero N1 =" + n1);
        System.out.println("Numero N2 =" + n2);

        resultado = n1 + n2;

        System.out.println("Resultado = " + resultado);

        sc.close();
    }
}
