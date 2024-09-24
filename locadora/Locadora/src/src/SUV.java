public class SUV extends Carro {
    private int tamanhoPortaMalas;
    private String tipoTracao;
    private String tipoCombustivel;

    public SUV(String marcaCarro, String modeloCarro, String placaCarro, String anoCarro, double valorLocacao, double multaRenovacao, int tamanhoPortaMalas, String tipoTracao, String tipoCombustivel, int qtdRenovacaoGratuita) {
        super(marcaCarro, modeloCarro, placaCarro, anoCarro, valorLocacao, multaRenovacao, qtdRenovacaoGratuita);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.tipoTracao = tipoTracao;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
