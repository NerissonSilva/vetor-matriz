import java.util.Scanner;

public class q06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[20];
        int[] idades = new int[20];

        int somaIdades = 0;

        
        for (int i = 0; i < 20; i++) {

            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = scanner.nextInt();

            scanner.nextLine(); 

            somaIdades += idades[i];
        }

        
        double media = (double) somaIdades / 20;

        System.out.printf("\nA idade média do grupo é: %.2f anos\n", media);

        
        System.out.println("Pessoas com idade acima da média:");

        for (int i = 0; i < 20; i++) {

            if (idades[i] > media) {
                System.out.println("- " + nomes[i] + " (" + idades[i] + " anos)");
            }
        }

        scanner.close();
    }
}
