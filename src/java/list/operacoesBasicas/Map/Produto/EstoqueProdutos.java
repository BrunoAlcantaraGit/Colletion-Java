package src.java.list.operacoesBasicas.Map.Produto;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() throws Exception {
        if (!estoqueMap.isEmpty()) {
            System.out.println(estoqueMap);
        } else {
            throw new Exception("Estoque Vazio! ");
        }
    }

    public Double calcularValorTotalEstoque() throws Exception {
        Double valorTotalEstoque = 0d;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
            return valorTotalEstoque;
        } else {
            throw new RuntimeException("Estoque vazio");
        }


    }

    public Produto obterProdutoMaisCaro() throws Exception {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }

            }
            return produtoMaisCaro;
        } else {
            throw new Exception("Estoque vazio");
        }

    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisbarado = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisbarado = p;
                }
            }
            return produtoMaisbarado;
        } else {
            throw new RuntimeException("Estoque vazio");
        }
    }
}
