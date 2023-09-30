
package salario;


public class Salario {

    public static void main(String[] args) {
       int salario = 4725;
       int[] cedulas = {200, 100, 50, 20, 10, 5, 1};
       int[] quantidadeCedulas = new int[cedulas.length];
       
       for (int i = 0; i < cedulas.length; i++){
           quantidadeCedulas[i] = salario / cedulas[i];
           salario %= cedulas[i];
       }
       
        System.out.println("Quantidade de cédulas necessárias:");
        for (int i = 0; i < cedulas.length; i++){
            System.out.println("R$" + (cedulas[i])+ ": "+ quantidadeCedulas[i]+" = "+(cedulas[i]*quantidadeCedulas[i]));
        }
    }
    
}
