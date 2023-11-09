package exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio03 {
    private String titulo;
    private String data;
    private String descricao;

    public exercicio03(String titulo, String data, String descricao) {
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nData: " + data + "\nDescrição: " + descricao + "\n";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<exercicio03> listaDeTarefas = new ArrayList<>();

        while (true) {
            System.out.println("Olá, seja bem vindo ao seu adm de tarefas em java");
            System.out.println("----- Lista de Tarefas -----");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Exibir Tarefas");
            System.out.println("4. Sair do administrador");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (escolha) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a data da tarefa: ");
                    String data = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    exercicio03 tarefa = new exercicio03(titulo, data, descricao);
                    listaDeTarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    if (listaDeTarefas.isEmpty()) {
                        System.out.println("A lista de tarefas está vazia.");
                    } else {
                        System.out.println("Tarefas disponíveis:");
                        for (int i = 0; i < listaDeTarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeTarefas.get(i).getTitulo());
                        }
                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int numeroTarefa = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer de entrada

                        if (numeroTarefa >= 1 && numeroTarefa <= listaDeTarefas.size()) {
                            listaDeTarefas.remove(numeroTarefa - 1);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Número de tarefa inválido.");
                        }
                    }
                    break;
                case 3:
                    if (listaDeTarefas.isEmpty()) {
                        System.out.println("A lista de tarefas está vazia.");
                    } else {
                        System.out.println("Tarefas disponíveis:");
                        for (exercicio03 t : listaDeTarefas) {
                            System.out.println(t);
                        }
                    }
                    break;
                case 4:
                    System.out.println("O programa foi encerrado.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
