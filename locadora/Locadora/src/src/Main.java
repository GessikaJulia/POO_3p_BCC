import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locadora locadora = new Locadora("AutoLoc", "Rua Rio grande do sul", "996478");
        
        int opcaoInicial;
        int opcaoPessoa;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite uma opção");
            System.out.println("1 - Cadastrar um novo veículo");
            System.out.println("2 - Cadastrar um novo cliente");
            System.out.println("3 - Realizar empréstimo de um veículo");
            System.out.println("4 - Renovar empréstimo de um veículo");
            System.out.println("5 - Finalizar empréstimo de um veículo");
            System.out.println("0 - Sair");
            opcaoInicial = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoInicial) {
                case 1:
                    locadora.cadastrarVeiculo(scanner);
                    break;
                case 2:
                    System.out.println("Pessoa física ou Jurídica?\nDigite uma opção:\n1 - Pessoa física\n2 - Pessoa Jurídica (Empresa)");

                    opcaoPessoa = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoPessoa) {
                        case 1:
                            locadora.cadastrarPessoaFisica(scanner);
                            break;
                        case 2:
                            locadora.cadastrarPessoaJuridica(scanner);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 3:
                    locadora.realizarEmprestimo(scanner);
                    break;
                case 4:
                    locadora.renovarEmprestimo(scanner);
                    break;
                case 5:
                    locadora.finalizarEmprestimo(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcaoInicial != 0);

        scanner.close();
    }


}