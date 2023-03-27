package ExerciciosMatrizes;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int dP=0,dS=0, det=0;
        Scanner scanf = new Scanner(System.in);
        int [][]valor = new int [3][3];
        for( int i=0; i<3; i++){
            for (int j =0; j<3; j++){
                valor [i][j]= scanf.nextInt();
            }
        }

       dP += valor[0][0]*valor [1][1]*valor [2][2];
       dP += valor [0][1]*valor [1][2]*valor [2][0];
       dP += valor [0][2]*valor [1][0]*valor [2][1];

       dS+= valor[0][2]*valor[1][1]*valor[2][0];
       dS+= valor[0][0]*valor[1][2]*valor[2][1];
       dS+= valor[0][1]*valor[1][0]*valor[2][2];
       dS*=-1;

        det= dP+dS;
        System.out.println("A deteminante dessa matriz será: "+det);

    }
}
