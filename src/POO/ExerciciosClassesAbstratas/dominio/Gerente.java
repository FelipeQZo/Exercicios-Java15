package POO.ExerciciosClassesAbstratas.dominio;

public class Gerente extends Funcionario{


    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }

    @Override
    public void aumento() {
        this.salario = this.salario+ this.salario * 0.5;
        System.out.println("O salario resultande será de:"+this.salario);
    }
}
