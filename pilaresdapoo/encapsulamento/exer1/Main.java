package pilaresdapoo.encapsulamento.exer1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(123456, 0, "Ritchelly Correia");
        conta.depositar(1000);
        conta.sacar(2000);
        System.out.println(String.format("Saldo atual: R$ %.2f" , conta.getSaldo()));
    }

}