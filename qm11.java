import java.util.Scanner;

public class qm11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double[][] matrizAlunos = new double[5][4];
        
        double maiorNotaFinal = -1.0;
        int matriculaMaiorNota = 0;
        double somaNotasFinais = 0.0;
        
        System.out.println("--- Cadastro de Alunos e Notas ---");
    
    
        for (int i = 0; i < 5; i++) {
            System.out.println("\nDigite os dados do " + (i + 1) + "º aluno:");
            
            System.out.print("Número de matrícula (inteiro): ");
            int matricula = scanner.nextInt();
            
            System.out.print("Média das provas: ");
            double mediaProvas = scanner.nextDouble();
            
            System.out.print("Média dos trabalhos: ");
            double mediaTrabalhos = scanner.nextDouble();
            
        
            double notaFinal = mediaProvas + mediaTrabalhos;
            
        
            matrizAlunos[i][0] = matricula;
            matrizAlunos[i][1] = mediaProvas;
            matrizAlunos[i][2] = mediaTrabalhos;
            matrizAlunos[i][3] = notaFinal;
            
        
            somaNotasFinais += notaFinal;
            
    
            if (notaFinal > maiorNotaFinal) {
                maiorNotaFinal = notaFinal;
                matriculaMaiorNota = matricula;
            }
        }
        

        double mediaTurma = somaNotasFinais / 5;
        
    
        System.out.println("\n==============================================");
        System.out.println("Matrícula do aluno com maior nota final: " + matriculaMaiorNota + " (Nota: " + String.format("%.2f", maiorNotaFinal) + ")");
        System.out.println("Média aritmética das notas finais da turma: " + String.format("%.2f", mediaTurma));
        System.out.println("==============================================");
        
        scanner.close();
    }
}