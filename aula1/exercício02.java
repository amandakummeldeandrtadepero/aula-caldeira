import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");

        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");

        double numero2 = scanner.nextDouble();

        scanner.close();

        System.out.println("O primeiro número é: " + numero1);
        System.out.println("O segundo número é: " + numero2);
    }
}
