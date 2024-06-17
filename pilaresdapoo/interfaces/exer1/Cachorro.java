package pilaresdapoo.interfaces.exer1;

public class Cachorro implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void movimentar() {
        System.out.println("Cachorro se movimentando...");
    }
}
