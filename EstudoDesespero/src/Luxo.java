public class Luxo extends Carro{
    private double qtdAirbags;
    private double tamanhoPortaMalas;
    private boolean GPSintegrado;

    public Luxo(String marca, String placa, String ano, double valorLocacao, boolean disponivel, double qtdAirbags, double tamanhoPortaMalas, boolean GPSintegrado) {
        super(marca, placa, ano, valorLocacao, disponivel);
        this.qtdAirbags = qtdAirbags;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.GPSintegrado = GPSintegrado;
    }

    public double getQtdAirbags() {
        return qtdAirbags;
    }

    public void setQtdAirbags(double qtdAirbags) {
        this.qtdAirbags = qtdAirbags;
    }

    public double getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(double tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public boolean isGPSintegrado() {
        return GPSintegrado;
    }

    public void setGPSintegrado(boolean GPSintegrado) {
        this.GPSintegrado = GPSintegrado;
    }
}
