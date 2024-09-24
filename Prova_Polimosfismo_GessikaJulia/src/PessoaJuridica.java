public class PessoaJuridica extends Pessoa{
    private String CNPJ;
    private String representante;

    public PessoaJuridica(String nome, String telefone, String endereço, int qtdProdutoPodeComprar, String CNPJ, String representante) {
        super(nome, telefone, endereço, qtdProdutoPodeComprar);
        this.CNPJ = CNPJ;
        this.representante = representante;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }


    @Override
    public void qtdDisponivelCompra() {
        setQtdProdutoPodeComprar(10);
    }
}
