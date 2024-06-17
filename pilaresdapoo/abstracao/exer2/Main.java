package pilaresdapoo.abstracao.exer2;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado("João", 1, 3000);
        Funcionario funcionarioHorista = new FuncionarioHorista("Maria", 2 ,50,160);

        System.out.println(String.format("Salário do funcionário assalariado: R$ %.2f" , funcionarioAssalariado.calcularSalario()));
        System.out.println(String.format("Salário do funcionário horista: R$ %.2f" , funcionarioHorista.calcularSalario()));
    }
}
