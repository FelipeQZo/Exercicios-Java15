package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int a, b, c, delta;
        System.out.println("Digite o valor de A:");
        a = scanf.nextInt();
        System.out.println("Digite o valor de B:");
        b = scanf.nextInt();
        System.out.println("Digite o valor de C:");
        c = scanf.nextInt();
        delta = (b*b)-4*a*c;
        System.out.println(" o valor de delta é :"+delta);


    }
}
