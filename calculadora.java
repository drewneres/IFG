import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite a quantidade de valores (2 a 4): ");
        int numValores = scanner.nextInt();

        if (numValores < 2 || numValores > 4) {
            System.out.println("Quantidade inválida de valores.");
            return;
        }

        float[] valores = new float[numValores];
        for (int i = 0; i < numValores; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextFloat();
        }

        System.out.println("Soma: " + calculadora.soma(valores));
        System.out.println("Subtração: " + calculadora.subtracao(valores));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(valores));
        System.out.println("Divisão: " + calculadora.divisao(valores));

        scanner.close();
    }
}

class Calculadora {
    public float soma(float[] valores) {
        float resultado = 0;
        for (float valor : valores) {
            resultado += valor;
        }
        return resultado;
    }

    public float subtracao(float[] valores) {
        float resultado = valores[0];
        for (int i = 1; i < valores.length; i++) {
            resultado -= valores[i];
        }
        return resultado;
    }

    public float multiplicacao(float[] valores) {
        float resultado = 1;
        for (float valor : valores) {
            resultado *= valor;
        }
        return resultado;
    }

    public float divisao(float[] valores) {
        float resultado = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] == 0) {
                System.out.println("Não é possível dividir por zero.");
                return 0;
            }
            resultado /= valores[i];
        }
        return resultado;
    }
}
