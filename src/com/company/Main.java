package com.company;

import java.util.Scanner;

public class Main {
    public static int validarEntero(Scanner sc) {
        int numeroValidado;
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
    }

    public static boolean validarNumero(int numero) {
        boolean validado = true;
        if (numero > 9999 || numero < 0) {
            validado = false;
        }
        return validado;
    }

    public static String cambiarCifras(int numero) {
        String numeroResultado = "", numeroString = String.valueOf(numero);
        for (int i = numeroString.length() - 1; i >= 0; i--) {
            numeroResultado = numeroResultado + numeroString.charAt(i);
        }
        return numeroResultado;
    }

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Vamos a mostrar un número con sus cifras al revés!");
        System.out.print("Introduce un número: ");
        numero = validarEntero(sc);
        while (!validarNumero(numero)) {
            System.out.print("¡Introduce un número entre 0 y 9999! ");
            numero = validarEntero(sc);
        }
        System.out.printf("EL resultado del número %d con sus cifras al revés es: %d\n", numero, Integer.valueOf(cambiarCifras(numero)));
    }
}
