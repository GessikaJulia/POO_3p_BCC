public abstract class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    private int qtdEmprestado;

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.qtdEmprestado = 0;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQtdEmprestado() {
        return qtdEmprestado;
    }

    public void setQtdEmprestado(int qtdEmprestado) {
        this.qtdEmprestado = qtdEmprestado;
    }

    public abstract boolean podeFazerEmprestimo();

    public void adicionarEmprestimo(Carro carro) {
        this.qtdEmprestado++;
    }

    public void renovarAluguel(Carro carro) {
        carro.renovar();
    }

    public void devolverCarro(Carro carro) {
        this.qtdEmprestado--;
    }
}
