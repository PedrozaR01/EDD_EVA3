
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza 18550354
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //COMPARATOR --> MECANISMO DE ORDENAMIENTO
        LinkedList<Integer> llDatos = new LinkedList();
        llDatos.add(200);
        llDatos.add(900);
        llDatos.add(700);
        llDatos.add(300);
        llDatos.add(500);
        llDatos.add(800);
        llDatos.add(100);
        System.out.println(llDatos);
        
        Comparator cmOrdena = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                /*HAY QUE REGRESAR 
                POSITIVO --> o1 > o2 se debe hacer cambio
                CERO     --> o1 = o2 son iguales
                NEGATIVO --> o1 < o2 se dejan en la misma poaicion
                */
               int iVal1 = (int) o1;
               int iVal2 = (int) o2;
               return iVal1 - iVal2;
            }
        };
        
        
        llDatos.sort(cmOrdena);
        System.out.println(llDatos);
    }
    
}
