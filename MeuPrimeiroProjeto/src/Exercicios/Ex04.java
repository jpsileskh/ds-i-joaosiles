/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {;
        Scanner x = new Scanner(System.in);
        
        double a, b;
        System.out.println("Digite o valor de A: ");
        a = x.nextDouble();

        System.out.println("Digite o valor de B: ");
        b = x.nextDouble();

        double soma = a + b;

        System.out.println("O valor da soma é: " + soma);
    }

}
