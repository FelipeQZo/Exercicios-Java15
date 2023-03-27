package ExerciciosRepeticaoArrays;

import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n1, j, soma=0;
        System.out.println("Digite o valor do primeiro termo e a razão da PA");
        n1 = scanf.nextInt();
        j = scanf.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println("o elemento de posição "+i+" da PA vale "+n1);
            soma +=n1;
            n1+=j;
//            System.out.println("Soma "+soma);
        }
        System.out.println("A soma total dos elementos da PA é igual a: "+soma);
    }

}
