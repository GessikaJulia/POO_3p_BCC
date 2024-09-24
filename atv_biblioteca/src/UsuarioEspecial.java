public class UsuarioEspecial extends Usuario {

    public UsuarioEspecial(String nome, String telefone, String email, String cpf, int quantidadeEmprestimos) {
        super(nome, telefone, email, cpf, quantidadeEmprestimos, Integer.MAX_VALUE);
    }
}