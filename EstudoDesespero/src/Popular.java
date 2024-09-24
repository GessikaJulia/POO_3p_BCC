public class Popular extends Carro{
    private boolean arCondicionado;


    public Popular(String marca, String placa, String ano, double valorLocacao, boolean disponivel, boolean arCondicionado) {
        super(marca, placa, ano, valorLocacao, disponivel);
        this.arCondicionado = arCondicionado;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
}
