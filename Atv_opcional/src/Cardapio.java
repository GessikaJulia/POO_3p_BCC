import java.util.ArrayList;

public class Cardapio {
    ArrayList<ItemCardapio> itens;

    public Cardapio(ArrayList<ItemCardapio> itens) {
        this.itens = itens;
    }

    public void add(ItemCardapio item) {
        itens.add(item);
    }
    public void remove(ItemCardapio item) {
        itens.remove(item);
    }

    public double calcularPreco() {
        double preco = 0;
        for (ItemCardapio i: this.itens) {
            preco += i.calcularPreco();
        }
        return preco;
    }
}
