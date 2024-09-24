import java.util.ArrayList;

public abstract class Funcionario {
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;
    private String salario;
    private ArrayList<Medico> medicos;
    private ArrayList<Secretario> secretarios;

    public Funcionario(String nome, String telefone, String endereco, String cpf, String salario, Medico medicos, Secretario secretarios) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
        this.medicos = new ArrayList<Medico>();
        this.secretarios = new ArrayList<Secretario>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void addMedico(Medico medicos) {
        this.medicos.add(medicos);
    }

    public void removeMedico(Medico medicos) {
        this.medicos.remove(medicos);
    }

    public void addSecretario(Secretario secretarios) {
        this.secretarios.add(secretarios);
    }

    public void removeSecretario(Secretario secretarios) {
        this.secretarios.remove(secretarios);
    }
}
