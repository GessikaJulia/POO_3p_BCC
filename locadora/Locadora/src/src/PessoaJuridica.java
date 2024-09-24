public class PessoaJuridica extends Cliente {
    private String cnpjPessoaJuridica;
    private String nomeRepresentante;

    public PessoaJuridica(String nome, String telefone, String endereco, String cnpjPessoaJuridica, String nomeRepresentante) {
        super(nome, telefone, endereco);
        this.cnpjPessoaJuridica = cnpjPessoaJuridica;
        this.nomeRepresentante = nomeRepresentante;
    }

    public String getCnpjPessoaJuridica() {
        return cnpjPessoaJuridica;
    }

    public void setCnpjPessoaJuridica(String cnpjPessoaJuridica) {
        this.cnpjPessoaJuridica = cnpjPessoaJuridica;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    @Override
    public boolean podeFazerEmprestimo() {
        return true;
    }
}
