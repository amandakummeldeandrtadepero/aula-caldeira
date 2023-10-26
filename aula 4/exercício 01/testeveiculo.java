package exercicios;
import java.util.Scanner;

public class TesteVeiculo {

    public static void main(String[] args) {
    	System.out.println("Seja bem-vindo ao seu consultor de veículo. (Obs: só temos duas opções, uma de carro e uma de moto.)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um veículo: (1) Carro, (2) Moto");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            Carro meuCarro = new Carro("Fiat", "Argo", 2015);

            //distância
            System.out.print("Digite a distância em quilômetros: ");
            int distanciaCarro = scanner.nextInt();

            double custoCarro = meuCarro.calcularCustoViagem(distanciaCarro);
            System.out.println("Custo da viagem de carro: R$" + custoCarro);

            //getter carro
            System.out.println("Marca do Carro: " + meuCarro.getMarca());
            System.out.println("Modelo do Carro: " + meuCarro.getModelo());
            System.out.println("Ano do Carro: " + meuCarro.getAno());
        } else if (escolha == 2) {
            Moto minhaMoto = new Moto("Honda", "Titan", 2020);

            // Solicitar a distância nmo Scanner (getter)
            System.out.print("Digite a distância em quilômetros: ");
            int distanciaMoto = scanner.nextInt();

            double custoMoto = minhaMoto.calcularCustoViagem(distanciaMoto);
            System.out.println("Custo da viagem de moto: R$" + custoMoto);

            //moto infos
            System.out.println("Marca da Moto: " + minhaMoto.getMarca());
            System.out.println("Modelo da Moto: " + minhaMoto.getModelo());
            System.out.println("Ano da Moto: " + minhaMoto.getAno());
        } else {
            System.out.println("Escolha inválida. Escolha 1 para Carro ou 2 para Moto.");
        }

        // LEMBRAR de sempre fechar scanner
        scanner.close();
    }
}
