package main.java.list.OperacoesBasicas;

public class Item {
    private  String nome;
    private  Double preco;
    private  int qunatidade;

    public Item(){}

    public Item(String nome, Double preco, int qunatidade) {
        this.nome = nome;
        this.preco = preco;
        this.qunatidade = qunatidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qunatidade=" + qunatidade +
                '}';
    }
}
