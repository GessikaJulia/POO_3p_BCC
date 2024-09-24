public class CarroPopular extends Veiculo{
    private boolean arCondiconado;
    public CarroPopular(String marca, String modelo, String placa, String ano, double valor,double multa,boolean arCondiconado) {
        super(marca, modelo, placa, ano, valor, multa);
        this.arCondiconado = arCondiconado;
    }
    @Override
    public double multa(int quantidadeDeRenovacoes){
        if(getVezesRenovado() > 1){
            double multa = super.getMulta() * (quantidadeDeRenovacoes -1);
            return multa;
        }else{
            return 0;
        }
    }
}