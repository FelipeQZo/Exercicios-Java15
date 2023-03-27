package ExerciciosRepeticaoArrays;

public class Ex72 {
    public static void main(String[] args) {
        int n1 = 5;
        int [] vetor= new int[10];
        for(int i=0; i<vetor.length; i++){
            vetor[i]= n1;
            n1+=5;
            System.out.println(vetor[i]);
        }
    }
}