import java.util.ArrayList;
public abstract class Publicacoes { //abstract não deixa criar uma publicação como objeto
    private String titulo;
    private String dataPublicacao;
    private ArrayList<Autor> autores;
    private ArrayList<Publicacoes> publicacoesReferencia;
    private boolean dispponivel;
    private double multa;

    public Publicacoes(String titulo, String dataPublicacao, double multa) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.autores = new ArrayList<Autor>();
        this.publicacoesReferencia = new ArrayList<Publicacoes>();
        this.dispponivel = true;
        this.multa = multa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }


    public boolean isDispponivel() {
        return dispponivel;
    }

    public void setDispponivel(boolean dispponivel) {
        this.dispponivel = dispponivel;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    public void addAutor(Autor autor){
        autores.add(autor);
    }

    public void removeAutor(Autor autor){
        autores.remove(autor);
    }

    public void addPublicacaoReferencia(Publicacoes publicacao){
        publicacoesReferencia.add(publicacao);
    }

    public void removePublicacaoReferencia(Publicacoes publicacao){
        publicacoesReferencia.remove(publicacao);
    }

}


