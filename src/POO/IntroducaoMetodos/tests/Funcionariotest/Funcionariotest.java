package POO.IntroducaoMetodos.tests.Funcionariotest;

import POO.IntroducaoMetodos.dominio.Funcionario.CFuncionario;

import java.util.Scanner;

public class Funcionariotest {
    public static void main(String[] args) {
        CFuncionario func1= read();
        CFuncionario.print();
        func1.media();

    }
    public static CFuncionario read(){
        CFuncionario func1 = new CFuncionario();
        func1.setSalario(new double[3]);
        Scanner scanf = new Scanner(System.in);
        func1.setNome(scanf.nextLine());
        func1.setIdade(scanf.nextInt());
        for (int i = 0; i < func1.getSalario().length; i++) {
            func1.getSalario()[i] = scanf.nextDouble();

        }
        return func1;
    }

}
