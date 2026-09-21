import java.util.Scanner;

public class q03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 valores inteiros:");

        
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        
        System.out.println("Elementos com conteúdo par:");

        for (int i = 0; i < 10; i++) {

            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        scanner.close();
    }
}
