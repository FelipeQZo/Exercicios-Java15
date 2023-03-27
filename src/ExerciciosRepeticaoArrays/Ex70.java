package ExerciciosRepeticaoArrays;

public class Ex70 {
    public static void main(String[] args) {
        int fib1, fib2, soma;
        fib1 = 1;
        fib2 = 1;
        System.out.println(fib1 + "\n" + fib2);
        for (int i = 0; i < 10; i++) {
            soma = fib1 + fib2;
            fib1 = fib2;
            fib2 = soma;
            System.out.println(soma);
        }
    }
}
