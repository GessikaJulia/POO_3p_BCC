import java.util.List;

public class Teses extends Publicacoes {
    private int numeroPaginas;

    private String instituicao;
    private String resumo;
    private String dataDefesa;

    public Teses(String titulo, String dataPublicacao, double multa, int numeroPaginas, String instituicao, String resumo, String dataDefesa) {
        super(titulo, dataPublicacao, multa);
        this.numeroPaginas = numeroPaginas;
        this.instituicao = instituicao;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }
}
