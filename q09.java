public class q09 {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        int quantidadeEncontrada = 0;
        int numeroAtual = 0;

        while (quantidadeEncontrada < 100) {
            if ((numeroAtual % 7 != 0) || (numeroAtual % 10 == 7)) {
                vetor[quantidadeEncontrada] = numeroAtual;
                quantidadeEncontrada++;
            }
            numeroAtual++;
        }

        System.out.println("Os 100 primeiros números gerados:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vetor[i] + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
    }
}
