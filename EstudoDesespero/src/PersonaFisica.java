public class PersonaFisica extends Pessoa{
    private String cpf;

    public PersonaFisica(String nome, String telefone, String enderecp, int qdtEmprestimo, String cpf) {
        super(nome, telefone, enderecp, qdtEmprestimo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public void emprestar(){
        if (this.getQdtEmprestimo() <=1){
            this.setQdtEmprestimo(this.getQdtEmprestimo() + 1);
        } else {
            System.out.println("Quantidade máxima de empréstimos atingida");
        }
    }
}
