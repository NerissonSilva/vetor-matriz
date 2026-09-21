import java.util.Scanner;

public class qm07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        int somaAcimaDP = 0;
        int somaAbaixoDP = 0;
        int somaDP = 0;
        int somaDS = 0;

    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

    
                if (i == j) {
                    somaDP += matriz[i][j];
                }

        
                if (j > i) {
                    somaAcimaDP += matriz[i][j];
                }

    
                if (i > j) {
                    somaAbaixoDP += matriz[i][j];
                }

    
                if (i + j == 2) {
                    somaDS += matriz[i][j];
                }
            }
        }

        System.out.println("\nResultados:");

        System.out.println("Soma acima da diagonal principal: " + somaAcimaDP);

        System.out.println("Soma abaixo da diagonal principal: " + somaAbaixoDP);

        System.out.println("Soma da diagonal principal: " + somaDP);

        System.out.println("Soma da diagonal secundária: " + somaDS);

        input.close();
    }
}
