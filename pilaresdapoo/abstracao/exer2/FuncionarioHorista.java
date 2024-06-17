package pilaresdapoo.abstracao.exer2;

public class FuncionarioHorista extends Funcionario {

    private double salarioPorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, int id, double salarioPorHora, int horasTrabalhadas) {
        super(nome, id);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }



    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabalhadas;
    }
}
