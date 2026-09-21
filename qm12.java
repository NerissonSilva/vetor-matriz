import java.util.Scanner;

public class qm12 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] A = lerMatriz("A");
        double[][] B = lerMatriz("B");
        char opcao;

        do {
            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("a. Somar as duas matrizes");
            System.out.println("b. Subtrair a primeira matriz da segunda (B - A)");
            System.out.println("c. Adicionar uma constante às duas matrizes");
            System.out.println("d. Imprimir as matrizes");
            System.out.println("s. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.next().toLowerCase().charAt(0);

            switch (opcao) {
                case 'a':
                    double[][] soma = new double[2][2];
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            soma[i][j] = A[i][j] + B[i][j];
                        }
                    }
                    imprimirMatriz(soma, "Resultado da Soma (A + B)");
                    break;

                case 'b':
                    double[][] subtracao = new double[2][2];
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            subtracao[i][j] = B[i][j] - A[i][j];
                        }
                    }
                    imprimirMatriz(subtracao, "Resultado da Subtração (B - A)");
                    break;

                case 'c':
                    System.out.print("Digite o valor da constante: ");
                    double constante = scanner.nextDouble();
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            A[i][j] += constante;
                            B[i][j] += constante;
                        }
                    }
                    System.out.println("Constante adicionada com sucesso!");
                    break;

                case 'd':
                    imprimirMatriz(A, "A");
                    imprimirMatriz(B, "B");
                    break;

                case 's':
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 's');
    }

    private static double[][] lerMatriz(String nome) {
        double[][] matriz = new double[2][2];
        System.out.println("\nDigite os elementos da matriz " + nome + " (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        return matriz;
    }

    private static void imprimirMatriz(double[][] matriz, String nome) {
        System.out.println("\nMatriz " + nome + ":");
        for (int i = 0; i < 2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 2; j++) {
                System.out.print(String.format("%.2f", matriz[i][j]) + " ");
            }
            System.out.println("]");
        }
    }
}