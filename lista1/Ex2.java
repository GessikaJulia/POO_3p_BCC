import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira um numero:");
        int num = scanner.nextInt();

        int maior = num;
        int menor = num;
        int soma = num;
        int contador = 1;

        num = scanner.nextInt();
        while (num != -1) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            soma = soma + num;
            contador++;

            num = scanner.nextInt();
        }

        double media = (double) soma / contador;

        System.out.println("Quantidade de numeros: " + contador);
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Media dos numeros: " + media);
        
        scanner.close();
    }
}
