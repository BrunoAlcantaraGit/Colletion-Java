package src.java.list.operacoesBasicas.Map.Produto;

public class Produto {
private Long cod;
private String nome;
private int quantidade;
private double preco;

    public Produto( String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
