package pilaresdapoo.heranca;

public class Peixe extends Animal {

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente,
                 float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe() {
        dados(); // Chama o método dados da classe Animal para imprimir os dados comuns
        System.out.println("Característica: " + caracteristica);
    }

    // Método principal para testar a classe Peixe
    public static void main(String[] args) {
        Peixe tubarao = new Peixe("Tubarão", 350, 0, "Cinza", "Mar", 25.0f, "Possui nadadeiras e dentes afiados");
        tubarao.dadosPeixe();
    }

}
