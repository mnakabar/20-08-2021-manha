package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite o valor do prémio da lotéria");
        Scanner teclado = new Scanner(System.in);
        double premio = teclado.nextDouble();
        double imposto1 = premio * 2.45 / 100;
        double imposto2 = premio * 15 / 100;
        double imposto3 = premio * 3 / 100;
        double valorComDesconto = premio - imposto1 - imposto2 - imposto3;
        System.out.println("O valor total com desconto é " + valorComDesconto);
    }
}
