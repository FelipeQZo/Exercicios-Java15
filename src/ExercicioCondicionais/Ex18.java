package ExercicioCondicionais;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class Ex18 {
    public static void main(String[] args) {
        int idade;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento do cidadão");
        int anoNasc = scanf.nextInt();
        LocalDate data = LocalDate.now();
        int anoAtu = data.getYear();
        idade = (anoNasc- anoAtu)*-1;
        System.out.println("O cidadão tem "+idade+" anos");
        if(idade>=16){
            System.out.println("Já pode votar");

        }
        else {
            System.out.println("não pode votar ainda");
        }
    }
}
