package pilaresdapoo.abstracao.exer1;

public class ContaCorrente extends ContaBancaria {

    private double taxaOperacao = 0.05; // 5% de taxa de operação

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor - (valor * taxaOperacao);
        System.out.println("Deposito Conta Corrente realizado com sucesso !");
        System.out.println(String.format("Saldo atual: R$ %.2f" , getSaldo()));
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo){
            saldo = saldo - valor - (valor * taxaOperacao);
            System.out.println("Saque Conta Corrente realizado com sucesso !");
            System.out.println(String.format("Saldo atual: R$ %.2f" , getSaldo()));
        } else {
            System.out.println("Saldo Conta Corrente insuficiente !");
            System.out.println(String.format("Saldo atual: R$ %.2f" , getSaldo()));
        }

    }
}
