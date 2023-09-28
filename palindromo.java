import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {Scanner usuario = new Scanner(System.in);
		double[] numeros = new double[10];
                int numero = 0;
                for(int i=0;i<10;i++){
                    System.out.println("digite um numero para a posiçao "+(numero+1)+" : ");
                    int itens = usuario.nextInt();
                    numeros[numero] = itens;
                    numero++;
                }
                int igual=0;
                numero=0;
                while(numero<6){
                    if(numeros[igual]==numeros[9-igual]){
                        igual++;
                    }else{
                        numero=6;
                    }
                switch (numero){
                    case 6 -> {
                        System.out.println("nao e palindromo");
                        }
                    case 5 ->{
                        System.out.println("e palindromo");
                    }
                }   
                numero++;
                }
                System.out.println("Valores do vetor:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }
