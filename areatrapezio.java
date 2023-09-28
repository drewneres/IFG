import java.util.Scanner;

public class Main {

}

class Trapezio {
    private float baseMaior;
    private float baseMenor;
    private float altura;

    public float getAltura() {
        return altura;
    }

    public float getBaseMaior() {
        return baseMaior;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setBaseMaior(float baseMaior) {
        this.baseMaior = baseMaior;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    public float calcularArea() {
        float area;
        area = ((baseMaior + baseMenor) * altura) / 2;
        return area;
    }

    public void imprimirDadosTrapezio() {
        System.out.println("Altura: " + altura);
        System.out.println("Base Maior: " + baseMaior);
        System.out.println("Base Menor: " + baseMenor);
    }
}

class Resultado {
    public static void main(String[] args) {
        Trapezio trapezio = new Trapezio();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a Altura: ");
        float receber = scanner.nextFloat();
        trapezio.setAltura(receber);

        System.out.print("Digite a Base Maior: ");
        receber = scanner.nextFloat();
        trapezio.setBaseMaior(receber);

        int wl = 0;
        while (wl != 1) {
            System.out.print("Digite a Base Menor: ");
            receber = scanner.nextFloat();
            if (trapezio.getBaseMaior() < receber) {
                System.out.println("A Base menor não pode ser maior que a Base maior. Digite novamente.");
            } else {
                trapezio.setBaseMenor(receber);
                wl = 1;
            }
        }

        System.out.println("Área: " + trapezio.calcularArea());
        trapezio.imprimirDadosTrapezio();

        scanner.close();
    }
}
