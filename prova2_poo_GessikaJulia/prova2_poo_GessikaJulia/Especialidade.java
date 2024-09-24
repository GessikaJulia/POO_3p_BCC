public class Especialidade {
    private String nomeEspecialidade;
    private String nmrEspecialidadeCrm;

    public Especialidade(String nomeEspecialidade, String nmrEspecialidadeCrm) {
        this.nomeEspecialidade = nomeEspecialidade;
        this.nmrEspecialidadeCrm = nmrEspecialidadeCrm;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    public String getNmrEspecialidadeCrm() {
        return nmrEspecialidadeCrm;
    }

    public void setNmrEspecialidadeCrm(String nmrEspecialidadeCrm) {
        this.nmrEspecialidadeCrm = nmrEspecialidadeCrm;
    }
}
