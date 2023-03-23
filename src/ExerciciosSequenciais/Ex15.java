package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite o numero de dias trabalhados");
        int dias = scanf.nextInt();
        System.out.println("Ele deverá receber:"+dias*200);

    }
}
