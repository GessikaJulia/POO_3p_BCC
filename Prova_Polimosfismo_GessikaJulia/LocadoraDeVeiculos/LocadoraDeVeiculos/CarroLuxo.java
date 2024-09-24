public class CarroLuxo extends Veiculo{
    private boolean airBags;
    private boolean portaMalas;
    private boolean gps;
    
    public CarroLuxo(String marca, String modelo, String placa, String ano, double valor, double multa,boolean airBags, boolean portaMalas, boolean gps) {
        super(marca, modelo, placa, ano, valor, multa);
        this.airBags = airBags;
        this.portaMalas = portaMalas;
        this.gps = gps;
    }
    @Override
    public double multa(int quantidadeDeRenovacoes){
        if(super.getVezesRenovado() > 5){
            double multa = super.getMulta() * (quantidadeDeRenovacoes -5);
            return multa;
        }else{
            return 0;
        }
    }
}