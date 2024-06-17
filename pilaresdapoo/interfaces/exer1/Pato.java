package pilaresdapoo.interfaces.exer1;

public class Pato implements Animal{
    @Override
    public void emitirSom() {
        System.out.println(" Quack! Quack!");
    }

    @Override
    public void movimentar() {
        System.out.println("Pato se movimentando...");
    }
}
