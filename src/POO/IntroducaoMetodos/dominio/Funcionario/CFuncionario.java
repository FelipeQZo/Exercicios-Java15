package POO.IntroducaoMetodos.dominio.Funcionario;

import static POO.IntroducaoMetodos.tests.Funcionariotest.Funcionariotest.read;

public class CFuncionario {
    private static String nome;
    private static double [] salario;
    private static int idade;

    public static void print(){

        System.out.println("O nome do funcionário: "+CFuncionario.nome);
        System.out.println("A idade do funcionario: "+CFuncionario.idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.println("O salario do funcionário: "+CFuncionario.salario[i]);
        }
    }
//    Abaixo método para imprimir a média do salário
    public void media(){

       double media=0,soma=0;

        for (int i = 0; i <salario.length ; i++) {
            soma+=salario[i];
        }
        media =soma/ salario.length;
        System.out.println("A media do salario é:"+media);

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }
    public void setSalario(double [] salario){
        this.salario = salario;
    }

}
