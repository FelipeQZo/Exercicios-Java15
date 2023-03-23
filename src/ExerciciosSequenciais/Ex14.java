package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias alugado: ");
        int dias = scanf.nextInt();
        System.out.println("Digite a quantidade de Km rodados: ");
        int km = scanf.nextInt();
        System.out.println("O valor total será: "+((dias*90)+(km*0.20)));
    }
}
