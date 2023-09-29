package src.java.list.operacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descicao) {
        List<Tarefa> taferaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descicao)) {
                taferaRemover.add(t);
            }
        }
        tarefaList.removeAll(taferaRemover);

    }

    public int totaldeTarefas() {
        return tarefaList.size();

    }

    public void obterDescricaoTarefa() {
        System.out.println(tarefaList);
    }
}
