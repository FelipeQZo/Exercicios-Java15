package ExerciciosMatrizes;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int soma = 0;
        Scanner scanf = new Scanner(System.in);
        int [][] valor = new int[4][5];
        for (int i =0; i<4 ;i++) {
            for (int j = 0; j < 5; j++) {
                valor[i][j] = scanf.nextInt();
//                valor[i][j]= 2;
            }
        }
            for (int i =0; i<4 ;i++) {
                for (int j = 0; j < 5; j++) {
                    int n = valor[i][j];
                    soma= soma + n;
//                    System.out.println(valor[i][j]);
//                    if(j==4) System.out.println("\n");
                }
            }
        System.out.println("A soma dos valores da matriz é de: "+soma);

        }

    }

