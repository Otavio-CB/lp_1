import java.util.ArrayList;
import java.util.List;

public class Exerc89 {
    public static void main(String[] args) {
        int[] vetorV1 = {10, 5, 8, 12, 6, 15, 20, 7, 9, 18, 13, 14, 25, 22, 17};
        int[] vetorV2 = {10, 4, 8, 12, 6, 15, 20, 7, 9, 18, 11, 14, 25, 22, 17};

        int contNumerosIguais = 0;

        for (int i = 0; i < vetorV1.length; i++) {
            if (vetorV1[i] == vetorV2[i]) {
                contNumerosIguais++;
            }
        }

        System.out.println("Quantidade de números iguais nas mesmas posições: " + contNumerosIguais);
    }
}

class Exerc89_2 {
    public static void main(String[] args) {
        List<Integer> vetorV1 = new ArrayList<>();
        vetorV1.add(10);
        vetorV1.add(5);
        vetorV1.add(8);
        vetorV1.add(12);
        vetorV1.add(6);
        vetorV1.add(15);
        vetorV1.add(20);
        vetorV1.add(7);
        vetorV1.add(9);
        vetorV1.add(18);
        vetorV1.add(13);
        vetorV1.add(14);
        vetorV1.add(25);
        vetorV1.add(22);
        vetorV1.add(17);

        List<Integer> vetorV2 = new ArrayList<>();
        vetorV2.add(10);
        vetorV2.add(4);
        vetorV2.add(8);
        vetorV2.add(12);
        vetorV2.add(6);
        vetorV2.add(15);
        vetorV2.add(20);
        vetorV2.add(7);
        vetorV2.add(9);
        vetorV2.add(18);
        vetorV2.add(11);
        vetorV2.add(14);
        vetorV2.add(25);
        vetorV2.add(22);
        vetorV2.add(17);

        int contNumerosIguais = 0;

        for (int i = 0; i < vetorV1.size(); i++) {
            if (vetorV1.get(i).equals(vetorV2.get(i))) {
                contNumerosIguais++;
            }
        }

        System.out.println("Quantidade de números iguais nas mesmas posições: " + contNumerosIguais);
    }
}