import java.util.ArrayList;

public class Locadora {
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Carro> carros;
    private ArrayList<Cliente> clientes;
    private ArrayList<Emprestismo> emprestimos;

    public Locadora(String nome, String endereco, String telefone, ArrayList<Carro> carros, ArrayList<Cliente> clientes, ArrayList<Emprestismo> emprestimos) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carros = new ArrayList<Carro>();
        this.clientes = new ArrayList<Cliente>();
        this.emprestimos = new ArrayList<Emprestismo>();
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void removeCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    public void addCarro(Carro carro) {
        carros.add(carro);
    }
    public void removeCarro(Carro carro) {
        carros.remove(carros);
    }
    public void addEmprestimo(Emprestismo emprestimo) {
        emprestimos.add(emprestimo);
    }
    public void removeEmprestimo(Emprestismo emprestimo) {
        emprestimos.remove(emprestimo);
    }

}
