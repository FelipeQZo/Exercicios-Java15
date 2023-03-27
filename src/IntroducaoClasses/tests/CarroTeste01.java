package IntroducaoClasses.tests;

import IntroducaoClasses.dominio.Carro;

import java.util.Scanner;

public class CarroTeste01 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Mustang";
        carro1.modelo ="GT 500";
        carro1.ano = 1969;

        System.out.println("nome do carro1: "+carro1.nome+"\nmodelo do carro1: "+carro1.modelo+"\nano do carro1: "+carro1.ano);

        System.out.println("=================================");

        System.out.println("Digite o nome do carro2:");
        carro2.nome =  scanf.nextLine();
        System.out.println("Digite o modelo do carro2:");
        carro2.modelo =  scanf.nextLine();
        System.out.println("Digite o ano do carro2:");
        carro2.ano=  scanf.nextInt();

        System.out.println("nome do carro2: "+carro2.nome+"\nmodelo do carro2: "+carro2.modelo+"\nano do carro2: "+carro2.ano);
    }

}
