import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int quantidade = 0;

        System.out.println("Digite 10 números DIFERENTES:");

        while (quantidade < 10) {
            System.out.print("Digite o número para a posição [" + quantidade + "]: ");
            int numeroDigitado = scanner.nextInt();

            boolean repetido = false;
            for (int i = 0; i < quantidade; i++) {
                if (vetor[i] == numeroDigitado) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                vetor[quantidade] = numeroDigitado;
                quantidade++;
            } else {
                System.out.println("Erro: O número " + numeroDigitado + " já foi digitado. Tente outro.");
            }
        }

        System.out.println("\nVetor final preenchido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}