public class Livros extends Publicacoes {

    private int edicao;

    private String editora;

    private String isbn;

    public Livros(String titulo, String dataPublicacao, double multa, Autor autor , int numeroPaginas, int edicao, String editora, String isbn ) {
        super(titulo, dataPublicacao, multa);
        this.addAutor(autor);
        this.edicao = edicao;
        this.editora = editora;
        this.isbn = isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}