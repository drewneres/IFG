import java.util.Scanner;
public class Main
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Escollha um número:");
        int num = sc.nextInt();
        for(int n = 1;n <= 10;n++){
           int res = num * n;
           
           System.out.println(num+" x "+n+" = "+res);     
       }  
   }
}
