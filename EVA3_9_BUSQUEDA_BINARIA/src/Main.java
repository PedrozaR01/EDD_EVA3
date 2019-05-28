
import java.util.Scanner;

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
        int[] aiDatos = new int [20];
        Scanner Inpt = new Scanner(System.in);
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*100 + 1);
        }
        
        imprimir(aiDatos);
        selectionSort(aiDatos);
        System.out.println("\nOrdenado");
        imprimir(aiDatos);
        
        System.out.println("\nIntroduce un valor a buscar: " );
        int iVal = Inpt.nextInt();
        Inpt.nextLine();
        int iPos = busquedaBinaria(aiDatos, iVal);
        
        if(iPos == -1){
            System.out.println("\nEl valor no se encontro");
        } else{
            System.out.println("\n El valor se encuentra en la posicion " + iPos);
        }
    }
    
     public static void imprimir(int[] aiDatos){
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("[" + aiDatos[i] + "]"); 
        }
    }
     
     public static void selectionSort(int[] aiDatos){
        for (int i = 0; i < aiDatos.length; i++) {
            int iMin = i;
            for (int j = i + 1; j < aiDatos.length; j++) {
                if(aiDatos[j] < aiDatos[iMin]){
                    iMin = j;
                    }
                }
            if(iMin != i){
                int iTemp = aiDatos[i];
                aiDatos[i] = aiDatos[iMin];
                aiDatos[iMin] = iTemp;
            }
        }
    }
     
     public static int busquedaBinaria(int [] aiDatos, int iVal){
         return recurBusquedaBinaria(aiDatos, iVal, 0, aiDatos.length - 1);
     }
     
     private static int recurBusquedaBinaria(int [] aiDatos, int iVal, int lo, int hi){
         int iMid = lo + ((hi - lo) / 2);
         int iResu = -1;
         
         if (iVal <= 0 && iVal >= 101){
             return iResu;
         }
         if(aiDatos[iMid] == iVal){//valor encontrado
             iResu = iMid;
            }else{//No lo encontramos, repetimos
                if(iVal < aiDatos[iMid]){
                iResu = recurBusquedaBinaria(aiDatos, iVal, lo, iMid-1);
                }else{
                iResu = recurBusquedaBinaria(aiDatos, iVal, iMid + 1, hi);
                 
             }
         }
         
         return iResu;
    }

}