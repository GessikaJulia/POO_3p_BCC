import java.util.ArrayList;

public abstract class Publicacao {
    private String dataPublicacao;
    private String titulo;
    private ArrayList<Publicacao>publicacoesReferencia;
    private ArrayList<Autor> autores;
    private Boolean disponibilidade;
    private double multa;

    public Publicacao(String dataPublicacao, String titulo, Autor autor, double multa) {
        this.dataPublicacao = dataPublicacao;
        this.titulo = titulo;
        this.publicacoesReferencia = new ArrayList<Publicacao>();
        this.autores = new ArrayList<Autor>();
        this.autores.add(autor);
        this.disponibilidade = true;
        this.multa = multa;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void addPublicacaoReferencia(Publicacao publicacao){
        this.publicacoesReferencia.add(publicacao);
    }

    public void removePublicacaoReferencia(Publicacao publicacao){
        this.publicacoesReferencia.remove(publicacao);
    }
    public void addAutor(Autor autor){
        this.autores.add(autor);
    }

    public void removeAutor(Autor autor){
       if (this.autores.size() != 1){
           this.autores.remove(autor);
       }
    }

    public void editAutor(int pos, Autor autor){
        this.autores.set(pos, autor);
    }
    public Boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void emprestar(){
        this.disponibilidade = false;
    }

    public void devolver(){
        this.disponibilidade = true;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
}
