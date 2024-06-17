package pilaresdapoo.heranca;

public class Mamifero extends Animal {

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Mamifero(String nome, float comprimento, int numeroPatas, String cor,
                    String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    // Método para imprimir os dados do peixe
    public void dadosMamifero() {
        dados(); // Chama o método dados da classe Animal para imprimir os dados comuns
        System.out.println("Alimento: " + alimento);
    }

    public static void main(String[] args) {
        Mamifero elefante = new Mamifero("Elefante", 500, 4, "Cinza", "Selva", 5.0f, "Herbívoro");
        elefante.dadosMamifero();
    }
}
