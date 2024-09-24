public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private double valorLocacao;
    private boolean estaAlugado = false;
    private int vezesRenovado;
    private double multa;

    public Veiculo(String marca, String modelo, String placa, String ano, double valor, double multa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.multa = multa;
        this.valorLocacao = valor;
    }
    
    public boolean getEstaAlugado() {
        return estaAlugado;
    }
    public void setEstaAlugado(boolean estaAlugado) {
        this.estaAlugado = estaAlugado;
    }
    public String getAno() {
        return ano;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public double getValorLocacao() {
        return valorLocacao;
    }
    
    public abstract double multa(int quantidadeDeRenovacoes);

    public int getVezesRenovado() {
        return vezesRenovado;
    }
    public double getMulta() {
        return multa;
    }
    public void addVezesRenovado(int incremento) {
        this.vezesRenovado += incremento;
    }
    public void devolverVeiculo(){
        this.estaAlugado = false;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return marca +  " " + modelo + " " + placa + " " + ano + " " + valorLocacao;
    }
}