package pilaresdapoo.abstracao.exer2;

public abstract class Funcionario {

    protected String nome;
    protected int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public abstract double calcularSalario();
}
