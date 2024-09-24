import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Int op, estoqueNovo, quantVenda;
        double precoNovo;
        string nomeP;
        notebook = new produtos(notebook, acer, 2.000, 01, 10);

        System.out.println("Qual serviço deseja realizar:");
        System.out.println("1 -> Atualizar preços\n 2 -> Atualizar estoque\n 3 -> Venda de produtos");
        op = scanner.nextLine();

        switch (op) {
            case 1:
                System.out.println("Insira o novo valor:");
                precoNovo = scanner.nextDouble();
                scanner.next();
                atualiPreco();
                break;

            case 2:
                System.out.println("Insira o novo estoque:");
                estoqueNovo = scanner.nextInt();
                controlEstoque();
                break;

            case 3:
                System.out.println("Insira o nome do produto:");
                nomeP = scanner.nextLine();
                System.out.println("Informe a quantidade:");
                quantVenda = scanner.nextInt();
                System.out.println((nomeP).nome + venda());
                break;
        
            default:
                break;
        }

    }
}
