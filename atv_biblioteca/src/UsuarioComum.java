public class UsuarioComum extends Usuario{


    public UsuarioComum(String nome, String telefone, String email, String cpf, int quantidadeEmprestimos) {
        super(nome, telefone, email, cpf, quantidadeEmprestimos, 1);
    }
}

