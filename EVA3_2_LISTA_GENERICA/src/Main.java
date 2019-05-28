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
        Lista<String> miLista = new Lista();
        miLista.agregarNodo("Hola");
        miLista.agregarNodo(" ");
        miLista.agregarNodo("Mundo");
        miLista.agregarNodo("Hahahaha");
        miLista.agregarNodo("ha.....");
        miLista.agregarNodo(".....");
        miLista.agregarNodo("HELP");
        miLista.imprimir();
    }
    
}

class Nodo<T>{
   //ATRIBUTO DATOS
    private T dato;
    //ATRIBUTO PARA CREAR LA LISTA (REFERENCIAS)
    private Nodo sig;

    public Nodo() {
        sig = null;
    }

    public Nodo(T dato) {
        this.dato = dato;
        sig = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
     
}

class Lista<T>{
      //INICIO PARA LA LISTA
    private Nodo inicio;
    private Nodo fin;
    private int iCont = 0;

    //Al crear la lista, inicia con cero elementos
    //LISTA VACIA
    //3 ESTADOS: VACIA, CON UN NODO, CON N NODOS
    public Lista() {
        inicio = null;
        fin = null;
    }
    
    //PRIMER MÈTODO: AGREGAR UN NODO
    //METODO QUE RECIBA UN NODO
    //EFICIENCIA O(N) (sin NODO fin)
    //EFICIENCIA --> O(1) (Con NODO fin)
    public void agregarNodo(T dato){
        //verificar el estado de la lista:
        //Està vacia?
        Nodo<T> nNuevo = new Nodo(dato);
        if(inicio == null){//Lista vacia
          inicio = nNuevo;
          fin = nNuevo; //MODIFICADO --> EFICIENCIA
          iCont++;
        }else{//Lista con n nodo
              //Lista con n nodos
            //LLEVAR AL FINAL DE LA LISTA
           /* NODO nTemp = inicio;
            while(nTemp.getSig() != null){
                nTemp = nTemp.getSig();
            }
            //CONECTAMOS NTEMP.SIG --> NUEVO
            nTemp.setSig(nNuevo);*/
            fin.setSig(nNuevo);
            fin = nNuevo;
            iCont++;
    }
    
}
    //O(1)
    public void agregarInicio(Nodo nNuevo){
        //VERIFICAR EL ESTADO DE LA LISTA
        //ESTA VACIA?
        if(inicio == null){//Lista vacia
            inicio = nNuevo;
            fin = nNuevo;
            iCont++;
        }else{
            nNuevo.setSig(inicio);//LO PONEMOS AL PRINCIPIO
            inicio = nNuevo;
            iCont++;
        }
    }
    //O(N)
    public void agregarEn(int iPos, Nodo nNuevo){
        //posicion valida (dentro del indice de la lista)
        //SI HAY 0 NODOS EN LA LISTA
        //INSERTAR AL INICIO (pos = 0)
        //INSERTAR EN CUALQUIER POSICION
        Nodo nTemp = inicio;
        int conta = 0;
        if (iPos == 0){
            agregarInicio(nNuevo);
        }else{//INSERTAR EN CUALQUIER POSICION
            //VALIDAR SI LA LISTA ESTA VACIA
            while(conta != iPos-1){
                conta++;
                nTemp = nTemp.getSig();
            }
                nNuevo.setSig(nTemp.getSig());
                nTemp.setSig(nNuevo);
            
        }
    }
    //O(N)
    public void borrarNodo(int iPos){
        //Borrar al inicio de la lista
        //borrar cualquier posiciòn
        //VERIFICAR QUE HAYA NODOS
        //verificar que la posiciòn sea vàlida
        
        if(inicio != null){ // TENEMOS NODOS
            if(iPos == 0){ // nodo inicial
                // HAY UN NODO
                // HAY N NODOS
                inicio = inicio.getSig();
                // EL PROBLEMA ES EL NODO FIN
                if(inicio.getSig() == null){
                    fin = null;
                    iCont--;
                }
            }else{ // cualquier otro nodo
                // MOVERNOS POR LA LISTA
                // EN UNA LISTA SIMPLE (UN SOLO ENLACE)
                // IMPLICA MOVERNOS HASTA LA POSICION PREVIA -1
                Nodo nTemp = inicio;
                int contador = 0;
                while(contador != iPos-1){
                    nTemp = nTemp.getSig();
                    contador++;
                }
                Nodo nSig = nTemp.getSig();
                nTemp.setSig(nSig.getSig());
                // EL PROBLEMA ES EL NODO FIN
                if(nTemp.getSig()==null){ // BORRAMOS EL ULTIMO NODO
                    fin = nTemp;
                    iCont--;
                }
            }
        }else{ // GENERAR UNA EXCEPCION -> LISTA VACIA
            
        }
    }
    //O(N)
    public void imprimir(){
        //LLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio;
        while (nTemp != null){
            System.out.print("[" + nTemp.getDato()+ "]");
            nTemp = nTemp.getSig();
        } 
        System.out.println("");
    }
    //O(1)
    public int longitud(){
        /*NODO nTemp = inicio;
       while (nTemp != null){
            iCont++;
            nTemp = nTemp.getSig(); 
    }*/
        return iCont;
}
    //O(1)
    public void vaciar(){
        inicio = null;
        fin = null;
    }
    
    //LISTAS MANEJAN ÌNDICES COMO ARREGLOS
    //PRIMER NODO --> 0
    //ÙLTIMO NODA --> N - 1
    //EFICIENCIA --> O(N)
    //AGREGAR CONDICIONES:
    //LISTA VACÌA
    //PARÀMETRO INCORRECTO
    //(iPos no este entre 0 y N - 1)
    //Excepciones --> THROW
    
    
    //O(1)
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    //O(N)
    public Lista copiaLista(){
        Lista lsCopia = new Lista();
        //HAY QUE RECORRER TODA LA LISTA, LEER CADA NODO
        //CREAR UN NODO NUEVO PARA LEER ESE VALOR
        //INSERTARLO EN LA NUEVA LISTA
        Nodo nTemp = inicio;
        while (nTemp != null){
            lsCopia.agregarNodo(new Nodo(nTemp.getDato()));
            nTemp = nTemp.getSig();
        } 
        return lsCopia;
    }
}