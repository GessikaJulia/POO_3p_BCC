import java.util.ArrayList;

public class CarrinhoDeCompras {
    private Cliente cliente;
    private ArrayList<Produto>produtos;

    public CarrinhoDeCompras(Cliente cliente, ArrayList<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = new ArrayList<Produto>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void addProduto(Produto produto){
        if (produto.getQuantidade()>cliente.qtdDisponivelComprar()){
            throw new  IllegalArgumentException("Quantidade excedida");
        }
        produtos.add(produto);
    }
}
