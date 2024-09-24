import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private ArrayList<Cardapio> itens;

    public Pedidos(ArrayList<Cardapio> itens) {
        this.itens = itens;
    }
    public void add(Cardapio item) {
        itens.add(item);
    }
    public void remove(Cardapio item) {
        itens.remove(item);
    }

    public double calcularPreco() {
        double preco = 0;
        for (Cardapio i: this.itens) {
            preco += i.calcularPreco();
        }
        return preco;
    }
}
