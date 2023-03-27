package ExerciciosRepeticaoArrays;

public class Ex75 {
    public static void main(String[] args) {
        int fib1, fib2, soma;
        int [] vetor = new int[16];
        fib1 = 0;
        fib2 = 1;
        vetor[0]=1;
        System.out.println("O valor do vetor na posição "+0+" é de "+vetor[0]);
        for (int i = 1; i < vetor.length; i++) {
            soma = fib1 + fib2;
            fib1 = fib2;
            fib2 = soma;
            vetor[i]= soma;
//            vetor[0]=1;
//            vetor[1]=1;
            System.out.println("O valor do vetor na posição "+i+" é de "+vetor[i]);
        }
    }
}
