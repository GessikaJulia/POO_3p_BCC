public class PessoaJuridica extends Pessoa{
private String cnpj;
private String nomeRepresentante;
public PessoaJuridica(String nome, String telefone, String endereco, int limiteEmprestimo,String cnpj, String nomeRepresentante) {
    super(nome, telefone, endereco, limiteEmprestimo);
    this.cnpj = cnpj;
    this.nomeRepresentante = nomeRepresentante;
}
public String getCnpj() {
    return cnpj;
}
public String getNomeRepresentante() {
    return nomeRepresentante;
}
@Override
public boolean getPodeEmprestar(){
    return true;
}

}