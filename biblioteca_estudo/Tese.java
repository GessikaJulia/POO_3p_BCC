public class Tese extends Publicacao{
    private String nPaginasTese;
    private String resumoTese;
    private String dataDefesaTese;
    private String instituicaoTese;

    public Tese(String dataPublicacao, String titulo, Autor autor, double multa, String nPaginasTese, String resumoTese, String dataDefesaTese, String instituicaoTese) {
        super(dataPublicacao, titulo, autor, multa);
        this.nPaginasTese = nPaginasTese;
        this.resumoTese = resumoTese;
        this.dataDefesaTese = dataDefesaTese;
        this.instituicaoTese = instituicaoTese;
    }

    public String getnPaginasTese() {
        return nPaginasTese;
    }

    public void setnPaginasTese(String nPaginasTese) {
        this.nPaginasTese = nPaginasTese;
    }

    public String getResumoTese() {
        return resumoTese;
    }

    public void setResumoTese(String resumoTese) {
        this.resumoTese = resumoTese;
    }

    public String getDataDefesaTese() {
        return dataDefesaTese;
    }

    public void setDataDefesaTese(String dataDefesaTese) {
        this.dataDefesaTese = dataDefesaTese;
    }

    public String getInstituicaoTese() {
        return instituicaoTese;
    }

    public void setInstituicaoTese(String instituicaoTese) {
        this.instituicaoTese = instituicaoTese;
    }
}
