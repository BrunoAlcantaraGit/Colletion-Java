package src.java.list.operacoesBasicas.Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listLivro;

    public CatalogoLivros() {
        this.listLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listaPorAutor = new ArrayList<>();
        if (!listaPorAutor.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                }
                listaPorAutor.add(l);
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> pesquisaPorIntervaloAno = new ArrayList<>();
        if (!pesquisaPorIntervaloAno.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    pesquisaPorIntervaloAno.add(l);

                }
            }
            return pesquisaPorIntervaloAno;
        }else {
            throw new  RuntimeException("Não existe Livro no período informado");
        }


    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listLivro.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("Livro não está na lista");
        }

    }


}
