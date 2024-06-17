package pilaresdapoo.encapsulamento.exer1;

public class ContaBancaria {


    private int numeroDaConta;
    private double saldo;
    private String titular;

    public ContaBancaria(int numeroDaConta, double saldo, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque concluido com sucesso");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }








}
