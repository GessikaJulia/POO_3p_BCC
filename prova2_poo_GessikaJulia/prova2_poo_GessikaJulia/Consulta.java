public class Consulta extends Medico{
    Medico medico;
    Paciente paciente;
    Secretario secretario;
    String horarioConsulta;
    private boolean consultaParticular;
    PlanoSaude planoSaude;
    int valorConsulta;

    public Consulta(String nome, String telefone, String endereco, String cpf, String salario, Medico medicos, Secretario secretarios, String nmrCrmMedico, String horarioInicioMedico, String horarioFimMedico, PlanoSaude planosSaude, Especialidade especialidade, Medico medico, Paciente paciente, Secretario secretario, String horarioConsulta, boolean consultaParticular, int valorConsulta) {
        super(nome, telefone, endereco, cpf, salario, medicos, secretarios, nmrCrmMedico, horarioInicioMedico, horarioFimMedico, planosSaude, especialidade);
        this.medico = medico;
        this.paciente = paciente;
        this.secretario = secretario;
        this.horarioConsulta = horarioConsulta;
        this.consultaParticular = consultaParticular;
        this.valorConsulta = valorConsulta;
    }

    public Consulta(String nome, String telefone, String endereco, String cpf, String salario, Medico medicos, Secretario secretarios, String nmrCrmMedico, String horarioInicioMedico, String horarioFimMedico, PlanoSaude planosSaude, Especialidade especialidade, Medico medico, Paciente paciente, Secretario secretario, String horarioConsulta, PlanoSaude planoSaude, int valorConsulta) {
        super(nome, telefone, endereco, cpf, salario, medicos, secretarios, nmrCrmMedico, horarioInicioMedico, horarioFimMedico, planosSaude, especialidade);
        this.medico = medico;
        this.paciente = paciente;
        this.secretario = secretario;
        this.horarioConsulta = horarioConsulta;
        this.planoSaude = planoSaude;
        this.valorConsulta = valorConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public String getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(String horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public boolean isConsultaParticular() {
        return consultaParticular;
    }

    public void setConsultaParticular(boolean consultaParticular) {
        this.consultaParticular = consultaParticular;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }

    public int getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public boolean SintomasPaciente() {
        sintomasPaciente();
        return true;
    }
    public boolean PrescricaoMedicamentosPaciente() {
        prescricaoMedicamentosPaciente();
        return true;
    }
    public boolean pedidosExamesPaciente(){
        pedidosExamesPaciente();
        return true;
    }

}
