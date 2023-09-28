import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int[] idades = new int[10];
	    Scanner input = new Scanner(System.in);
	    
	    for (int i =0; i < idades.length; i++) {
	        System.out.print("Digite a idade da pessoa " +(i+1) + ": ");
	        idades[i] = input.nextInt();
	    }
	    
	    int menorIdade = idades[0];
	    int maiorIdade = idades[0];
	    int posicaoMenorIdade = 0;
	    int posicaoMaiorIdade = 0;
	    
	    for (int i =1; i< idades.length; i++){
	        if (idades[i] < menorIdade){
	            menorIdade = idades[i];
	            posicaoMenorIdade = i;
	        }
	        if (idades[i] > maiorIdade){
	            maiorIdade= idades[i];
	            posicaoMaiorIdade = i;
	        }
	    }
	    
	    System.out.println("A menor idade é: "+ menorIdade + " e está na posição " + posicaoMenorIdade);
	    System.out.println("A maior idade é: "+ maiorIdade + " e está na posição " + posicaoMaiorIdade);
	}
}
