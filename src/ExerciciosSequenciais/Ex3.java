package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String funcionario;
        double salario;
        System.out.println("Nome do funcionário:");
        funcionario = scanf.nextLine();
        System.out.println("Salário: ");
        salario = scanf.nextDouble();
        System.out.println("O funcionário "+ funcionario +" tem um salário de "+ salario +" em Junho");

    }
}
