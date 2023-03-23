package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int diasDoAno, diasFumados;
        System.out.println("Digite a quantidade de cigarros fumados por dia:");
        int quantCigarros = scanf.nextInt();
        System.out.println("Digite quantos anos já fumou:");
        int anosFumados = scanf.nextInt();
        diasFumados = anosFumados*365;
        int totalCigarros = diasFumados*quantCigarros;
        int minutosPerdidos = totalCigarros*10;
        int diasPerdidos = minutosPerdidos/1440;
        System.out.println("Dias de vida perdidos: "+ diasPerdidos);
    }
}
