import java.util.ArrayList;

public class Medico extends Funcionario {
    public String nmrCrmMedico;
    public String horarioInicioMedico;
    public String horarioFimMedico;
    public ArrayList<PlanoSaude> planosSaude;
    Especialidade especialidade;

    public Medico(String nome, String telefone, String endereco, String cpf, String salario, Medico medicos, Secretario secretarios, String nmrCrmMedico, String horarioInicioMedico, String horarioFimMedico, PlanoSaude planosSaude, Especialidade especialidade) {
        super(nome, telefone, endereco, cpf, salario, medicos, secretarios);
        this.nmrCrmMedico = nmrCrmMedico;
        this.horarioInicioMedico = horarioInicioMedico;
        this.horarioFimMedico = horarioFimMedico;
        this.planosSaude = new ArrayList<PlanoSaude>();
        this.especialidade = especialidade;
    }

    public String getNmrCrmMedico() {
        return nmrCrmMedico;
    }

    public void setNmrCrmMedico(String nmrCrmMedico) {
        this.nmrCrmMedico = nmrCrmMedico;
    }

    public String getHorarioInicioMedico() {
        return horarioInicioMedico;
    }

    public void setHorarioInicioMedico(String horarioInicioMedico) {
        this.horarioInicioMedico = horarioInicioMedico;
    }

    public String getHorarioFimMedico() {
        return horarioFimMedico;
    }

    public void setHorarioFimMedico(String horarioFimMedico) {
        this.horarioFimMedico = horarioFimMedico;
    }

    public void addPlanoSaude(PlanoSaude planosSaude) {
        this.planosSaude.add(planosSaude);
    }

    public void removePlanoSaude(PlanoSaude planosSaude) {
        this.planosSaude.remove(planosSaude);
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public boolean sintomasPaciente() {
        if (true) {
            System.out.println(sintomasPaciente());
            return true;
        } else {
            System.out.println("Não ha anotacoes de sintomas do paciente");
            return false;
        }
    }

    public boolean prescricaoMedicamentosPaciente() {
        if (true) {
            System.out.println(prescricaoMedicamentosPaciente());
            return true;
        } else {
            System.out.println("Não tem medicacoes prescritas ao paciente");
            return false;
        }
    }

    public boolean pedidosExamesPaciente() {
        if (true) {
            System.out.println(pedidosExamesPaciente());
            return true;
        } else {
            System.out.println("Não houve pedidos de exames ao paciente");
            return false;
        }
    }

}