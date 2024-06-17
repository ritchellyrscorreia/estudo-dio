package pilaresdapoo.polimorfismo.exerc1;

public class Circulo extends  Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        return  Math.PI * raio * raio;
    }
}
