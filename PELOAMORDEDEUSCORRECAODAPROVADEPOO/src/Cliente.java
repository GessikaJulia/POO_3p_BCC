public abstract class Cliente {
    private String nome;
    private String telefone;
    private String Endereco;

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        Endereco = endereco;
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
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public abstract int qtdDisponivelComprar();
}
