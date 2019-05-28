
import java.util.Comparator;
import java.util.Iterator;
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
        LinkedList<Persona> llObjetos = new LinkedList();
        llObjetos.add(new Persona());
        llObjetos.add(new Persona("Juan", "Perez", 20));
        llObjetos.add(new Persona("Matusalen", "Jimenez", 800));
        llObjetos.add(new Persona("Pedro", "Picapiedra", 30));
        llObjetos.add(new Persona("Homero", "Jimeno", 40));
        llObjetos.add(new Persona("Margaret", "Bubiere", 35));
        llObjetos.add(new Persona("Pablo", "Bubiere", 50));
        llObjetos.add(new Persona("Lisa", "Bubiere", 10));
        
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
            System.out.println("Nombre: " + next.getNombre());
            System.out.println("Apellido: " + next.getApellido());
            System.out.println("Edad: " + next.getEdad());
            System.out.println("-------------------------");
            
        }
        //ORDENAMIENTO POR EDAD
        Comparator cEdad = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                /*HAY QUE REGRESAR 
                POSITIVO --> o1 > o2 se debe hacer cambio
                CERO     --> o1 = o2 son iguales
                NEGATIVO --> o1 < o2 se dejan en la misma poaicion
                */
               Persona pPer1 = (Persona) o1;
               Persona pPer2 = (Persona) o2;
               return pPer1.getEdad() - pPer2.getEdad();
            }
        
        };
        llObjetos.sort(cEdad);
        System.out.println("\nORDENADOS POR EDAD\n");
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
            System.out.println("Nombre: " + next.getNombre());
            System.out.println("Apellido: " + next.getApellido());
            System.out.println("Edad: " + next.getEdad());
            System.out.println("-------------------------");
            
        }
        
        
        //ORDENAR POR NOMBRE Y APELLIDO
        Comparator cApeNom = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Persona cCade1 = (Persona) o1;
                Persona cCade2 = (Persona) o2;
                char cAp1, cAp2;
                cAp1 = cCade1.getApellido().charAt(0);
                cAp2 = cCade2.getApellido().charAt(0);
                int iResu = cAp1 - cAp2;
                if(iResu == 0){
                    char cNom1, cNom2;
                    cNom1 = cCade1.getNombre().charAt(0);
                    cNom2 = cCade2.getNombre().charAt(0);
                    iResu = cNom1 - cNom2;
                }
                return iResu;
            }
        
        };
        
        llObjetos.sort(cApeNom);
        System.out.println("\nORDENADOS POR APELLIDO\n");
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
            System.out.println("Nombre: " + next.getNombre());
            System.out.println("Apellido: " + next.getApellido());
            System.out.println("Edad: " + next.getEdad());
            System.out.println("-------------------------");
            
        }
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        nombre = "Roberto";
        apellido = "Pedroza";
        edad = 19;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}