class Animal {
    private String nome;
    private float comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    public Animal(String nome, String cor, String ambiente, float velocidadeMedia, float comprimento, int numeroDePatas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Cor: " + getCor());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Numero de Patas: " + getNumeroDePatas());
        System.out.println("Velocidade Media: " + getVelocidadeMedia() + " KM/H");
    }
}

class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, String cor, String ambiente, float velocidadeMedia, float comprimento, int numeroDePatas) {
        super(nome, cor, ambiente, velocidadeMedia, comprimento, numeroDePatas);
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void imprimirDadosMamifero() {
        imprimirDados();
        System.out.println("Alimento: " + getAlimento());
    }
}

class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, String cor, String ambiente, float velocidadeMedia, float comprimento, int numeroDePatas) {
        super(nome, cor, ambiente, velocidadeMedia, comprimento, numeroDePatas);
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void imprimirDadosPeixe() {
        imprimirDados();
        System.out.println("Caracteristica: " + getCaracteristica());
    }
}

public class TestarAnimais {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Tubarao", "Cinzento Azulado", "Mar", 56, 4, 0);
        peixe.setCaracteristica("Carnivoro");
        peixe.imprimirDadosPeixe();

        System.out.println();

        Mamifero camelo = new Mamifero("Camelo", "Amarelo", "Deserto", 65, 3, 4);
        camelo.setAlimento("Vegetais");
        camelo.imprimirDadosMamifero();
    }
}
