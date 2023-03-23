package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite um numero");
        float n1 = scanf.nextFloat();
        System.out.println("O dobro do numero é: "+ n1*2+"\n A terça parte do número é: "+ n1/3);
    }
}
