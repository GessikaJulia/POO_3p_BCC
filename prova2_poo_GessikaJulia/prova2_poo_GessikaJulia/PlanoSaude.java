public class PlanoSaude {
    private String nomePlanoSaude;
    private String telefonePlanoSaude;
    private String cnpjPlanoSaude;
    private String enderecoPlanoSaude;

    public PlanoSaude(String nomePlanoSaude, String telefonePlanoSaude, String cnpjPlanoSaude, String enderecoPlanoSaude) {
        this.nomePlanoSaude = nomePlanoSaude;
        this.telefonePlanoSaude = telefonePlanoSaude;
        this.cnpjPlanoSaude = cnpjPlanoSaude;
        this.enderecoPlanoSaude = enderecoPlanoSaude;
    }

    public String getNomePlanoSaude() {
        return nomePlanoSaude;
    }

    public void setNomePlanoSaude(String nomePlanoSaude) {
        this.nomePlanoSaude = nomePlanoSaude;
    }

    public String getTelefonePlanoSaude() {
        return telefonePlanoSaude;
    }

    public void setTelefonePlanoSaude(String telefonePlanoSaude) {
        this.telefonePlanoSaude = telefonePlanoSaude;
    }

    public String getCnpjPlanoSaude() {
        return cnpjPlanoSaude;
    }

    public void setCnpjPlanoSaude(String cnpjPlanoSaude) {
        this.cnpjPlanoSaude = cnpjPlanoSaude;
    }

    public String getEnderecoPlanoSaude() {
        return enderecoPlanoSaude;
    }

    public void setEnderecoPlanoSaude(String enderecoPlanoSaude) {
        this.enderecoPlanoSaude = enderecoPlanoSaude;
    }
}
