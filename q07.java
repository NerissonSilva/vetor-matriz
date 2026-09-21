import java.util.Scanner;

public class q07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] v1 = new int[20];
        int[] v2 = new int[20];
        int[] v_resultado = new int[40];

        
        System.out.println("--- Leitura do Primeiro Vetor (20 elementos) ---");

        for (int i = 0; i < 20; i++) {
            System.out.print("V1[" + i + "]: ");
            v1[i] = scanner.nextInt();
        }

        
        System.out.println("\n--- Leitura do Segundo Vetor (20 elementos) ---");

        for (int i = 0; i < 20; i++) {
            System.out.print("V2[" + i + "]: ");
            v2[i] = scanner.nextInt();
        }

    
        for (int i = 0; i < 20; i++) {

            v_resultado[2 * i] = v1[i];

            v_resultado[(2 * i) + 1] = v2[i];
        }

        
        System.out.println("\n--- Vetor Resultante Intercalado ---");

        for (int i = 0; i < 40; i++) {
            System.out.print(v_resultado[i] + " ");
        }

        System.out.println();

        scanner.close();
    }
}
 
