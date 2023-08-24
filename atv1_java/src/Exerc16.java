import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a quantidade de maçãs que deseja comprar: ");
        int qntdMacas = scanner.nextInt();

        if (qntdMacas < 12) {
            double total =  qntdMacas * 1.30;
            System.out.println("Total a pagar: " + total);
        } else {
            double total1 = qntdMacas * 1.00;
            System.out.println("Total a pagar: " + total1);
        }
        scanner.close();
    }
}