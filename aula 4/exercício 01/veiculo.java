package exercicios;
 abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    // (construtor) oque vai ser o que 
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método abstrato para calcular o custo da viagem com base na distância q o usuario der
    public abstract double calcularCustoViagem(int distancia);

    // Getters e setters (outras funções conforme necessário)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}

// Classe concreta Carro que herda de Veiculo
class Carro extends Veiculo {
    // Construtor
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Implementação do método abstrato
    @Override
    public double calcularCustoViagem(int distancia) {
        // Custo fixo de R$0.20 por quilômetro
        return 0.20 * distancia;
    }
}

// Classe concreta Moto que herda de Veiculo
 class Moto extends Veiculo {
    // Construtor
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Implementação do método abstrato
    @Override
    public double calcularCustoViagem(int distancia) {
        // Custo fixo de R$0.15 por quilômetro
        return 0.15 * distancia;
    }
}
