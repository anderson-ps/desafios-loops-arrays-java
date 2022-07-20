package br.com.dio.arrays;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {1,2,3,4,5,6};
        int count = 0;

        System.out.println("Vetor: ");
        while (count < (vetor.length)){
            System.out.println(vetor[count]);
            count++;
        }


        System.out.println("\nVetor: ");
        for (int i = vetor.length - 1; i >= 0 ; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
