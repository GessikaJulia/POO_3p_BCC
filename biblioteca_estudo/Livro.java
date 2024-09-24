public class Livro extends Publicacao {
    private String nEdicaoLivro;
    private String editoraLivro;
    private String isbnLivro;


    public Livro(String dataPublicacao, String titulo, Autor autor, double multa, String nEdicaoLivro, String editoraLivro, String isbnLivro) {
        super(dataPublicacao, titulo, autor, multa);
        this.nEdicaoLivro = nEdicaoLivro;
        this.editoraLivro = editoraLivro;
        this.isbnLivro = isbnLivro;
    }

    public String getnEdicaoLivro() {
        return nEdicaoLivro;
    }

    public void setnEdicaoLivro(String nEdicaoLivro) {
        this.nEdicaoLivro = nEdicaoLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public String getIsbnLivro() {
        return isbnLivro;
    }

    public void setIsbnLivro(String isbnLivro) {
        this.isbnLivro = isbnLivro;
    }
}
