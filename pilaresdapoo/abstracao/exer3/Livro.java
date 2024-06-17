package pilaresdapoo.abstracao.exer3;

public class Livro extends ItemBiblioteca{

    private String autor;

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Livro já está emprestado: " + titulo);
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido: " + titulo);
        } else {
            System.out.println("Livro não está emprestado: " + titulo);
        }
    }
}
