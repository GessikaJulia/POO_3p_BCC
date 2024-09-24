import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Publicacoes> publicacoes;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    //OPCIONAL NA PROVA, PROTEGE O ARRAY

    //public void addPublicacao(Publicacoes publicacao) {
      //  this.publicacoes.add(publicacao);
    //}

    //public void removePublicacao(Publicacoes publicacao) {
       // this.publicacoes.remove(publicacao);
    //}
}


