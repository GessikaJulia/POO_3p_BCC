public class SUV extends Carro{
    private double tamanhoPortaMalas;
    private String tipoTracao;
    private String combustivel;

    public SUV(String marca, String placa, String ano, double valorLocacao, boolean disponivel, double tamanhoPortaMalas, String tipoTracao, String combustivel) {
        super(marca, placa, ano, valorLocacao, disponivel);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.tipoTracao = tipoTracao;
        this.combustivel = combustivel;
    }

    public double getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(double tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
