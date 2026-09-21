import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        System.out.println("Preencha o vetor X (5 elementos):");
        for (int i = 0; i < 5; i++) x[i] = scanner.nextInt();

        System.out.println("Preencha o vetor Y (5 elementos):");
        for (int i = 0; i < 5; i++) y[i] = scanner.nextInt();

        
        System.out.print("\na. Soma entre X e Y: ");
        for (int i = 0; i < 5; i++) System.out.print((x[i] + y[i]) + " ");
        
        System.out.print("\nb. Produto entre X e Y: ");
        for (int i = 0; i < 5; i++) System.out.print((x[i] * y[i]) + " ");

        
        System.out.print("\nc. Diferença (X - Y): ");
        for (int i = 0; i < 5; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) { encontrado = true; break; }
            }
            if (!encontrado) System.out.print(x[i] + " ");
        }

    
        System.out.print("\nd. Intersecção: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) { System.out.print(x[i] + " "); break; }
            }
        }

        
        System.out.print("\ne. União: ");
        for (int i = 0; i < 5; i++) System.out.print(x[i] + " ");
        for (int i = 0; i < 5; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 5; j++) {
                if (y[i] == x[j]) { encontrado = true; break; }
            }
            if (!encontrado) System.out.print(y[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}