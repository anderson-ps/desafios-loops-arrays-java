package br.com.dio.loops;

import java.util.Scanner;

public class Ex6_Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multi = 1;

        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1 ; i--) {
            multi = multi * i;
        }

        System.out.println(fatorial + "! = " + multi);
    }
}
