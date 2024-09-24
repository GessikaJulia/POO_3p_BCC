public class Artigo extends Publicacao{
    private String resumoArtigo;


    public Artigo(String dataPublicacao, String titulo, Autor autor, double multa, String resumoArtigo) {
        super(dataPublicacao, titulo, autor, multa);
        this.resumoArtigo = resumoArtigo;
    }

    public String getResumoArtigo() {
        return resumoArtigo;
    }

    public void setResumoArtigo(String resumoArtigo) {
        this.resumoArtigo = resumoArtigo;
    }
}
