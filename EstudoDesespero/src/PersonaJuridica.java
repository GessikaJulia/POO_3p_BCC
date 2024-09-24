public class PersonaJuridica extends Pessoa{
    private String cnpj;
    private String representante;

    public PersonaJuridica(String nome, String telefone, String enderecp, int qdtEmprestimo, String cnpj, String representante) {
        super(nome, telefone, enderecp, qdtEmprestimo);
        this.cnpj = cnpj;
        this.representante = representante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public void emprestar() {
        this.setQdtEmprestimo(this.getQdtEmprestimo() + 1);
        System.out.println("Empréstimo realizado com sucesso");
    }
}
