import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exerc78 {
    // Usando Array ou Vetor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[10];
        
        System.out.println("Digite os nomes das 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();
        
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
        scanner.close();
    }
}

class Exerc78_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes das 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = nomes.contains(nomeBusca);

        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
        scanner.close();
    }
}