package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    List<Item> itens ;

    public CarrinhoDeCompra(){
        this.itens = new ArrayList<>();
    }
    public void adicionarItens(Item iten){
        itens.add(iten);
    }

    public void removerItem(Item iten) {
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i : itens){
            if(i.getNome().equals(iten.getNome())){
                itensParaRemover.add(i);
            }
        }

        itens.removeAll(itensParaRemover);
    }

    public int obterNumeroTotaItens() {
        return itens.size();
    }

    public void obterNomeItem(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        System.out.println("O numero total na lista é "+ carrinho.obterNumeroTotaItens() );

        Item item1 = new Item("Torta", 10.0,2);
        carrinho.adicionarItens(item1);

       Item item2 = new Item("Bolacha", 12.0,2);
        carrinho.adicionarItens(item2);

       Item item3 = new Item("Frango", 120.0,3);
        carrinho.adicionarItens(item3);

       Item item4 = new Item("Aguar", 45.0,1);
        carrinho.adicionarItens(item4);


        carrinho.removerItem(item4);

        carrinho.obterNomeItem();

        System.out.println("O numero total na lista é "+ carrinho.obterNumeroTotaItens() );
    }
}
