package pilaresdapoo.interfaces.exer1;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal pato = new Pato();

        cachorro.emitirSom();
        cachorro.movimentar();

        gato.emitirSom();
        gato.movimentar();

        pato.emitirSom();
        pato.movimentar();
    }
}
