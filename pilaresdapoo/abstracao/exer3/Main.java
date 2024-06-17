package pilaresdapoo.abstracao.exer3;

public class Main {
    public static void main(String[] args) {
        ItemBiblioteca livro = new Livro("Harry Potter", "J.K.Rowling");
        ItemBiblioteca revista = new Revista("Capricho", 202);


        livro.emprestar();
        livro.devolver();

        revista.emprestar();
        revista.devolver();
    }
}
