package POO.Heranca.tests;

import POO.Heranca.dominio.Endereco;
import POO.Heranca.dominio.Funcionario;

import java.util.Scanner;

public class PessoaFuncionario {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String nome, cpf, cep, rua;
        int salario, idade = 0,numero = 0;
        System.out.println("Digite o cep do funcionario");
        cep = scanf.nextLine();
        System.out.println("Digite o rua do funcionario");
        rua = scanf.nextLine();
        System.out.println("Digite o numero da casa do funcionario");
        numero = scanf.nextInt();
        Endereco local = new Endereco(cep,rua,numero);
        System.out.println("Digite o nome do funcionario");
        nome = scanf.nextLine();
        System.out.println("Digite o cpf do funcionario");
        cpf = scanf.nextLine();
        System.out.println("Digite o salario do funcionario");
        salario = scanf.nextInt();
        System.out.println("Digite o idade do funcionario");
        idade = scanf.nextInt();
        Funcionario jozimar = new Funcionario(nome,cpf,idade,salario,local);
        jozimar.setEndereco(local);
        jozimar.imprime();

    }
}
