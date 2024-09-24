import java.util.ArrayList;
import java.util.List;

public class Lanche extends ItemCardapio {
    private ArrayList<Ingredientes> ingredientes;

    public Lanche(String nomeItem, double precoItem, ArrayList<Ingredientes> ingredientes) {
        super(nomeItem, precoItem);
        this.ingredientes = ingredientes;
    }

    @Override
    public double calcularPreco() {
        for ( Ingredientes i: this.ingredientes) {
            super.setPrecoItem(super.getPrecoItem() + i.getPreco());
        }
        return super.getPrecoItem();}

    @Override
    public String descrever() {
        return "Lanche: " + getNomeItem() + " - " + ingredientes;
    }

    public void addIngrediente(Ingredientes ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void removeIngrediente(Ingredientes ingrediente) {
        ingredientes.remove(ingrediente);
    }
}