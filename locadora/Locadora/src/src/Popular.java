public class Popular extends Carro {
    private boolean possuiArCondicionado;

    public Popular(String marcaCarro, String modeloCarro, String placaCarro, String anoCarro, double valorLocacao, double multaRenovacao, boolean possuiArCondicionado, int qtdRenovacaoGratuita) {
        super(marcaCarro, modeloCarro, placaCarro, anoCarro, valorLocacao, multaRenovacao, qtdRenovacaoGratuita);
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    public void setPossuiArCondicionado(boolean possuiArCondicionado) {
        this.possuiArCondicionado = possuiArCondicionado;
    }
}
