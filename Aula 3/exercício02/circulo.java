import java.text.DecimalFormat;

public class Círculo {

        private double raio;

        public Círculo(double raio) {
                this.raio = raio;
        }

        public double calcularArea() {
                return Math.PI * Math.pow(raio, 2);
        }

        public double calcularCircunferencia() {
                return 2 * Math.PI * raio;
        }

        public static void main(String[] args) {
                Círculo circulo = new Círculo(5.0);
                DecimalFormat df = new DecimalFormat("#.##");

                double area = circulo.calcularArea();
                double circunferencia = circulo.calcularCircunferencia();

                System.out.println("Raio do círculo: " + circulo.raio);
                System.out.println("Área do círculo: " +  df.format(area));
                System.out.println("Circunferência do círculo: " + df.format(circunferencia));
        }
}
