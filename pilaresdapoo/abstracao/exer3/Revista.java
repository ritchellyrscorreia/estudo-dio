package pilaresdapoo.abstracao.exer3;

public class Revista  extends ItemBiblioteca {

    private int edicao;

    public Revista(String titulo, int edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Revista emprestada: " + titulo + " - Edição: " + edicao);
        } else {
            System.out.println("Revista já está emprestada: " + titulo + " - Edição: " + edicao);
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Revista devolvida: " + titulo + " - Edição: " + edicao);
        } else {
            System.out.println("Revista não está emprestada: " + titulo + " - Edição: " + edicao);
        }
    }
}
