package pilaresdapoo.heranca;

public class Animal {

    String nome = null;
    private Float comprimento = null;
    private int numeroPatas =0;
    private String cor = null;
    private String ambiente = null;
    private float velocidadeMedia;

    public Animal(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public void setComprimento(Float comprimento) {
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    // Método para imprimir os dados do animal
    public void dados() {
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Número de Patas: " + numeroPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade Média: " + velocidadeMedia + " m/s");
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Animal tigre = new Animal("Tigre", 300, 4, "Laranja com listras pretas", "Selva", 60.0f);
        tigre.dados();
    }
}
