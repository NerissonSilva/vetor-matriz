import java.util.Scanner;

public class q02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[6];

        
        System.out.println("Digite 6 valores inteiros:");

        for (int i = 0; i < 6; i++) {
            valores[i] = scanner.nextInt();
        }

        
        System.out.println("Valores inseridos:");

        for (int i = 0; i < 6; i++) {
            System.out.print(valores[i] + " ");
        }

        scanner.close();
    }
}
