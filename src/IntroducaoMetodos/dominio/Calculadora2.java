package IntroducaoMetodos.dominio;

public class Calculadora2 {
    public int soma(int n1, int n2){
        int soma = n1+n2;
//        System.out.println("\nO resultado é: "+soma);
        return soma;
    }
    public int subt(int n1, int n2){
        int subt = n1-n2;
//        System.out.println("\nO resultado é: "+subt);
        return subt;
    }
    public float divi(float n1, float n2){
        float divi = n1/n2;
//        System.out.println("\nO resultado é: "+divi);
        return divi;
    }
    public int mult(int n1, int n2){
        int mult = n1*n2;
//        System.out.println("\nO resultado é: "+mult);
        return mult;
    }
}
