import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n1;
       System.out.println("Digite a quantidade de pessoas na sua sala : ");
       n1 = sc.nextInt();
       
       float idade = 0;
       for (int i = 0; i < n1; i++) {
            System.out.printf("Digite a idade %d: ", i + 1);
            float nota = sc.nextFloat();
            idade += nota;
       }
       float media = idade / n1;
       System.out.printf("A média das %d idades é %f", n1, media );
       
       if(media <= 25 ){
           System.out.println("Turma Jovem ");
       }
       
       if(media >= 26 && media <= 60 ){
           System.out.println("Turma Adulta ");
           
       }
       
       if(media > 60){
           System.out.println("Turma Idosa");
       }
    }
}
