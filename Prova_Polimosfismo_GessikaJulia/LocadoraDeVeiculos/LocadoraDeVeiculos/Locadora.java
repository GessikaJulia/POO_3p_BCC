import java.util.ArrayList;
public class Locadora {
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Object> carrosDisponiveis;
    private ArrayList<String> cliente;
    private ArrayList<Veiculo> emprestimo;
    
    public Locadora(String nome, String endereco, String telefone, Object carrosDisponiveis) {
        this.carrosDisponiveis = new ArrayList<Object>();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Locadora(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public ArrayList<Object> getCarrosDisponiveis() {
        return carrosDisponiveis;
    }

    public ArrayList<String> getCliente() {
        return cliente;
    }

    public ArrayList<Veiculo> getEmprestimo() {
        return emprestimo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}