import java.util.ArrayList;
import java.util.List;

public class Exerc90 {
    public static void main(String[] args) {
        int[] vetor = {5, 7, 3, 9, 5, 12, 3, 5, 7, 8, 5, 7, 9, 12, 5, 5, 7, 3, 9, 5, 12, 3, 5, 7, 8, 5, 7, 9, 12, 5};

        int numeroProcurado = 5;
        int contOcorrencias = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroProcurado) {
                contOcorrencias++;
            }
        }

        System.out.println("O número " + numeroProcurado + " aparece " + contOcorrencias + " vezes no vetor.");
    }
}

class Exerc90_2 {
    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<>();
        vetor.add(5);
        vetor.add(7);
        vetor.add(3);
        vetor.add(9);
        vetor.add(5);
        vetor.add(12);
        vetor.add(3);
        vetor.add(5);
        vetor.add(7);
        vetor.add(8);
        vetor.add(5);
        vetor.add(7);
        vetor.add(9);
        vetor.add(12);
        vetor.add(5);
        vetor.add(5);
        vetor.add(7);
        vetor.add(3);
        vetor.add(9);
        vetor.add(5);
        vetor.add(12);
        vetor.add(3);
        vetor.add(5);
        vetor.add(7);
        vetor.add(8);
        vetor.add(5);
        vetor.add(7);
        vetor.add(9);
        vetor.add(12);
        vetor.add(5);

        int numeroProcurado = 5;
        int contOcorrencias = 0;

        for (int num : vetor) {
            if (num == numeroProcurado) {
                contOcorrencias++;
            }
        }

        System.out.println("O número " + numeroProcurado + " aparece " + contOcorrencias + " vezes no vetor.");
    }
}