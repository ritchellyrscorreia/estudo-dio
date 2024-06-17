package pilaresdapoo.interfaces.exer2;

import java.util.Arrays;

public class Lista implements Ordenavel{


    private String[] elementos;

    public Lista(String... elementos) {
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
