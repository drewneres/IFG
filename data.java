import java.util.Scanner;

public class Main {

}

class Data {
    private int mes;
    private int dia;
    private int ano;

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void exibirData() {
        if (dia > 30) {
            System.out.println("Data inválida");
        } else if (dia < 0) {
            System.out.println("Data inválida");
        } else {
            if (mes > 12) {
                System.out.println("Data inválida");
            } else if (mes < 0) {
                System.out.println("Data inválida");
            } else {
                if (ano < 0) {
                    System.out.println("Data inválida");
                } else {
                    System.out.println("Estamos na data: ");
                    System.out.println(dia + "/" + mes + "/" + ano);
                }
            }
        }
    }
}

class TesteData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data calendario = new Data();
        int receber;

        System.out.print("Digite o dia: ");
        receber = scanner.nextInt();
        calendario.setDia(receber);

        System.out.print("Digite o mês: ");
        receber = scanner.nextInt();
        calendario.setMes(receber);

        System.out.print("Digite o ano: ");
        receber = scanner.nextInt();
        calendario.setAno(receber);

        calendario.exibirData();
    }
}
