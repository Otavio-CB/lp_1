import java.util.ArrayList;
import java.util.List;

public class Exerc83 {
    public static void main(String[] args) {
        int[] numeros = {10, 5, 8, 12, 6, 15, 20, 7, 9, 18, 13, 14, 25, 22, 17, 21, 19, 11, 16, 23};

        System.out.print("Números na ordem inversa: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}

class Exerc83_2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(8);
        numeros.add(12);
        numeros.add(6);
        numeros.add(15);
        numeros.add(20);
        numeros.add(7);
        numeros.add(9);
        numeros.add(18);
        numeros.add(13);
        numeros.add(14);
        numeros.add(25);
        numeros.add(22);
        numeros.add(17);
        numeros.add(21);
        numeros.add(19);
        numeros.add(11);
        numeros.add(16);
        numeros.add(23);

        System.out.print("Números na ordem inversa: ");
        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.print(numeros.get(i) + " ");
        }
    }
}