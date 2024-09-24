public class Emprestimo {
    private Cliente cliente;
    private Carro carro;
    private int qtdRenovacao;

    public Emprestimo(Cliente cliente, Carro carro) throws Exception {
        if (carro.isDisponivel()) {
            if (cliente.podeFazerEmprestimo()) {
                this.cliente = cliente;
                this.carro = carro;
                this.carro.emprestar();
                this.cliente.adicionarEmprestimo(carro);
                this.qtdRenovacao = 0;
            } else {
                throw new Exception("Limite do usuário atingido");
            }
        } else {
            throw new Exception("Carro não disponível");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getQtdRenovacao() {
        return qtdRenovacao;
    }

    public void setQtdRenovacao(int qtdRenovacao) {
        this.qtdRenovacao = qtdRenovacao;
    }

    public void renovar() {
        setQtdRenovacao(getQtdRenovacao()+1);

        this.cliente.renovarAluguel(carro);
    }

    public double calcularMulta() {
        int renovacoesExtras = Math.max(0, this.qtdRenovacao - this.carro.getQtdRenovacaoGratuita());
        return renovacoesExtras * this.carro.getMultaRenovacao();
    }
}
