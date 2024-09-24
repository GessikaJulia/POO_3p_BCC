import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fita1, fita2;
        int erros=0;

        System.out.println("Qual a primeira sequencia de DNA?");
        fita1 = scanner.nextLine();
        System.out.println("Qual a segunda sequencia de DNA?");
        fita2 = scanner.nextLine();

        char[] arrayFita1 = fita1.toCharArray();
        char[] arrayFita2 = fita2.toCharArray();

        for(int i=0; i < arrayFita1.length; i++){
           if(arrayFita1[i] != arrayFita2[i]){
               erros++;
           }
        }
        System.out.println("A distância de Hamming é "+erros);
    }
}