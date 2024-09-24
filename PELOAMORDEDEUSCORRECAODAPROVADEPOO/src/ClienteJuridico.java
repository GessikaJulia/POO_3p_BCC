public class ClienteJuridico extends Cliente{
    private String CNPJ;
    private String represente;

    public ClienteJuridico(String nome, String telefone, String endereco, String CNPJ, String represente) {
        super(nome, telefone, endereco);
        this.CNPJ = CNPJ;
        this.represente = represente;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRepresente() {
        return represente;
    }

    public void setRepresente(String represente) {
        this.represente = represente;
    }

    @Override
    public int qtdDisponivelComprar() {
        return 10;
    }
}
