    import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Por favor, digite um número positivo.");
            return;
        }

        long[][] matriz = new long[n][n];

        for (int i = 0; i < n; i++) {

            matriz[i][0] = 1;
            matriz[i][i] = 1;
            
        
            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i-1][j-1] + matriz[i-1][j];
            }

        
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}