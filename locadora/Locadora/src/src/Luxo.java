public class Luxo extends Carro {
    private int quantidadeAirbags;
    private int tamanhoPortaMalas;
    private boolean possuiGPS;

    public Luxo(String marcaCarro, String modeloCarro, String placaCarro, String anoCarro, double valorLocacao, double multaRenovacao, int quantidadeAirbags, int tamanhoPortaMalas, boolean possuiGPS, int qtdRenovacaoGratuita) {
        super(marcaCarro, modeloCarro, placaCarro, anoCarro, valorLocacao, multaRenovacao, qtdRenovacaoGratuita);
        this.quantidadeAirbags = quantidadeAirbags;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.possuiGPS = possuiGPS;
    }

    public int getQuantidadeAirbags() {
        return quantidadeAirbags;
    }

    public void setQuantidadeAirbags(int quantidadeAirbags) {
        this.quantidadeAirbags = quantidadeAirbags;
    }

    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public boolean isPossuiGPS() {
        return possuiGPS;
    }

    public void setPossuiGPS(boolean possuiGPS) {
        this.possuiGPS = possuiGPS;
    }
}
