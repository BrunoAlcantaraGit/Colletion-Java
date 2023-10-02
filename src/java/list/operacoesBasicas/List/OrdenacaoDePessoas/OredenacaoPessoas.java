package src.java.list.operacoesBasicas.List.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OredenacaoPessoas {

    private List<Pessoas> pessoasList = new ArrayList<>();

    public OredenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenarPorIdade(int idade) {
        List<Pessoas> listaOrdenadaPorIdade = new ArrayList<Pessoas>(pessoasList);
        if (!pessoasList.isEmpty()) {

            Collections.sort(listaOrdenadaPorIdade);
            return listaOrdenadaPorIdade;

        } else {
            throw new RuntimeException("Não existe nenhum item na lista");
        }
    }
}

