package IntroducaoMetodos.dominio;

public class Calculadora1 {
    public void soma(int n1, int n2){
        int soma = n1+n2;
        System.out.println("\nO resultado é: "+soma);

    }
    public void subt(int n1, int n2){
        int subt = n1-n2;
        System.out.println("\nO resultado é: "+subt);

    }
    public void divi(float n1, float n2){
        float divi = n1/n2;
        System.out.println("\nO resultado é: "+divi);

    }
    public void mult(int n1, int n2){
        int mult = n1*n2;
        System.out.println("\nO resultado é: "+mult);

    }
}
