package pilaresdapoo.abstracao.exer1;

public abstract class ContaBancaria {

    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
}
