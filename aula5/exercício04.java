package exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

class Compra {
    private String nome;
    private Date dataValidade;
    private double preco;

    public Compra(String nome, Date dataValidade, double preco) {
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(dataValidade);
        return nome + " (Validade: " + dataFormatada + ", Preço: R$" + preco + ")";
    }
}

public class exercicio4 {
    public static void main(String[] args) {
        ArrayList<Compra> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	   System.out.println("Olá, seja bem-vindo(a)!");
            System.out.println("***Lista de Compras J A V A ***");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Remover Item");
            System.out.println("3. Ver a Lista de Compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    System.out.print("Qual item você quer adicionar? ");
                    String nomeItem = scanner.nextLine();
                    System.out.print("Qual a data de validade (dd/MM/yyyy)? ");
                    String dataValidadeStr = scanner.nextLine();
                    System.out.print("Qual o preço do item? R$");
                    double precoItem = scanner.nextDouble();
                    scanner.nextLine(); 

                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Date dataValidade = dateFormat.parse(dataValidadeStr);

                        Compra compra = new Compra(nomeItem, dataValidade, precoItem);
                        listaDeCompras.add(compra);
                        System.out.println("Item adicionado à lista!");
                    } catch (Exception e) {
                        System.out.println("Ops, a data está em um formato errado. Use dd/MM/yyyy.");
                    }
                    break;
                case 2:
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista de compras está vazia.");
                    } else {
                        System.out.println("Itens na sua lista de compras:");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                        }
                        System.out.print("Qual número você quer remover? ");
                        int numeroItem = scanner.nextInt();
                        scanner.nextLine(); 

                        if (numeroItem >= 1 && numeroItem <= listaDeCompras.size()) {
                            listaDeCompras.remove(numeroItem - 1);
                            System.out.println("Item removido da lista!");
                        } else {
                            System.out.println("Número de item inválido.");
                        }
                    }
                    break;
                case 3:
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista de compras está vazia.");
                    } else {
                        System.out.println("Itens na sua lista de compras:");
                        for (Compra item : listaDeCompras) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Tchau! desculpa qualquer coisa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha uma das opções disponíveis.");
            }
        }
    }
}
