import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] A = new int[7];
		int[] B = new int[7];
		
		Scanner in = new Scanner(System.in);
	    
	    for(int i = 0; i < 7; i++){
	         System.out.println("Digite um valor: ");
	         A[i] = in.nextInt();
	    }
	    
	    for(int i = 0; i < 7; i++){
	        B[i] = A[i]*2;
	    }
	  
	    
	    System.out.println("VETOR A");
	    for(int i = 0; i < 7; i++){
	         System.out.print(A[i] + " ");
	    }
	    
	    
	    System.out.println("\nVETOR B");
	    for(int i = 0; i < 7; i++){
	         System.out.print(B[i] + " ");
	    }
	    
		
	
	}
}
