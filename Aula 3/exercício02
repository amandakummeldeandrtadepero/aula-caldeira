import java.text.DecimalFormat;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        definirRaio(raio);
    }

    public void definirRaio(double novoRaio) {
        if (novoRaio > 0) {
            this.raio = novoRaio;
        } else {
            System.out.println("O raio deve ser um valor positivo.");
        }
    }
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularAreaSombreada(Circulo outroCirculo) {
        double diferencaAreas = Math.abs(this.calcularArea() - outroCirculo.calcularArea());
        return diferencaAreas;
    }
    public boolean saoIguais(Circulo outroCirculo) {
        return this.raio == outroCirculo.raio;
    }
    public static Circulo criarAPartirDeCoordenadas(double x, double y, double raio) {
        double novoRaio = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return new Circulo(novoRaio);
    }
    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("#.##");
        return "Círculo [Raio=" + formato.format(raio) + ", Área=" + formato.format(calcularArea()) + ", Circunferência="
                + formato.format(calcularCircunferencia()) + "]";
    }

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(3.0);

        System.out.println("Círculo 1: " + circulo1);
        System.out.println("Círculo 2: " + circulo2);

        System.out.println("Diâmetro do Círculo 1: " + circulo1.calcularDiametro());

        if (circulo1.saoIguais(circulo2)) {
            System.out.println("Os círculos 1 e 2 têm o mesmo raio.");
        } else {
            System.out.println("Os círculos 1 e 2 têm raios diferentes.");
        }

        Circulo circuloAPartirDeCoordenadas = Circulo.criarAPartirDeCoordenadas(3.0, 4.0, 5.0);
        System.out.println("Círculo criado a partir de coordenadas: " + circuloAPartirDeCoordenadas);
    }
}
