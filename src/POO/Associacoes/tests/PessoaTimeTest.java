package POO.Associacoes.tests;

import POO.Associacoes.dominio.Pessoa;
import POO.Associacoes.dominio.Time;

import java.util.Scanner;

public class PessoaTimeTest {
    public static void main(String[] args) {
        String nome,time;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        nome = scanf.nextLine();
        Pessoa jozimar = new Pessoa(nome);
        System.out.println("Digite o time da pessoa: ");
         time = scanf.nextLine();
        Time clube = new Time(time);
        jozimar.setTime(clube);
        jozimar.PessoaImprimir();
    }
}
