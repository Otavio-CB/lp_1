import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exerc79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[20];
        double soma = 0;

        // Leitura das notas
        System.out.println("Digite as notas dos 20 alunos:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Calcula a média da turma
        double media = soma / 20;

        // Conta quantos alunos obtiveram nota acima da média
        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }

        // Exibe a média da turma e o resultado da contagem
        System.out.println("Média da turma: " + media);
        System.out.println("Alunos com nota acima da média: " + acimaMedia);
        scanner.close();
    }
}

class Exerc79_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> notas = new ArrayList<>();
        double soma = 0;

        // Leitura das notas
        System.out.println("Digite as notas dos 20 alunos:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            soma += nota;
        }

        // Calcula a média da turma
        double media = soma / 20;

        // Conta quantos alunos obtiveram nota acima da média
        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }

        // Exibe a média da turma e o resultado da contagem
        System.out.println("Média da turma: " + media);
        System.out.println("Alunos com nota acima da média: " + acimaMedia);
        scanner.close();
    }
}