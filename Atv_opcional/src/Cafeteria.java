import java.util.ArrayList;

public class Cafeteria {
    private String nome;
    private String cnpj;
    private ArrayList<ItemCardapio> itemCardapioCafeteria;
    private ArrayList <Pedidos> pedidos;

    public Cafeteria(String nome, String cnpj, ArrayList<ItemCardapio> itemCardapio, ArrayList<Pedidos> pedidos) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.itemCardapioCafeteria = itemCardapio;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<ItemCardapio> getItemCardapio() {
        return itemCardapioCafeteria;
    }

    public void setItemCardapio(ArrayList<ItemCardapio> itemCardapio) {
        this.itemCardapioCafeteria = itemCardapio;
    }

    public void addPedido(Pedidos pedido) {
        pedidos.add(pedido);
    }

    public void removePedido(Pedidos pedido) {
        pedidos.remove(pedido);
    }


}
