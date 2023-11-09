package geometrica;
class Circulo extends formaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    
    @Override
    public String getNome() {
        return "Círculo";
    }
}
