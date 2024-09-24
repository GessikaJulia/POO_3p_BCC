public class PessoaFisica extends Cliente {
    private String cpfPessoaFisica;

    public PessoaFisica(String nome, String telefone, String endereco, String cpfPessoaFisica) {
        super(nome, telefone, endereco);
        this.cpfPessoaFisica = cpfPessoaFisica;
    }

    public String getCpfPessoaFisica() {
        return cpfPessoaFisica;
    }

    public void setCpfPessoaFisica(String cpfPessoaFisica) {
        this.cpfPessoaFisica = cpfPessoaFisica;
    }

    @Override
    public boolean podeFazerEmprestimo() {
        return getQtdEmprestado() < 1;
    }
}
