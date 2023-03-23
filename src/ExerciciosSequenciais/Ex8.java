package ExerciciosSequenciais;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite uma distância em metros: ");
        float dist = scanf.nextFloat();
        System.out.println("Essa distância corresponde a: ");
        System.out.println(dist/1000+"Km");
        System.out.println(dist/100+"Hm");
        System.out.println(dist/10+"Dam");
        System.out.println(dist*10+"dm");
        System.out.println(dist*100+"cm");
        System.out.println(dist*1000+"mm");
    }
}
