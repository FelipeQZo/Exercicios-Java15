package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = scanf.nextInt();
        System.out.println("O valor: "+valor+" equivale a "+(valor*3.45)+" dolares");
    }
}
