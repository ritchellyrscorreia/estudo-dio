package pilaresdapoo.interfaces.exer2;

import java.util.Arrays;

public class Vetor implements Ordenavel {

    private int[] elementos;

    public Vetor(int... elementos) {
        this.elementos = elementos;
    }

    @Override
    public void ordenar() {
        Arrays.sort(elementos);
    }

    public void imprimir() {
        System.out.println(Arrays.toString(elementos));
    }
}
