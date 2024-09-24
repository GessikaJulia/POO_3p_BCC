import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeira cor:");
        String primeiraCor = scanner.nextLine();

        System.out.println("Segunda cor:");
        String segundaCor = scanner.nextLine();

        System.out.println("Terceira cor:");
        String terceiraCor = scanner.nextLine();
        terceiraCor = null;

        scanner.close();

        System.out.println("Resultado: " + valorCor(primeiraCor) + valorCor(segundaCor));
    }

    public static int valorCor(String cor) {
        switch (cor) {
            case "preto":
                return 0;
            case "marrom":
                return 1;
            case "vermelho":
                return 2;
            case "laranja":
                return 3;
            case "amarelo":
                return 4;
            case "verde":
                return 5;
            case "azul":
                return 6;
            case "violeta":
                return 7;
            case "cinza":
                return 8;
            case "branco":
                return 9;
            default:
                System.out.println("Cor desconhecida");
                return -1;
        }
    }
}
