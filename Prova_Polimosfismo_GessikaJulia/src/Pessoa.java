public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String endereço;
    private int qtdProdutoPodeComprar;

    public Pessoa(String nome, String telefone, String endereço, int qtdProdutoPodeComprar) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
        this.qtdProdutoPodeComprar = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getQtdProdutoPodeComprar() {
        return qtdProdutoPodeComprar;
    }

    public void setQtdProdutoPodeComprar(int qtdProdutoPodeComprar) {
        this.qtdProdutoPodeComprar = qtdProdutoPodeComprar;
    }
    public abstract void qtdDisponivelCompra();

}
