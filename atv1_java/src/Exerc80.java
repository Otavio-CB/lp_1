import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exerc80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorQ = new int[20];

        System.out.println("Digite 20 números positivos para preencher o vetor:");

        for (int i = 0; i < 20; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero > 0) {
                    vetorQ[i] = numero;
                    break;
                } else {
                    System.out.println("Digite apenas números positivos.");
                }
            }
        }

        int maiorElemento = vetorQ[0];
        int posicaoMaiorElemento = 0;

        for (int i = 1; i < 20; i++) {
            if (vetorQ[i] > maiorElemento) {
                maiorElemento = vetorQ[i];
                posicaoMaiorElemento = i;
            }
        }

        System.out.println("Maior elemento: " + maiorElemento);
        System.out.println("Posição no vetor: " + posicaoMaiorElemento);
        scanner.close();
    }
}

class Exerc80_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> vetorQ = new ArrayList<>();

        System.out.println("Digite 20 números positivos para preencher o vetor:");

        for (int i = 0; i < 20; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero > 0) {
                    vetorQ.add(numero);
                    break;
                } else {
                    System.out.println("Digite apenas números positivos.");
                }
            }
        }

        int maiorElemento = vetorQ.get(0);
        int posicaoMaiorElemento = 0;

        for (int i = 1; i < vetorQ.size(); i++) {
            if (vetorQ.get(i) > maiorElemento) {
                maiorElemento = vetorQ.get(i);
                posicaoMaiorElemento = i;
            }
        }

        System.out.println("Maior elemento: " + maiorElemento);
        System.out.println("Posição no vetor: " + posicaoMaiorElemento);
        scanner.close();
    }
}