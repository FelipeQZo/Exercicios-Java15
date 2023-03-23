package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite o salario:");
        int salario = scanf.nextInt();
        int aumento = salario*15/100;
        System.out.println("O preço com desconto é igual: " + (salario + aumento));
    }
}
