import java.util.ArrayList;

public abstract class Carro {
    private String marca;
    private String placa;
    private String ano;
    private double valorLocacao;
    private boolean disponivel;

    public Carro(String marca, String placa, String ano, double valorLocacao, boolean disponivel) {
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
        this.disponivel = true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}
