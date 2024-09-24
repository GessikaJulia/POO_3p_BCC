import java.util.ArrayList;

public class Biblioteca {
    private String nomeBiblioteca;
    private String enderecoBiblioteca;
    private ArrayList<Publicacao> publicacoes;

    public Biblioteca(String nomeBiblioteca, String enderecoBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.enderecoBiblioteca = enderecoBiblioteca;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getEnderecoBiblioteca() {
        return enderecoBiblioteca;
    }

    public void setEnderecoBiblioteca(String enderecoBiblioteca) {
        this.enderecoBiblioteca = enderecoBiblioteca;
    }

    public void addPublicacao(Publicacao publicacao) {
        this.publicacoes.add(publicacao);
    }

    public void removePublicacao(Publicacao publicacao) {
        this.publicacoes.remove(publicacao);
    }

}
