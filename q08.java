import java.util.Scanner;

public class q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] primeiro = new int[10];
        int[] segundo = new int[10];
        int[] vFinal = new int[20];

        System.out.println("--- Digite os 10 valores do PRIMEIRO vetor ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Primeiro[" + i + "]: ");
            primeiro[i] = scanner.nextInt();
        }

        System.out.println("\n--- Digite os 10 valores do SEGUNDO vetor ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Segundo[" + i + "]: ");
            segundo[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            vFinal[2 * i] = primeiro[i];
            vFinal[(2 * i) + 1] = segundo[i];
        }

        System.out.println("\n--- Vetor Final ---");
        for (int i = 0; i < 20; i++) {
            System.out.print(vFinal[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
