public class Emprestimo {
    private Publicacoes publicacao;
    private Usuario usuario;

    public Emprestimo(Publicacoes publicacao, Usuario usuario) {
        this.publicacao = publicacao;
        this.usuario = usuario;
    }
    public Emprestimo(Publicacoes publicacao, Usuario usuario)throws Exception {
        if(publicacao.isDispponivel()){
           if(usuario.podeFazerEmprestimo()){
               this.publicacao = publicacao;
                this.usuario = usuario;
                this.publicacao.setDispponivel(false);
                this.usuario.setQuantidadeEmprestimos(this.usuario.getQuantidadeEmprestimos()+1);
                this.quantidadeRenovacao = 0;
           }
           throw new Exception("Quantidade de emprestimos excedida");
        }
        throw new Exception("Publicacao indisponivel");
    }
    public void renovar() {
        this.quantidadeRenovacao++;
    }
    public void devolver(){
        this.publicacao.devolver();
        this.usuario.devolverEmprestimo();
        this.calcularMulta();
    }
    public void calcularMulta(){
        if(this.quantidadeRenovacao < 3){
            return 0;
        } else {
            return (this.quantidadeRenovacao - 3) * this.publicacao.getMulta();
        }
    }
}



