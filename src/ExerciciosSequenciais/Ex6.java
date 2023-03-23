package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = scanf.nextInt();
        System.out.println("O antecessor desse número é: "+ (n1-1));
        System.out.println("O sucessor desse número é: "+ (n1+1));

    }
}
