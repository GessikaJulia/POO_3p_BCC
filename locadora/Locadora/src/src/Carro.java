public abstract class Carro {
    private String marcaCarro;
    private String modeloCarro;
    private String placaCarro;
    private String anoCarro;
    private double valorLocacao;
    private boolean disponivel;
    private double multaRenovacao;
    private int qtdRenovacaoGratuita;
    private int renovacoesFeitas;

    public Carro(String marcaCarro, String modeloCarro, String placaCarro, String anoCarro, double valorLocacao, double multaRenovacao, int qtdRenovacaoGratuita) {
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.placaCarro = placaCarro;
        this.anoCarro = anoCarro;
        this.valorLocacao = valorLocacao;
        this.disponivel = true;
        this.multaRenovacao = multaRenovacao;
        this.qtdRenovacaoGratuita = qtdRenovacaoGratuita;
        this.renovacoesFeitas = 0;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(String anoCarro) {
        this.anoCarro = anoCarro;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getMultaRenovacao() {
        return multaRenovacao;
    }

    public void setMultaRenovacao(double multaRenovacao) {
        this.multaRenovacao = multaRenovacao;
    }

    public int getQtdRenovacaoGratuita() {
        return qtdRenovacaoGratuita;
    }

    public void setQtdRenovacaoGratuita(int qtdRenovacaoGratuita) {
        this.qtdRenovacaoGratuita = qtdRenovacaoGratuita;
    }

    public int getRenovacoesFeitas() {
        return renovacoesFeitas;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            renovacoesFeitas = 0;
        }
    }

    public void devolver() {
        disponivel = true;
        renovacoesFeitas = 0;
    }

    public void renovar() {
        renovacoesFeitas++;
    }

    public double calcularValorTotal() {
        int renovacoesExtras = Math.max(0, renovacoesFeitas - qtdRenovacaoGratuita);
        return valorLocacao + renovacoesExtras * multaRenovacao;
    }
}
