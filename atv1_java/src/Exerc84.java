import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exerc84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorSoma = new int[tamanho];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        System.out.print("Vetor Soma: ");
        for (int num : vetorSoma) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

class Exerc84_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        List<Integer> vetorA = new ArrayList<>();
        List<Integer> vetorB = new ArrayList<>();
        List<Integer> vetorSoma = new ArrayList<>();

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA.add(scanner.nextInt());
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB.add(scanner.nextInt());
        }

        for (int i = 0; i < tamanho; i++) {
            vetorSoma.add(vetorA.get(i) + vetorB.get(i));
        }

        System.out.print("Vetor Soma: ");
        for (int num : vetorSoma) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}