package POO.IntroducaoMetodos.tests.Calculadoratest;

import POO.IntroducaoMetodos.dominio.Calculadora.Calculadora1;


import java.util.Scanner;

public class Calculadora1test {
    public static void main(String[] args) {
        System.out.println("EXEMPLO DO METODO APLICADO CALCULADORA 2 (SEM RETORNO)\n\n");
        Scanner scanf = new Scanner(System.in);
        int n1,n2,aux;
        System.out.println("Digite o primeiro numero:");
        n1 = scanf.nextInt();
        System.out.println("Digite o segundo numero:");
        n2 = scanf.nextInt();
        System.out.println("Digite a operação desejada:");
        System.out.println("\n1 - soma\n2 - subtração\n3 - multiplicação \n4 - divisão");
        aux = scanf.nextInt();

        switch (aux){
            case 1:
                Calculadora1.soma(n1,n2);
//                System.out.println("\nO resultado é: "+soma);
                break;
            case 2:
                Calculadora1.subt(n1,n2);
//                System.out.println("\nO resultado é: "+subt);
                break;
            case 3:
                Calculadora1.mult(n1,n2);
//                System.out.println("\nO resultado é: "+mult);
                break;
            case 4:
                Calculadora1.divi(n1,n2);
//                System.out.println("\nO resultado é: "+divi);
                break;
            default:
                System.out.println("Caso inválido");
                break;
        }

    }

}
