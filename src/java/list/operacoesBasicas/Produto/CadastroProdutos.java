package src.java.list.operacoesBasicas.Produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod,String descricao, double preco, int quantidade){
    produtoSet.add(new Produto(cod,descricao,preco,quantidade));
    }
    public Set<Produto> exibirPornome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> produtoPorPreco(double preco){
        Set<Produto> produtoPorpreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorpreco.addAll(produtoSet);
        return produtoPorpreco;
    }
}
