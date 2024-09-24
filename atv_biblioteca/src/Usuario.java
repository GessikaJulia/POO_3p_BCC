public abstract class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;

    private int quantidadeEmprestimos;
    private int limite;

    public Usuario(String nome, String telefone, String email, String cpf, int quantidadeEmprestimos, int limite) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.quantidadeEmprestimos = 0;
        this.limite = limite;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQuantidadeEmprestimos() {
        return quantidadeEmprestimos;
    }

    public void setQuantidadeEmprestimos(int quantidadeEmprestimos) {
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }

    //TODO imcompleto, implementar posteriormente
    public int getLimite() {
        return limite;
    }

}