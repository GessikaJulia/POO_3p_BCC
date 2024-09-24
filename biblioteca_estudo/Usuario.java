public class Usuario {
    private String nomeUsuario;
    private String telefoneUsuario;
    private String emailUsuario;
    private String cpfUsuario;
    private int limiteEmprestimo;
    private int quantidadeEmprestimo;



    public Usuario(String nomeUsuario, String telefoneUsuario, String emailUsuario, String cpfUsuario, int limiteEmprestimo) {
        this.nomeUsuario = nomeUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.emailUsuario = emailUsuario;
        this.cpfUsuario = cpfUsuario;
        this.limiteEmprestimo = limiteEmprestimo;
        this.quantidadeEmprestimo = 0;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public int getQuantidadeEmprestimo() {
        return quantidadeEmprestimo;
    }

    public void setQuantidadeEmprestimo(int quantidadeEmprestimo) {
        this.quantidadeEmprestimo = quantidadeEmprestimo;
    }

    public void realizarEmprestimo() {
        this.quantidadeEmprestimo++;
    }

    public void devolverEmprestimo() {
        this.quantidadeEmprestimo--;
    }

    public boolean podeFazerEmprestimo() {
        return this.quantidadeEmprestimo <= this.limiteEmprestimo;
    }
}

