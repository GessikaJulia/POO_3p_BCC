public class Sobremesa extends ItemCardapio {
    private double tamanhoPorcao;
    private double contagemCalorias;

    public Sobremesa(String nomeItem, double precoItem, double tamanhoPorcao, double contagemCalorias) {
        super(nomeItem, precoItem);
        this.tamanhoPorcao = tamanhoPorcao;
        this.contagemCalorias = contagemCalorias;
    }

    public double getTamanhoPorcao() {
        return tamanhoPorcao;
    }

    public void setTamanhoPorcao(double tamanhoPorcao) {
        this.tamanhoPorcao = tamanhoPorcao;
    }

    public double getContagemCalorias() {
        return contagemCalorias;
    }

    public void setContagemCalorias(double contagemCalorias) {
        this.contagemCalorias = contagemCalorias;
    }

    @Override
    public double calcularPreco() {
        return super.getPrecoItem();
    }

    @Override
    public String descrever() {
        return "Sobremesa: " + getNomeItem() + " - " + tamanhoPorcao + " - " + contagemCalorias;
    }
}
