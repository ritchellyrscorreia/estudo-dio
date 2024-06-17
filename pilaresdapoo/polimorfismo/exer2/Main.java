package pilaresdapoo.polimorfismo.exer2;

public class Main {
    public static void main(String[] args) {
        Instrumento[] instrumentos = {
                new Violao(),
                new Piano(),
                new Flauta()
        };

        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}