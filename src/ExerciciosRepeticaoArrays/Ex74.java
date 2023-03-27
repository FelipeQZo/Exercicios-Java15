package ExerciciosRepeticaoArrays;

public class Ex74 {
    public static void main(String[] args) {
        int n1 = 5, n2=3;
        int [] vetor= new int[10];
        for(int i=0; i<vetor.length; i++){
            if(i%2==0){
                vetor[i]= n1;
            }
            else{
                vetor[i]= n2;
            }

            System.out.println(vetor[i]);
        }
    }
}