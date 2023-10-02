package src.java.list.operacoesBasicas.Map.Angenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
private Map<String,Integer > agendaMap;


    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaMap.put(nome,telefone);
    }

    public void removerContato(String nome) throws Exception{
        if(!agendaMap.isEmpty()){
            agendaMap.remove(nome);
        }else {throw new Exception("Não existe contato com a chave informada");}

    }

    public  void exibirContatos(){
        System.out.println(agendaMap);
    }

    public Integer pesquisarPorNome(String nome)throws Exception{
        Integer contato = null;
        if (!agendaMap.isEmpty()){
          contato = agendaMap.get(nome);
          return contato;

        }else{throw new Exception("Contato inexistente");}

    }


}
