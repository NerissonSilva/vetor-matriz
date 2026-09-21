import java.util.Scanner;

public class qm04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        
    
        int maior = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        
        System.out.println("\nMatriz Digitada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
            System.out.println();
        }
        
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Localização: Linha " + linhaMaior + ", Coluna " + colunaMaior);
    }
}
