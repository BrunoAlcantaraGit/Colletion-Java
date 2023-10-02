package src.java.list.operacoesBasicas.List.Livro;

public class Livro {
private String Titulo;
private String autor;
private int ano;

    public Livro(String titulo, String autor, int ano) {
        Titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Titulo='" + Titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
