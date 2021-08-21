package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Foram quantos dias de campanha?");
        Scanner teclado = new Scanner(System.in);
        int numeroDias = teclado.nextInt();
        double custo = 2 * numeroDias;
        System.out.println (numeroDias + " dias custaram $" + custo);
    }
}
