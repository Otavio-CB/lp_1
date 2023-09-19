import java.util.ArrayList;
import java.util.List;

public class Exerc91 {
    public static void main(String[] args) {
        int[] vetor = {10, 15, 20, 25, 30, 35, 40, 45, 50, 10, 55, 25, 30, 40, 45, 35, 50, 55, 15, 20};

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println("O número " + vetor[i] + " está repetido nas posições " + i + " e " + j + ".");
                }
            }
        }
    }
}

class Exerc91_2 {
    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<>();
        vetor.add(10);
        vetor.add(15);
        vetor.add(20);
        vetor.add(25);
        vetor.add(30);
        vetor.add(35);
        vetor.add(40);
        vetor.add(45);
        vetor.add(50);
        vetor.add(10);
        vetor.add(55);
        vetor.add(25);
        vetor.add(30);
        vetor.add(40);
        vetor.add(45);
        vetor.add(35);
        vetor.add(50);
        vetor.add(55);
        vetor.add(15);
        vetor.add(20);

        for (int i = 0; i < vetor.size(); i++) {
            for (int j = i + 1; j < vetor.size(); j++) {
                if (vetor.get(i).equals(vetor.get(j))) {
                    System.out.println("O número " + vetor.get(i) + " está repetido nas posições " + i + " e " + j + ".");
                }
            }
        }
    }
}