import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] A = new int[3];
		int[] B = new int[3];
		int[] C = new int[3];
        
        for(int i =0;i <3;i++){
            System.out.println("Digite os valores de A : ");
            A[i]= sc.nextInt();
        }
        for(int i = 0; i<3; i++){
            System.out.println("Digite os valores de B : ");
            B[i] = sc.nextInt();
            
        }
		
		
	    System.out.println("VETOR A");
	    for(int i = 0; i < 3; i++){
	         System.out.print(A[i] + " ");
		
	}

	    System.out.println("\nVETOR B");
	    for(int i = 0; i < 3; i++){
	         System.out.print(B[i] + " ");
	    }
	    for(int i=0;i < 3;i++){
	        C[i]=A[i]*B[i];
	    }
	    System.out.println("\nVetor C ");
	    for(int i = 0; i <3; i++){
	        System.out.println(C[i]);
	    }
	}
	}
