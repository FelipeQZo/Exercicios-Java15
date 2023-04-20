package POO.ExerciciosClassesAbstratas.dominio;

public abstract class  Funcionario {

    protected String nome;
    protected int idade;
    protected double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public abstract void imprime();
    public abstract void aumento();

}
