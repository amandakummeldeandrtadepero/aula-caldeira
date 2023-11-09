package geometrica;

class Quadrado extends formaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    @Override
    public String getNome() {
        return "Quadrado";
    }
}
