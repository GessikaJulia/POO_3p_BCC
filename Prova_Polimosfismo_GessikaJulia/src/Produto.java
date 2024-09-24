public abstract class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double valorTotal;

    public Produto(String nome, double preco, int quantidade, double valorTotal) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public abstract void calcularTotal();

}
