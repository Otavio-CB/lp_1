public class Teste {
    public static void main(String[] args) {
        System.out.println("==== Teste da Classe Pessoa ====");
        Pessoa pessoa = new Pessoa("João", 25, 'M');
        pessoa.exibirInformacoes();
        System.out.println("É adulto? " + (pessoa.isAdulto() ? "Sim" : "Não"));
        pessoa.cumprimentar();
        System.out.println();

        System.out.println("==== Teste da Classe Moto ====");
        Moto moto = new Moto("Vermelha", "Suzuki");
        moto.acelerar(50);
        moto.mostrarStatus();
        moto.desligar();
        System.out.println();

        System.out.println("==== Teste da Classe Livro ====");
        Livro livro = new Livro(2022, "Autor XYZ", "Título do Livro");
        livro.emprestar();
        livro.mostrarStatus();
        livro.devolver();
        System.out.println();

        System.out.println("==== Teste da Classe ContaBancaria ====");
        ContaBancaria conta = new ContaBancaria(12345, "Fulano", 1000.0);
        conta.depositar(500);
        conta.exibirSaldo();
        conta.pagar(200);
        conta.exibirSaldo();
        System.out.println();

        System.out.println("==== Teste da Classe Aluno ====");
        Aluno aluno = new Aluno(123, "Alice", "Universidade ABC");
        aluno.estudar();
        aluno.apresntar();
        aluno.fazerProva();
        System.out.println();

        System.out.println("==== Teste da Classe Celular ====");
        Celular celular = new Celular("Samsung", "Galaxy S20", 64);
        celular.ligar();
        celular.exibirDetalhes();
        celular.enviarMensagem();
        System.out.println();

        System.out.println("==== Teste da Classe Animal ====");
        Animal animal = new Animal("Rex", "Cachorro", 3);
        animal.emitirSom();
        animal.comer();
        animal.exibirInformacoes();
        System.out.println();

        System.out.println("==== Teste da Classe Filme ====");
        Filme filme = new Filme("Aventura Espacial", "Diretor XYZ", 120);
        filme.reproduzir();
        filme.exibirDetalhes();
        System.out.println();
        
        System.out.println("==== Teste da Classe Eletronico ====");
        Eletronico eletronico = new Eletronico("Smart TV", "Eletrônicos", 1500.0);
        eletronico.ligar();
        eletronico.exibirDetalhes();
        System.out.println();

        System.out.println("==== Teste da Classe Restaurante ====");
        Restaurante restaurante = new Restaurante("Restaurante do Chef", "Gourmet", 50);
        restaurante.abrir();
        restaurante.exibirDetalhes();
        restaurante.fechar();
    }
}
