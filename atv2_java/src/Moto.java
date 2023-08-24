public class Moto {
    private double velocidadeAtual;
    private String cor;
    private String modelo;

 
    public Moto(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeAtual = 0;

    }
    public void mostrarStatus() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
    public void acelerar(double velocidade) {
        if (velocidade > 0) {
            velocidadeAtual += velocidade;
        }
    }
    public void desligar() {
        System.out.println("A moto está desligada.");
        velocidadeAtual = 0;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }
}
