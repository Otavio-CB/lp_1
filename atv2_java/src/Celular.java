public class Celular {
    private String marca;
    private String modelo;
    private int memoria;

    public Celular(String marca, String modelo, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memória: " + memoria);
    }
    public void ligar() {
        System.out.println("Ligando o celular");
    }
    public void enviarMensagem() {
        System.out.println("Enviando mensagem para algum desconhecido");
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getMemoria() {
        return memoria;
    }
}
