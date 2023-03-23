package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite o preço:");
        int preco = scanf.nextInt();
        int desconto = preco*5/100;
        System.out.println("O preço com desconto é igual: " + (preco - desconto));
    }
}
