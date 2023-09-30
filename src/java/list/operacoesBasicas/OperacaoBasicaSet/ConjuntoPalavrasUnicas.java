package src.java.list.operacoesBasicas.OperacaoBasicaSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    Set<Palavras> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(new Palavras(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavras removerPalavra = null;
        if (!palavrasSet.isEmpty()) {
            for (Palavras pl : palavrasSet) {
                if (pl.getPalavra() == palavra) {
                    removerPalavra = pl;
                    break;
                }
            }
            palavrasSet.remove(removerPalavra);
        } else {
            throw new RuntimeException("Palavra inexistente");
        }

    }

    public void verificarPalavra(String palavra) {
        palavrasSet.size();
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasSet.isEmpty()) {
            System.out.println(palavrasSet);
        } else {
            throw new RuntimeException("HashSete Vazio");
        }
    }
}

