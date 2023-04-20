package POO.ExerciciosClassesAbstratas.tests;

import POO.ExerciciosClassesAbstratas.dominio.Gerente;
import POO.ExerciciosClassesAbstratas.dominio.Secretario;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n, idade, salario;
        String nome;
        System.out.println("1- Gerente\n2- Secretario");
        n = scanf.nextInt();
        scanf.nextLine(); // consumir o caractere de nova linha deixado pelo nextInt()

        System.out.println("Digite o nome do Funcionario");
        nome = scanf.nextLine();
        System.out.println("Digite a idade do Funcionario");
        idade = scanf.nextInt();
        System.out.println("Digite o salario do Funcionario");
        salario = scanf.nextInt();
        if(n!=1){
            Secretario teste = new Secretario(nome, idade, salario);
            teste.imprime();
            System.out.println("Aplicando Aumento");
            teste.aumento();

        }
        else {
            Gerente teste = new Gerente(nome, idade, salario);
            teste.imprime();
            System.out.println("Aplicando Aumento");
            teste.aumento();
        }
    }
}
