package br.com.dio.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;
        int count = 0;

        do {
            System.out.println("letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantConsoantes++;
            }
            count++;
        }while (count < consoantes.length);

        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.println(consoante);
        }

        System.out.println("Quantidade de consoantes: " + quantConsoantes);
    }
}
