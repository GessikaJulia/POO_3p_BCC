public class CarroSuv extends Veiculo {
    private String tracao;
    private String combustivel;
    private String portaMalas;

    public CarroSuv(String marca, String modelo, String placa, String ano, double valor, double multa,String tracao, String combustivel, String portaMalas){
        super(marca, modelo, placa, ano, valor, multa);
        this.tracao = tracao;
        this.combustivel = combustivel;
        this.portaMalas = portaMalas;

    }
    @Override
    public double multa(int quantidadeDeRenovacoes){
        if(getVezesRenovado() > 3){
            double multa = super.getMulta() * (quantidadeDeRenovacoes -3);
            return multa;
        }else{
            return 0;
        }
    }
}