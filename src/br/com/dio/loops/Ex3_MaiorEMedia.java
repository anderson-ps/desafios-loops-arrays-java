package br.com.dio.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if(numero > maior){
                maior = numero;
            }

            soma = soma + numero;

            count++;

        }while (count < 5);

        System.out.println("O maior numero digitado é: " + maior);
        System.out.println("A media dos numeros digitados é: " + (soma/5));

    }
}
