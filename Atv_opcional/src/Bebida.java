public class Bebida extends ItemCardapio {
    private String tamanho;
    private String temperatura;

    public Bebida(String nomeItem, double precoItem, String tamanho, String temperatura) {
        super(nomeItem, precoItem);
        this.tamanho = tamanho;
        this.temperatura = temperatura;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public double calcularPreco() {
        return super.getPrecoItem();
    }

    @Override
    public String descrever() {
        return "Bebida: " + getNomeItem() + " - " + tamanho + " - " + temperatura;
    }
}
