package POO.Heranca.dominio;

public class Funcionario extends Pessoa{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, int idade, int salario,Endereco residencia) {
        super(nome, cpf, idade,residencia);
        this.salario = salario;
    }
    public void imprime(){
        super.imprime();

        System.out.println("O salario do funcionario é: "+ this.getSalario());
    }
}
