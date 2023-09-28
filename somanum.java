import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a quantidade de números a serem informados: ");
      int quantidadeNumeros = scanner.nextInt();

      int soma = 0;
      for (int i = 1; i <= quantidadeNumeros; i++) {
         System.out.print("Digite o número " + i + ": ");
         int numero = scanner.nextInt();
         soma += numero;
      }

      System.out.println("A soma dos números informados é: " + soma);
   }
}
