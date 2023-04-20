package POO.ModificadorFinal;

public class Carro03 {

    // Modificador FINAL utilizado em metodos..
    // Esse metodo não poderá ser sobrecarregado em nenhuma classe filha

    private String nome;
    private int ano;
    private String modelo;

    final void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.ano);
        System.out.println(this.modelo);
    }

}
