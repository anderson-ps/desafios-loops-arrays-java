package br.com.dio.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("número: ");
            numero = scan.nextInt();

            if ((numero % 2 == 0)) {
                quantPares++;
            } else {
                quantImpares++;
            }

            count++;
        }while (count < quantNumeros);

        System.out.println("Quantidade de numeros pares =  " + quantPares);
        System.out.println("Quantidade de numeros impares =  " + quantImpares);
    }
}
