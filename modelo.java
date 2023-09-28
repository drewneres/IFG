abstract class Animal{
    public String nome;
    public abstract String emitirSom();
    public Animal(String nome){
        this.nome = nome;
    }
}
abstract class Ave extends Animal{
    Ave(String nome){
        super(nome);
    }
    public abstract String voar();

}
class Papagaio extends Ave{
    Papagaio(String nome){
        super(nome);
    }

    @Override
    public String voar() {
        return "Voador";
    }

    @Override
    public String emitirSom() {
        return "fiaputaaaa";
    }
}
abstract class Mamifero extends Animal{
    Mamifero(String nome){
        super(nome);
    }
    public abstract String amamentar();
}
class Gato extends Mamifero{
    Gato(String nome){
        super(nome);
    }
    String raca;

    @Override
    public String amamentar() {
        return "sim";
    }

    @Override
    public String emitirSom() {
        return "Miauuu";
    }
}
class Cachorro extends Mamifero{
    Cachorro(String nome){
        super(nome);
    }
    String raca;
    String tamanho;

    @Override
    public String amamentar() {
        return "sim";
    }

    @Override
    public String emitirSom() {
        return "AuAu";
    }
}
class Main{
    public static void main(String[]args){
	System.out.println(" Mário, esta questão eu (Hendrew) fiz junto com os colegas Gabriel e Gean! ");
        Cachorro dog = new Cachorro("Cachorro");
        Papagaio paraguaio = new Papagaio("Papagaio");
        Gato garfield = new Gato("Gato");

        System.out.println("Nome do Cachorro: "+dog.nome);
        System.out.println("Raça: "+(dog.raca="Cachorro Cururu"));
        System.out.println("Tamanho: "+(dog.tamanho="0,59cm"));
        System.out.println(dog.amamentar());
        System.out.println(dog.emitirSom());
	System.out.println("   ");

	System.out.println("Nome do Papagaio: "+paraguaio.nome);
	System.out.println(paraguaio.voar());
	System.out.println(paraguaio.emitirSom());
	System.out.println("   ");

	 System.out.println("Nome do Gato: "+dog.nome);
        System.out.println("Raça: "+(garfield.raca="Gato Jurandir"));
        System.out.println("Filhote: "+garfield.amamentar());
        System.out.println(garfield.emitirSom());
	System.out.println("   ");

    }
}
