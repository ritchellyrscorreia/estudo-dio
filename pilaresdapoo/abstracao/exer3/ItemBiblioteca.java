package pilaresdapoo.abstracao.exer3;

public abstract class ItemBiblioteca {

    protected String titulo;
    protected boolean emprestado;

    public ItemBiblioteca(String titulo) {
        this.titulo = titulo;
        this.emprestado = false;
    }

    public abstract void emprestar();

    public abstract void devolver();

    public boolean isEmprestado() {
        return emprestado;
    }
}
