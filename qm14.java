import java.util.Scanner;
import java.util.ArrayList;

public class qm14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
        
            String nomeAluno = scanner.nextLine();

            
            ArrayList<Integer> diasFaltas = new ArrayList<>();

        
            for (int dia = 1; dia <= 30; dia++) {
                if (scanner.hasNextLine()) {
                    String presenca = scanner.nextLine().trim();
                    
                
                    if (presenca.equals("F")) {
                        diasFaltas.add(dia);
                    }
                }
            }

    
            if (diasFaltas.size() > 10) {
                System.out.print(nomeAluno + " - dias:");
                for (int diaFalta : diasFaltas) {
                    System.out.print(" " + diaFalta);
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}