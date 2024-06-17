package pilaresdapoo.interfaces.exer1;

public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void movimentar() {
        System.out.println("Gato se movimentando...");
    }
}
