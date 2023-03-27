package ExerciciosRepeticaoArrays;

import java.util.Scanner;

public class Ex77 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String[] nome = new String[7];
        for (int i=0; i< nome.length; i++){
            nome[i]= scanf.nextLine();

        }
        for (int j=nome.length-1; j>=0 ; j--){
            System.out.println(nome[j]);

        }
    }





}
