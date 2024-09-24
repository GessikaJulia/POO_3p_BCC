public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String enderecp;
    private int qdtEmprestimo;

    public Pessoa(String nome, String telefone, String enderecp, int qdtEmprestimo) {
        if (this.qdtEmprestimo < 0){
            throw new IllegalArgumentException("Quantidade de empréstimos não pode ser negativa");
        }
        this.nome = nome;
        this.telefone = telefone;
        this.enderecp = enderecp;
        this.qdtEmprestimo = qdtEmprestimo;
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

    public String getEnderecp() {
        return enderecp;
    }

    public void setEnderecp(String enderecp) {
        this.enderecp = enderecp;
    }

    public int getQdtEmprestimo() {
        return qdtEmprestimo;
    }

    public void setQdtEmprestimo(int qdtEmprestimo) {
        this.qdtEmprestimo = qdtEmprestimo;
    }

    public abstract void emprestar();

}
