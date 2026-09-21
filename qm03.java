public class qm03 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
            }
        }

        
        System.out.println("Matriz Gerada (Produto Linha x Coluna):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
