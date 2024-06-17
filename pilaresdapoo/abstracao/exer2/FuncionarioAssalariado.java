package pilaresdapoo.abstracao.exer2;

public class FuncionarioAssalariado extends Funcionario {

    private double salarioMensal;

    public FuncionarioAssalariado(String nome, int id, int salarioMensal) {
        super(nome, id);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
