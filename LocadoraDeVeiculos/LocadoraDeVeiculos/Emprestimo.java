public class Emprestimo {
    private int quantidadeDeRenovacoes;

    public  Emprestimo(Pessoa pessoa, Veiculo veiculo){
        if(veiculo.getEstaAlugado() == false){
            if(pessoa.getPodeEmprestar()){
                Locadora locadora = new Locadora("Marcinho", "1234", "4234");
                locadora.getEmprestimo().add(veiculo);
                pessoa.setQtdEmprestimos(1);
            }else{
                throw new EmprestimoException("Usuário comum só pode fazer um emprestimo por vez.");
            }
        }
        throw new VeiculoException("Veiculo indisponivel");
    }

    public void renovarAluguel(){
        quantidadeDeRenovacoes ++;
    }

    public double devolverVeiculo(Veiculo veiculo) {
        double valorFinalEmprestimo = veiculo.getValorLocacao() + veiculo.multa(quantidadeDeRenovacoes);
        veiculo.devolverVeiculo();
        return valorFinalEmprestimo;
    }
}
