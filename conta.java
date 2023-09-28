import java.util.Scanner;
public class Main
{
  public static void main (String[]args){
      
    Scanner input = new Scanner (System.in);
    
      System.out.print ("Digite o tamanho do vetor: ");
    int tamanho = input.nextInt ();

    int[] vetor = new int[tamanho];

      System.out.println ("Digite os números: ");
    for (int i = 0; 1 < tamanho; i++){
	    vetor[i] = input.nextInt ();
      }
    int contador = 0;
    for (int i = 0; i < tamanho; i++){
	    if (vetor[i] < 0) {
	    contador++;
	    }
      }

    System.out.println ("Quantidade números negativos: " + contador);
    input.close ();
    
    }
    
}
