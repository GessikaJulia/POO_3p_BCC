public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private int qtdEmprestimos;
    private int limiteEmprestimo;
    public Pessoa(String nome, String telefone, String endereco, int limiteEmprestimo) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public boolean getPodeEmprestar(){
        return qtdEmprestimos < limiteEmprestimo;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setQtdEmprestimos(int qtdEmprestimos) {
        this.qtdEmprestimos += qtdEmprestimos;
    }
}