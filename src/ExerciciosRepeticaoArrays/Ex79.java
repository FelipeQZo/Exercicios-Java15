package ExerciciosRepeticaoArrays;
import java.util.Arrays;
import java.util.Random;

public class Ex79 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(100);
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("\nVETOR ORDENADO\n");
        for(int i=0; i<vetor.length; i++){
            for(int j=i+1; j< vetor.length; j++){
                if (vetor[i]>vetor[j]){
                    int aux= vetor[j];
                    vetor[j]= vetor[i];
                    vetor[i]=aux;
                }
            }
        }



        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}
