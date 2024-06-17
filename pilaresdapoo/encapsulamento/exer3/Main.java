package pilaresdapoo.encapsulamento.exer3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(12345, "Ana Maria", 5.5);
        if (aluno.isAprovado()){
            System.out.println("O aluno está aprovado.");
        } else {
            System.out.println("O aluno está reprovado.");
        }
    }
}
