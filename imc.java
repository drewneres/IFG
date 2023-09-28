import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Calculadora IMC");
      System.out.print ("Digite seu peso: ");
      double peso = sc.nextDouble;
      System.out.print ("Digite sua altura: ");
      double altura = sc.nextDouble;
      
      double imc = peso / (altura* altura);
      
      System.out.println ("O seu IMC é: "+ imc);
      System.out.println ("Indice: "+ getIndiceIMC(imc));
      
      sc.close();
  }
    
    public static String getIndiceIMC(double imc){
        if ( imc < 18.5){
            return "Abaixo do peso";
    }
    public static String getIndiceIMC(double imc){
       if ( imc >= 18.5 && imc < 24.9){
            return "Peso Normal";
        }
    public static String getIndiceIMC(double imc){
         if ( imc >= 25 && imc < 29.9){
            return "Sobrepeso";
        }
    public static String getIndiceIMC(double imc){
         if ( imc > 30){
            return "Obesidade";
        }
    }
