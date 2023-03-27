package ExerciciosMatrizes;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int soma=0, n;
        int[][] matriz = new int[3][3];
        int[] resposta = new int[3];

        for( int i=0; i<3; i++){
            for (int j =0; j<3; j++){
                System.out.println("Digite o valor do elemento "+i+","+j+" da matriz");
                matriz [i][j]= scanf.nextInt();
            }


        }
        System.out.println("\n\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(+ matriz[j][i]);
                n = matriz[i][j];
                soma += n;
                resposta[i] = soma;
            }

        }
        System.out.println("A soma da colunas será de:");
        for (int i=0; i<3; i++){
            System.out.println(i+"º"+resposta[i]);
        }
    }

}
