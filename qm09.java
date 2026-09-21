import java.util.Random;
import java.util.HashSet;

public class qm09 {
    public static void main(String[] args) {
        int[][] cartela = new int[5][5];
        Random random = new Random();
        HashSet<Integer> numerosUsados = new HashSet<>();

    
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numAleatorio;
                do {
                    numAleatorio = random.nextInt(100); // Gera de 0 a 99
                } while (numerosUsados.contains(numAleatorio)); // Refaz se já existir

                cartela[i][j] = numAleatorio;
                numerosUsados.add(numAleatorio);
            }
        }

    
        System.out.println("===== CARTELA DE BINGO =====");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[%02d] ", cartela[i][j]);
            }
            System.out.println();
        }
    }
}
