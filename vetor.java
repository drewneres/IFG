public class Main
{
	public static void main(String[] args) {
		
		int[] A = {1,2,3,4,5};
		int[] B = new int[A.length];
		
		for (int i=0; i < A.length; i++){
		    B[i] = A[i];
		}
		    System.out.println("Vetor A:");
		
		for (int i=0; i < A.length; i++){
		    System.out.print(A[i]+" ");
		    
		    
		}
		    System.out.println(" ");
		    
	        System.out.println("Vetor B:");
	        
		for (int i=0; i < B.length; i++){
		    System.out.print(B[i]+" ");}
	}
}
