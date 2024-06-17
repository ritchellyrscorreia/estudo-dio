package pilaresdapoo.encapsulamento.exer2;

public class Main {
     public static void main(String[] args) {
        Produto produto = new Produto(001, "Notebook Acer" , 3000.00 ,10);
         System.out.println(String.format("Valor total do estoque: R$ %.2f" , produto.calcularValorEstoque()));
    }
}
