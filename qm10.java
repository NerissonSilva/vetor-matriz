import java.util.Scanner;

public class qm10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] vetorSoma = new int[3];
        
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        
        
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            vetorSoma[j] = somaColuna;
        }
        
        System.out.print("\nVetor resultante (soma das colunas): [ ");
        for (int soma : vetorSoma) {
            System.out.print(soma + " ");
        }
        System.out.println("]");
    }
}