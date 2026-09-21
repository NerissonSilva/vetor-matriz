import java.util.Scanner;

public class q05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[20];

        System.out.println("Digite 20 números:");

        
        for (int i = 0; i < 20; i++) {
            valores[i] = scanner.nextInt();
        }

        System.out.println("\nElementos com conteúdo ímpar:");

        for (int i = 0; i < 20; i++) {
            if (valores[i] % 2 != 0) {
                System.out.print(valores[i] + " ");
            }
        }

    
        System.out.println("\n\nElementos das posições pares (índices 0, 2, 4...):");

        for (int i = 0; i < 20; i += 2) {
            System.out.print(valores[i] + " ");
        }

        scanner.close();
    }
}
