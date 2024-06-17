package pilaresdapoo.polimorfismo.exerc1;

public class Main {
    public static void main(String[] args) {

        Forma[] formas = {
                new Circulo(5),
                new Retangulo(4, 6),
                new Triangulo(4, 7)
        };

        for (Forma forma : formas) {
            if (forma instanceof Circulo) {
                System.out.println("Área do Círculo: " + forma.calcularArea());
            } else if (forma instanceof Retangulo) {
                System.out.println("Área do Retângulo: " + forma.calcularArea());
            } else if (forma instanceof Triangulo) {
                System.out.println("Área do Triângulo: " + forma.calcularArea());
            }
        }
    }
}