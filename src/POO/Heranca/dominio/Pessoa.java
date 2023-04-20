package POO.Heranca.dominio;

import POO.Associacoes.dominio.Time;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private Endereco residencia;

    public void imprime(){
        System.out.println("O nome do funcionario é: "+ this.getNome());
        System.out.println("a idade do funcionario é: "+ this.getIdade());
        System.out.println("O CPF do funcionario é: "+ this.getCpf());
        System.out.println("A rua do funcionario é: "+ this.residencia.getRua());
        System.out.println("O numero do funcionario é: "+ this.residencia.getNumero());
        System.out.println("O CEP do funcionario é: "+ this.residencia.getCep());

    }

    public Pessoa(String nome, String cpf, int idade, Endereco residencia) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.residencia= residencia;
    }
    public void setEndereco(Endereco residencia) {
        this.residencia = residencia;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getResidencia() {
        return residencia;
    }

    public void setResidencia(Endereco residencia) {
        this.residencia = residencia;
    }

//    public Pessoa(String nome, String cpf, int idade, Endereco residencia) {
//        this.nome = nome;
//        this.cpf = cpf;
//        this.idade = idade;
//        this.residencia = residencia;
//    }
}
