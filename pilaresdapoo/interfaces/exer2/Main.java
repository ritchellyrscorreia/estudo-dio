package pilaresdapoo.interfaces.exer2;

public class Main {
    public static void main(String[] args) {
        Ordenavel vetor = new Vetor(3,1,5,8,2,4,6,7,9);
        Ordenavel lista = new Lista("z", "c", "a", "b", "y", "o", "r", "w");

        vetor.ordenar();
        lista.ordenar();

        ((Vetor) vetor).imprimir();
        ((Lista) lista).imprimir();
    }
}
