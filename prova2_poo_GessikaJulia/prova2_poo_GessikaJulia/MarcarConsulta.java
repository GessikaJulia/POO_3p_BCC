public class MarcarConsulta extends Consulta{
    public MarcarConsulta(String nome, String telefone, String endereco, String cpf, String salario, Medico medicos, Secretario secretarios, String nmrCrmMedico, String horarioInicioMedico, String horarioFimMedico, PlanoSaude planosSaude, Especialidade especialidade, Medico medico, Paciente paciente, Secretario secretario, String horarioConsulta, boolean consultaParticular, int valorConsulta) {
        super(nome, telefone, endereco, cpf, salario, medicos, secretarios, nmrCrmMedico, horarioInicioMedico, horarioFimMedico, planosSaude, especialidade, medico, paciente, secretario, horarioConsulta, consultaParticular, valorConsulta);
    }

    public MarcarConsulta(String nome, String telefone, String endereco, String cpf, String salario, Medico medicos, Secretario secretarios, String nmrCrmMedico, String horarioInicioMedico, String horarioFimMedico, PlanoSaude planosSaude, Especialidade especialidade, Medico medico, Paciente paciente, Secretario secretario, String horarioConsulta, PlanoSaude planoSaude, int valorConsulta) {
        super(nome, telefone, endereco, cpf, salario, medicos, secretarios, nmrCrmMedico, horarioInicioMedico, horarioFimMedico, planosSaude, especialidade, medico, paciente, secretario, horarioConsulta, planoSaude, valorConsulta);
    }
}
