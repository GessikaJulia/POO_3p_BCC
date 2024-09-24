import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora {
    private String nomeLocadora;
    private String enderecoLocadora;
    private String telefoneLocadora;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private static List<Carro> veiculos = new ArrayList<>();
    private static List<Emprestimo> emprestimos = new ArrayList<>();


    public Locadora(String nomeLocadora, String enderecoLocadora, String telefoneLocadora) {
        this.nomeLocadora = nomeLocadora;
        this.enderecoLocadora = enderecoLocadora;
        this.telefoneLocadora = telefoneLocadora;
    }

    public static List<Carro> getVeiculos() {
        return veiculos;
    }

    public static void setVeiculos(List<Carro> veiculos) {
        Locadora.veiculos = veiculos;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public String getNomeLocadora() {
        return nomeLocadora;
    }

    public void setNomeLocadora(String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }

    public String getEnderecoLocadora() {
        return enderecoLocadora;
    }

    public void setEnderecoLocadora(String enderecoLocadora) {
        this.enderecoLocadora = enderecoLocadora;
    }

    public String getTelefoneLocadora() {
        return telefoneLocadora;
    }

    public void setTelefoneLocadora(String telefoneLocadora) {
        this.telefoneLocadora = telefoneLocadora;
    }

    public void cadastrarVeiculo(Scanner scanner) {
        System.out.println("Cadastrar Veículo:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Ano: ");
        String ano = scanner.nextLine();
        System.out.print("Valor de locação: ");
        double valorLocacao = scanner.nextDouble();
        System.out.print("Multa de renovação: ");
        double multaRenovacao = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Tipo de veículo (1 - Popular, 2 - SUV, 3 - Luxo): ");
        int tipoVeiculo = scanner.nextInt();
        scanner.nextLine();

        switch (tipoVeiculo) {
            case 1:
                System.out.print("Possui ar-condicionado? (true/false): ");
                boolean possuiArCondicionado = scanner.nextBoolean();
                veiculos.add(new Popular(marca, modelo, placa, ano, valorLocacao, multaRenovacao, possuiArCondicionado, 2));
                break;
            case 2:
                System.out.print("Tamanho do porta-malas: ");
                int tamanhoPortaMalas = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tipo de tração: ");
                String tipoTracao = scanner.nextLine();
                System.out.print("Tipo de combustível: ");
                String tipoCombustivel = scanner.nextLine();
                veiculos.add(new SUV(marca, modelo, placa, ano, valorLocacao, multaRenovacao, tamanhoPortaMalas, tipoTracao, tipoCombustivel, 1));
                break;
            case 3:
                System.out.print("Quantidade de airbags: ");
                int quantidadeAirbags = scanner.nextInt();
                System.out.print("Tamanho do porta-malas: ");
                int tamanhoPortaMalasLuxo = scanner.nextInt();
                System.out.print("Possui GPS? (true/false): ");
                boolean possuiGPS = scanner.nextBoolean();
                veiculos.add(new Luxo(marca, modelo, placa, ano, valorLocacao, multaRenovacao, quantidadeAirbags, tamanhoPortaMalasLuxo, possuiGPS, 3));
                break;
            default:
                System.out.println("Tipo de veículo inválido");
                break;
        }

        System.out.println("Veículo cadastrado com sucesso!");
    }


    public void cadastrarPessoaFisica(Scanner scanner) {
        System.out.println("Cadastrar Pessoa Física:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        clientes.add(new PessoaFisica(nome, telefone, endereco, cpf));
        System.out.println("Pessoa Física cadastrada com sucesso!");
    }

    public void cadastrarPessoaJuridica(Scanner scanner) {
        System.out.println("Cadastrar Pessoa Jurídica:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Nome do Representante: ");
        String nomeRepresentante = scanner.nextLine();

        clientes.add(new PessoaJuridica(nome, telefone, endereco, cnpj, nomeRepresentante));
        System.out.println("Pessoa Jurídica cadastrada com sucesso!");
    }

    public void realizarEmprestimo(Scanner scanner) {
        System.out.println("Realizar empréstimo:");
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = clientes.stream().filter(c -> c.getNome().equalsIgnoreCase(nomeCliente)).findFirst().orElse(null);

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.print("Placa do veículo: ");
        String placaCarro = scanner.nextLine();
        Carro carro = veiculos.stream().filter(v -> v.getPlacaCarro().equalsIgnoreCase(placaCarro) && v.isDisponivel()).findFirst().orElse(null);

        if (carro == null) {
            System.out.println("Veículo não encontrado ou indisponível.");
            return;
        }

        try {
            Emprestimo emprestimo = new Emprestimo(cliente, carro);
            emprestimos.add(emprestimo);
            carro.emprestar();
            System.out.println("Empréstimo realizado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao realizar empréstimo: " + e.getMessage());
        }
    }

    public void finalizarEmprestimo(Scanner scanner) {
        double multa = 0;


        System.out.println("Finalizar empréstimo:");
        System.out.print("Placa do veículo: ");
        String placaCarro = scanner.nextLine();
        Emprestimo variavelEmprestimo = null;
        for (Emprestimo e : emprestimos) {
            if (e.getCarro().getPlacaCarro().equalsIgnoreCase(placaCarro) && !e.getCarro().isDisponivel()) {
                variavelEmprestimo = e;
                break;
            }
        }
        if(variavelEmprestimo == null) {
            System.out.println("Empréstimo não encontrado.");
            return;
        }

        if(variavelEmprestimo.getCarro().getQtdRenovacaoGratuita() < variavelEmprestimo.getCarro().getRenovacoesFeitas()){
            multa = variavelEmprestimo.calcularMulta();
        }

        double valor = multa + variavelEmprestimo.getCarro().getValorLocacao();

        variavelEmprestimo.getCarro().devolver();
        emprestimos.remove(variavelEmprestimo);
        System.out.println("Empréstimo finalizado com sucesso!" + "\nValor Pago:" + valor);
    }

    public void renovarEmprestimo(Scanner scanner){
        System.out.println("Renovar empréstimo");
        System.out.print("Placa do veículo: ");
        String placaCarro = scanner.nextLine();
        Emprestimo resultado = null;
        for (Emprestimo e : emprestimos) {
            if (e.getCarro().getPlacaCarro().equalsIgnoreCase(placaCarro) && !e.getCarro().isDisponivel()) {
                resultado = e;
                break;
            }
        }
        if(resultado == null) {
            System.out.println("Empréstimo não encontrado.");
            return;
        }

        resultado.renovar();
        System.out.println("Empréstimo renovado com sucesso!");

    }
}


