
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Double> alMiArrayList = new ArrayList();
        alMiArrayList.add(7.0);
        alMiArrayList.add(3.1416);
        alMiArrayList.add(9.9);
        alMiArrayList.add(19.2);
        alMiArrayList.add(78.32);
        alMiArrayList.add(11.5);
        alMiArrayList.add(48.46);
        //alMiArrayList.get(0);
        for (int i = 0; i < alMiArrayList.size(); i++) {
            System.out.println("[" + alMiArrayList.get(i) + "]");
        }
        /*alMiArrayList.add("Hola Mundo");
        alMiArrayList.add(7.0);
        alMiArrayList.add(true);
        alMiArrayList.get(0);*/
        
        LinkedList<Integer> miListaEnlazada = new LinkedList();
        miListaEnlazada.add(10);
        miListaEnlazada.add(7);
        miListaEnlazada.add(22);
        miListaEnlazada.add(78);
        miListaEnlazada.add(117);
        miListaEnlazada.add(115);
        miListaEnlazada.add(45);
        System.out.println("Mi Lista Enlazada: ");
        System.out.println(miListaEnlazada);
        
        for (int i = 0; i < miListaEnlazada.size(); i++) {
            System.out.println("[" + miListaEnlazada.get(i) + "]");
        }
        miListaEnlazada.remove(3);
        System.out.println("Eliminando la tercera posición: ");
        for (int i = 0; i < miListaEnlazada.size(); i++) {
            System.out.println("[" + miListaEnlazada.get(i) + "]");
        }
    }
    
}
