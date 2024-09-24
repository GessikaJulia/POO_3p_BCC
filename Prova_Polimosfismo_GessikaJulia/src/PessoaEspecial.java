public class PessoaEspecial extends Pessoa{
    private String docIdentificacao;

    public PessoaEspecial(String nome, String telefone, String endereço, int qtdProdutoPodeComprar, String docIdentificacao) {
        super(nome, telefone, endereço, qtdProdutoPodeComprar);
        this.docIdentificacao = docIdentificacao;
    }

    public String getDocIdentificacao() {
        return docIdentificacao;
    }

    public void setDocIdentificacao(String docIdentificacao) {
        this.docIdentificacao = docIdentificacao;
    }

    @Override
    public void qtdDisponivelCompra() {
        setQtdProdutoPodeComprar(Integer.MAX_VALUE);
    }
}
