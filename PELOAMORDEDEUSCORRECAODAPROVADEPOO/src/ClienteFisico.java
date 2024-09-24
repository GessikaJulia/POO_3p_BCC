public class ClienteFisico extends Cliente{
    private String CPF;

    public ClienteFisico(String nome, String telefone, String endereco, String CPF) {
        super(nome, telefone, endereco);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public int qtdDisponivelComprar() {
        return 3;
    }
}
