import java.util.Random;

public class qm08 {

    public static void main(String[] args) {

        int[][] original = new int[4][4];
        int[][] transformada = new int[4][4];

        Random random = new Random();

    
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                original[i][j] = random.nextInt(20) + 1;

            
                if (j > i) {
                    transformada[i][j] = 0;
                } else {
                    transformada[i][j] = original[i][j];
                }
            }
        }


        System.out.println("Matriz Original:");

        imprimirMatriz(original);

    
        System.out.println("\nMatriz Transformada (Triangular Inferior):");

        imprimirMatriz(transformada);
    }


    public static void imprimirMatriz(int[][] m) {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(m[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
