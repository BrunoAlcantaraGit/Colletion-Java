package src.java.list.operacoesBasicas;

public class Compra {
private String iten;

    public Compra(String iten) {
        this.iten = iten;
    }

    public String getIten() {
        return iten;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "iten='" + iten + '\'' +
                '}';
    }
}
