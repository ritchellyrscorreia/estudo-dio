package pilaresdapoo.abstracao.exer1;

public class ContaPoupanca extends ContaBancaria {

    private double taxaDeJuros = 0.01; // 1% de juros

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Deposito Conta Poupança realizado com sucesso !");
        System.out.println(String.format("Saldo atual: R$ %.2f" , getSaldo()));
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque Conta Poupança realizado com sucesso !");
            System.out.println(String.format("Saldo atual: R$ %.2f" , getSaldo()));
        } else {
            System.out.println("Saldo Conta Poupança insuficiente !");
            System.out.println(String.format("Saldo atual: R$ %.2f" , getSaldo()));
        }
    }

    public void aplicarJuros() {
        saldo = saldo + (saldo * taxaDeJuros);
    }
}
