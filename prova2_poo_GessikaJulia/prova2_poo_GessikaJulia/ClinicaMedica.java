import java.util.ArrayList;

public class ClinicaMedica {
    private String nomeClinicaMedica;
    private String enderecoClinicaMedica;
    private String crmClinicaMedica;
    private String cnpjClinicaMedica;
    private ArrayList<Funcionario> funcionarios;

    public ClinicaMedica(String nomeClinicaMedica, String enderecoClinicaMedica, String crmClinicaMedica, String cnpjClinicaMedica, Funcionario funcionarios) {
        this.nomeClinicaMedica = nomeClinicaMedica;
        this.enderecoClinicaMedica = enderecoClinicaMedica;
        this.crmClinicaMedica = crmClinicaMedica;
        this.cnpjClinicaMedica = cnpjClinicaMedica;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public String getNomeClinicaMedica() {
        return nomeClinicaMedica;
    }

    public void setNomeClinicaMedica(String nomeClinicaMedica) {
        this.nomeClinicaMedica = nomeClinicaMedica;
    }

    public String getEnderecoClinicaMedica() {
        return enderecoClinicaMedica;
    }

    public void setEnderecoClinicaMedica(String enderecoClinicaMedica) {
        this.enderecoClinicaMedica = enderecoClinicaMedica;
    }

    public String getCrmClinicaMedica() {
        return crmClinicaMedica;
    }

    public void setCrmClinicaMedica(String crmClinicaMedica) {
        this.crmClinicaMedica = crmClinicaMedica;
    }

    public String getCnpjClinicaMedica() {
        return cnpjClinicaMedica;
    }

    public void setCnpjClinicaMedica(String cnpjClinicaMedica) {
        this.cnpjClinicaMedica = cnpjClinicaMedica;
    }
    public void addFuncionario(Funcionario funcionarios) {
        this.funcionarios.add(funcionarios);
    }

    public void removeFuncionario(Funcionario funcionarios) {
        this.funcionarios.remove(funcionarios);
    }
}
