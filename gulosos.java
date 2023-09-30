
package gulosos1;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Gulosos1 {


    public static void main(String[] args) {
        int pos =0;
        
       Tarefa t1 = new Tarefa("T1",0,2);
       Tarefa t2 = new Tarefa("T2",1,2);
       Tarefa t3 = new Tarefa("T3",3,6);
       Tarefa t4 = new Tarefa("T4",0,4);
       Tarefa t5 = new Tarefa("T5",2,8);
       Tarefa t6 = new Tarefa("T6",4,5);
       Tarefa t7 = new Tarefa("T7",6,8);
       Tarefa t8 = new Tarefa("T8",8,9);
       Tarefa t9 = new Tarefa("T9",5,8);
       Tarefa t10 = new Tarefa("T10",0,10);
       
        List<Tarefa> lista = new ArrayList<Tarefa>();
        
        lista.add (t1);
        lista.add (t2);
        lista.add (t3);
        lista.add (t4);
        lista.add (t5);
        lista.add (t6);
        lista.add (t7);
        lista.add (t8);
        lista.add (t9);
        lista.add (t10);
        
        lista.sort(Comparator.comparing(Tarefa::getFim));
       
        
        for( Tarefa tarefinha : lista){
            System.out.println("\n"+tarefinha);
        }
        
        List<Tarefa> solucao = new ArrayList();
        solucao.add(lista.get(0)); 
        System.out.println("\n\n\n\n");
        for (int i =1;i<lista.size();i++){
            
            if (lista.get(i).getInicio() >= lista.get(pos).getFim()){
                solucao.add(lista.get(i));
                pos =i;
            }
      
    }
         for( Tarefa nome : solucao){
         System.out.println("\n"+nome);
       }
       
       
    }
    
}
