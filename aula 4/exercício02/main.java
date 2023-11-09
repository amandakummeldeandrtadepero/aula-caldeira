package geometrica;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<formaGeometrica> formas = new ArrayList<>();

        formas.add(new Retangulo(5, 10));
        formas.add(new Circulo(4));
        formas.add(new Triangulo(6, 8));
        formas.add(new Quadrado(7));
        formas.add(new Losango(6, 7));

        // Define um formato com duas casas decimais
        DecimalFormat df = new DecimalFormat("#.##");

        for (formaGeometrica forma : formas) {
            double area = forma.calcularArea();
            String nome = forma.getNome();

            // Formata a área com o formato definido
            String areaFormatada = df.format(area);

            System.out.println("Área da forma " + nome + ": " + areaFormatada);
        }
    }
}
