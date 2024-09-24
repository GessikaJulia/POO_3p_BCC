public class produtos {
    private String nome;
    private String marca;
    private double preco;
    private int codU;
    private int quantEstoque;

    public class produtos {
     
    this.nome = nome; 
    this.marca = marca;
    this.preco = preco;
    this.codU = codU;
    this.quantEstoque = quantEstoque;
        
    }
    
     double atualiPreco(){
        if(precoNovo != preco){
            preco = precoNovo;
        }
        return true;
     }

     double controlEstoque(){
        if(estoqueNovo != quantEstoque){
            quantEstoque = estoqueNovo; 
        }
        return true;
     }

     double venda(){
        if (quantVenda < quantEstoque) {
            System.out.println("Produto insuficiente!\n Quantidade disponivel é de:"+quantEstoque);
        }else{
            quantEstoque-=quantVenda;
            System.out.println("Venda concluida com sucesso!\n Quantidade disponivel é de:"+quantEstoque);
        }
        return true;
     }

     public String getNome() {
         return nome;
     }
     public void setNome(String nome) {
         this.nome = nome;
     }
     public String getMarca() {
         return marca;
     }
     public void setMarca(String marca) {
         this.marca = marca;
     }
     public double getPreco() {
         return preco;
     }
     public void setPreco(double preco) {
         this.preco = preco;
     }
     public int getCodU() {
         return codU;
     }
     public void setCodU(int codU) {
         this.codU = codU;
     }
     public int getQuantEstoque() {
         return quantEstoque;
     }
     public void setQuantEstoque(int quantEstoque) {
         this.quantEstoque = quantEstoque;
     }
}


