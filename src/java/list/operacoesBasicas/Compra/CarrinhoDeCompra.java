package src.java.list.operacoesBasicas.Compra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Compra> carrinho;

    public CarrinhoDeCompra() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarIten(String iten){
        carrinho.add(new Compra(iten));
    }

    public  void removerItenDeCompra(String iten){
        List<Compra> removerCompra = new ArrayList<>();
        for (Compra c:carrinho){
            if(c.getIten().equalsIgnoreCase(iten)){
                removerCompra.add(c);
            }
        }
        carrinho.removeAll(removerCompra);
    }
    public int totaldeIten(){
        return carrinho.size();
    }



    public void obterDescricaoTarefa(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adicionarIten("Feijão");
        carrinho.adicionarIten("Batata");
        carrinho.adicionarIten("macarrão");
        carrinho.removerItenDeCompra("feijão");

        carrinho.obterDescricaoTarefa();


    }
}
