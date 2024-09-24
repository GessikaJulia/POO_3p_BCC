public class PessoaFisica extends Pessoa{
private String cpf;
public PessoaFisica(String nome, String telefone, String endereco, int limiteEmprestimo, String cpf) {
    super(nome, telefone, endereco, limiteEmprestimo);
    this.cpf = cpf;
}
public String getCpf() {
    return cpf;
}
}