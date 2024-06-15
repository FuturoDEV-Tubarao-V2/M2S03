package model;

public class Pessoa {

    private int id;
    private String nome;
    private String idade;

    public Pessoa(){}

    public Pessoa(int id, String nome, String idade) {
        this.id = id;
        this.nome = nome;
        if(Integer.parseInt(idade) >= 0){
            this.idade = idade;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        if(Integer.parseInt(idade) >= 0){
            this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'';
    }
}
