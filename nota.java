import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int nota;
	    
	    System.out.println("Digite uma nota entre 0 e 10: ");
	    nota= scanner.nextInt();
	    
	    while (nota < 0 || nota > 10){
	        System.out.println("Nota inválida");
	        System.out.println("Digite uma nota entre 0 e 10: ");
	        nota= scanner.nextInt();
	        
	    }
	    System.out.println("Nota informada: " + nota);
	    }
	}
