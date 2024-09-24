public class ProdutoFisico extends Produto {
    private double peso;
    private double frete;
    private double valorTotal;

    public ProdutoFisico(String nome, double preco, int quantidade, double valorTotal, double peso, double frete) {
        super(nome, preco, quantidade, valorTotal);
        this.peso = peso;
        this.frete = frete;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public void totalFrete(){
        if (peso <= 2.0){
            frete = 5.0;
        }
        else if (peso <= 5.0) {
            frete = 10.0;
        } else if (peso > 5) {
            frete = 0.0;
            frete = 2.5 * getPeso();
        }
        ///else{
     //     if (peso>5.0,peso++1.0){     DESISTI DE TENTAR CALCULAR O FRETE PROFESSOR, DEPOIS DOS 5KG E ADD 2,50 NO VALOR. NÃO COMPLETEI A LOGICA
     //         frete = 10.0 + 2.5;
     //     }
      //}
    }

    @Override
    public void calcularTotal(){
        valorTotal = getPreco() * getQuantidade() + get.calcularFrete();

    }
}


