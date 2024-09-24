import java.util.ArrayList;

public class CarrinhosDeCompras {
    private Pessoa pessoa;
    private ArrayList<Produto> produtos;

    public CarrinhosDeCompras(Pessoa pessoa, ArrayList<Produto> produtos) {
        this.pessoa = pessoa;
        this.produtos = new  ArrayList<Produto>();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public void addProduto(Produto produto){
        if (pessoa.getQtdProdutoPodeComprar() > produtos.size()) {
            throw new RuntimeException("Quantidade de produtos excedida");
        } else{
            produtos.add(produto);
        }
    }
    public void removeProduto(Produto produto){
        produtos.remove(produto);
    }
    public void calcularTotalCompra(){
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValorTotal();
        }
    }
}
