public class usuarioComum extends Usuario{
    private Emprestimo emprestimo;

    public usuarioComum(String nomeUsuario, String telefoneUsuario, String emailUsuario, String cpfUsuario) {
        super(nomeUsuario, telefoneUsuario, emailUsuario, cpfUsuario, 3);


    }
}
