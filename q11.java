import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        double[] v = new double[n];
        double soma = 0.0, media, somaDesvios = 0.0, desvioPadrao;

        System.out.println("Digite os 10 números do vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("V[" + i + "]: ");
            v[i] = scanner.nextDouble();
            soma += v[i];
        }

        media = soma / n;

        for (int i = 0; i < n; i++) {
            somaDesvios += Math.pow(v[i] - media, 2);
        }

        
        desvioPadrao = Math.sqrt((1.0 / (n - 1)) * somaDesvios);

        System.out.printf("\nMédia (m) = %.4f\n", media);
        System.out.printf("Desvio Padrão = %.4f\n", desvioPadrao);
        scanner.close();
    }
}