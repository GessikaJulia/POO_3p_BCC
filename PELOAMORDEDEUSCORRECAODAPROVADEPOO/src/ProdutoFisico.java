public class ProdutoFisico extends Produto{
    private double peso;

    public ProdutoFisico(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularFrete() {
        double valorTotal = 0.0;
        if (peso <= 2.0) {
            valorTotal = 5.0;
        } else if (peso > 2.0 && peso <= 5.0) {
            valorTotal = 10.0;
        } else if (peso > 5.0) {
            valorTotal = ((peso - 5.0) + 10.0) * 2.5;
        }
        return valorTotal;
    }

    @Override
    public double calcularTotal() {
        return getPreco()*getQuantidade()+calcularFrete();
    }
}
