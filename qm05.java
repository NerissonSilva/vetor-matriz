import java.util.Scanner;

public class qm05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        
        System.out.print("Digite o valor X a ser buscado: ");
        int x = input.nextInt();
        
        boolean encontrado = false;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Valor encontrado na Linha " + i + ", Coluna " + j);
                    encontrado = true;
                    break; 
                }
            }
            if (encontrado) break;
        }
        
        if (!encontrado) {
            System.out.println("não encontrado");
        }
    }
}
