import java.util.Scanner;

public class qm13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[][] teatro = new int[10][10];
        
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j] = -1;
            }
        }
        
        System.out.println("--- SISTEMA DE VENDAS DE INGRESSOS DO TEATRO ---");
        System.out.print("Digite o número de tentativas de compra (N): ");
        int N = scanner.nextInt();
        
        
        for (int tentativa = 1; tentativa <= N; tentativa++) {
            System.out.println("\n--- Tentativa " + tentativa + " de " + N + " ---");
            
            System.out.print("Digite o número da fileira (1 a 10): ");
            int fileiraUsuario = scanner.nextInt();
            
            System.out.print("Digite o número da poltrona (1 a 10): ");
            int cadeiraUsuario = scanner.nextInt();
            
            
            int f = fileiraUsuario - 1;
            int c = cadeiraUsuario - 1;
            
        
            if (f < 0 || f > 9 || c < 0 || c > 9) {
                System.out.println("Erro: Fileira ou poltrona inválida! Escolha valores entre 1 e 10.");
                continue;
            }
            
    
            if (teatro[f][c] == -1) {
                teatro[f][c] = 1; 
                System.out.println("Ingresso vendido com sucesso!");
            } else {
                System.out.println("Poltrona já foi vendida.");
            }
        }
        
        System.out.println("\n--- Sessão de Vendas Finalizada ---");
        scanner.close();
    }
}