import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdNotas;

        System.out.print("Digite a quantidade de notas: ");
        qtdNotas = scan.nextInt();

        float soma = 0;
        for (int i = 0; i  < qtdNotas; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            float nota = scan.nextFloat();
            soma += nota;
        }

        float media = soma / qtdNotas;
        System.out.printf("A média aritmética das %d notas é: %.2f",qtdNotas, media);

    }
}
