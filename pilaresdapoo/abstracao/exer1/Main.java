package pilaresdapoo.abstracao.exer1;

public class Main {

    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaCorrente(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000);

        contaCorrente.depositar(500);
        contaCorrente.sacar(2000);

        contaPoupanca.depositar(500);
        contaPoupanca.sacar(2000);

        contaPoupanca.aplicarJuros();

        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
    }
}
