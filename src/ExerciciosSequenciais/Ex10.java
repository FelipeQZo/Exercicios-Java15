package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int altura, largura;
        System.out.println("Digite a altura da parede:");
        altura = scanf.nextInt();
        System.out.println("Digite a largura da parede:");
        largura = scanf.nextInt();
        System.out.println("Serão necessários "+(altura*largura/2)+" litros de tinta");

    }
}
