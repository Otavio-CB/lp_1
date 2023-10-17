public class Main {
    public static void main(String[] args) {
        // Teste de idade negativa
        try {
            int idade = -10;
            if (idade < 0) {
                throw new IdadeNegativaException("Idade não pode ser negativa.");
            }
        } catch (IdadeNegativaException e) {
            System.err.println("Erro de Idade Negativa: " + e.getMessage());
        }

        // Teste de divisão por zero
        try {
            int numerador = 10;
            int denominador = 0;
            if (denominador == 0) {
                throw new DivisaoPorZeroException("Divisão por zero não é permitida.");
            }
            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.err.println("Erro de Divisão por Zero: " + e.getMessage());
        }

        // Teste de operação inválida em conta bancária
        try {
            double saldo = 1000;
            double valorSaque = 1200;
            if (valorSaque > saldo) {
                throw new OperacaoInvalidaException("Saldo insuficiente para realizar o saque.");
            }
        } catch (OperacaoInvalidaException e) {
            System.err.println("Erro de Operação Inválida: " + e.getMessage());
        }
    }
}
