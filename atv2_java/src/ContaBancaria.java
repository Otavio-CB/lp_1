    public class ContaBancaria {
        private int numeroConta;
        private String titular;
        private double saldo;

        public ContaBancaria(int numeroConta, String titular, double saldoIncial) {
            this.numeroConta = numeroConta;
            this.titular = titular;
            this.saldo = saldoIncial;
        }

        public void exibirSaldo() {
            System.out.println("Titular: " + titular);
            System.out.println("Número da Conta: " + numeroConta);
            System.out.println("Saldo: $" + saldo);
        }
        public void depositar(double valor) {
            saldo += valor;
        } 
        public void pagar(double valor) {
            saldo -= valor;
        }

        public int getNumeroConta() {
            return numeroConta;
        }
        public String getTitular() {
            return titular;
        }
        public double getSaldo() {
            return saldo;
        }
    }