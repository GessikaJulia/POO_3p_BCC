public class Paciente {
    private String nomePaciente;
    private String enderecoPaciente;
    private String cpfPaciente;
    private String telefonePaciente;
    private String dataNascimentoPaciente;
    private String profissaoPaciente;

    public Paciente(String nomePaciente, String enderecoPaciente, String cpfPaciente, String telefonePaciente, String dataNascimentoPaciente, String profissaoPaciente) {
        this.nomePaciente = nomePaciente;
        this.enderecoPaciente = enderecoPaciente;
        this.cpfPaciente = cpfPaciente;
        this.telefonePaciente = telefonePaciente;
        this.dataNascimentoPaciente = dataNascimentoPaciente;
        this.profissaoPaciente = profissaoPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getTelefonePaciente() {
        return telefonePaciente;
    }

    public void setTelefonePaciente(String telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }

    public String getDataNascimentoPaciente() {
        return dataNascimentoPaciente;
    }

    public void setDataNascimentoPaciente(String dataNascimentoPaciente) {
        this.dataNascimentoPaciente = dataNascimentoPaciente;
    }

    public String getProfissaoPaciente() {
        return profissaoPaciente;
    }

    public void setProfissaoPaciente(String profissaoPaciente) {
        this.profissaoPaciente = profissaoPaciente;
    }
}
