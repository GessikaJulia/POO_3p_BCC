public class ProdutoDigital extends Produto {
    private int tamanhoArquivo;
    private double valorTotal;

    public ProdutoDigital(String nome, double preco, int quantidade, double valorTotal, int tamanhoArquivo, double valorTotal1) {
        super(nome, preco, quantidade, valorTotal);
        this.tamanhoArquivo = tamanhoArquivo;
        this.valorTotal = valorTotal1;
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public void calcularTotal(){
      valorTotal = getPreco() * getQuantidade();

    }
}
