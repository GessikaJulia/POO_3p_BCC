public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String telefone, String endereço, int qtdProdutoPodeComprar, String cpf) {
        super(nome, telefone, endereço, qtdProdutoPodeComprar);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void qtdDisponivelCompra() {
        setQtdProdutoPodeComprar(3);
    }
}
