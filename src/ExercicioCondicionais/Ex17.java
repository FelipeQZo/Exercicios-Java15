package ExercicioCondicionais;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int multa, vel;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite a velocidade do carro: ");
        vel = scanf.nextInt();
        if(vel>80){
            multa = (vel-80)*5;
            System.out.println("O condutor foi multado no valor de: "+multa);
        }
        else {
            System.out.println("O condutor está dentro do limite de velocidade");
        }
    }
}
