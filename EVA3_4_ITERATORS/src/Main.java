
import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<Integer> alDatos = new ArrayList();
        alDatos.add(100);
        alDatos.add(200);
        alDatos.add(300);
        alDatos.add(400);
        alDatos.add(500);
        //IMPRIMIR CADA DATO
        System.out.println("USANDO FOR");
        for (int i = 0; i < alDatos.size(); i++) {
            System.out.println("[" + alDatos.get(i) + "]");
        }
        System.out.println("USANDO ITERATOR");
        for (Iterator<Integer> iterator = alDatos.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            System.out.println("[" + next + "]");
        }
        
        System.out.println("USANDO ITERATOR");
        Iterator itMiItera = alDatos.iterator();
        while(itMiItera.hasNext()){
            System.out.println("[" + itMiItera.next() + "]");
        }
    }
    
}
