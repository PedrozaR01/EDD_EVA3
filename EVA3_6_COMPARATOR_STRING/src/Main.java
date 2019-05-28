
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> llCadenas = new LinkedList();
        llCadenas.add("Hola");
        llCadenas.add("Mundo");
        llCadenas.add("Cruel");
        llCadenas.add("Estructura");
        llCadenas.add("De");
        llCadenas.add("Datos");
        llCadenas.add("Halo");
        
        
        System.out.println(llCadenas);
        
        Comparator cOrdenCadenas = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                String cCade1 = (String) o1;
                String cCade2 = (String) o2;
                int iResu = 0;
                //COMPARAR
                char c1, c2;
                char c11, c22;
                for (int i = 0; i < cCade1.length(); i++) {
                    c1 = cCade1.charAt(i); 
                }
                c11 = c1;
                
                for (int i = 0; i < cCade2.length(); i++) {
                    c2 = cCade2.charAt(i);
                }
                c22 = c2;
                
                iResu = c1 - c2;
                return iResu;
                
            }
        
        };
        llCadenas.sort(cOrdenCadenas);
        System.out.println(llCadenas);
    }
    
}
