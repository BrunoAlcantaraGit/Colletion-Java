package src.java.list.operacoesBasicas.set.AgendaContato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adcionarContato(String nome, int numeroContato) {
        contatoSet.add(new Contato(nome, numeroContato));
    }

    public void exebirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNomer(String nome) {
        Set<Contato> pesquisaNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome)) {
                    pesquisaNome.add(c);
                }
            }
            return pesquisaNome;
        } else {
            throw new RuntimeException("Não existe nenhum contato com o nome " + nome);
        }

    }

    public Contato atualizarContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }

        }
        return contatoAtualizado;
    }
}
