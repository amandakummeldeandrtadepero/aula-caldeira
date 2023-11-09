package geometrica;

class Triangulo extends formaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
    
    @Override
    public String getNome() {
        return "Triangulo";
    }
}
