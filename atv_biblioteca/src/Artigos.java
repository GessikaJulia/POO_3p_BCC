public class Artigos extends Publicacoes {
    private String resumo;

    public Artigos(String titulo, String dataPublicacao, double multa, String resumo) {
        super(titulo, dataPublicacao, multa);
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
