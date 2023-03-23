package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Nota 1:");
        float n1 = scanf.nextFloat();
        System.out.println("Nota 2:");
        float n2 = scanf.nextFloat();
        System.out.println("A média de "+ n1 +" e "+ n2 +" é igual a  "+(n1+n2)/2 );
    }
}
