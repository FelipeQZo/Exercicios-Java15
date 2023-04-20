package POO.Associacoes.dominio;

public class Pessoa {
    private String nome;
    private Time time;
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void PessoaImprimir(){
        System.out.println("Nome da pessoa: "+this.nome);
        if (this.time!=null) {
            System.out.println("Time que ela torçe: " + this.time.getNome());
        }

    }

}
