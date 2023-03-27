package ExerciciosRepeticaoArrays;

import java.util.Scanner;

public class Ex78 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int [] valor = new int[5];
        int [] mult = new int[5];

        for(int i=0; i< valor.length;i++){
            valor[i]= scanf.nextInt();
            if (valor[i]%10==0){
                mult[i]=i;
            }
        }

        for(int i=0; i< valor.length;i++){
            if(mult[i]!=0) {
                System.out.println("As posiçoes que foram digitados multiplos de 10 são " + mult[i]);
            }
        }
    }
}
