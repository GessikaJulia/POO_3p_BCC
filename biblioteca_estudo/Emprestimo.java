public class Emprestimo {
    private Publicacao publicacao;
    private Usuario usuario;
    private int nRenovacoesEmprestimo;


    public Emprestimo(Publicacao publicacao, Usuario usuario) throws Exception {
        if(publicacao.isDisponibilidade()){
            if(usuario.podeFazerEmprestimo()){
                this.publicacao = publicacao;
                this.usuario = usuario;
                this.nRenovacoesEmprestimo = 0;
                this.publicacao.emprestar();
                this.usuario.realizarEmprestimo();
                this.nRenovacoesEmprestimo = 0;
            } else {
                throw new Exception("Limite do usuário atingido");
            }
        } else {
            throw new Exception("Publicação não disponível");
        }
    }
    public void renovar(){
        this.nRenovacoesEmprestimo++;
    }
    public void devolver(){
        this.publicacao.devolver();
        this.usuario.devolverEmprestimo();
        double multa = this.calcularMulta();
        System.out.println("Multa: " + multa);
    }

    public double calcularMulta(){
        if (this.nRenovacoesEmprestimo <= 3){
            return 0;
        }else{
            return (this.nRenovacoesEmprestimo - 3) * this.publicacao.getMulta();
        }
    }
}

