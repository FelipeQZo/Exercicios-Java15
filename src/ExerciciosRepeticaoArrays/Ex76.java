package ExerciciosRepeticaoArrays;

import java.util.Random;

import java.util.Scanner;

public class Ex76 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int [] vetor = new int[7];

        for (int i=0; i< vetor.length; i++){
            vetor[i] = gerador.nextInt();
        }
        for (int j=0; j< vetor.length; j++){
        System.out.println(vetor[j]);
        }


    }
}
