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
        System.nanoTime(); //mil millonesima de segundo
        QuickSort QS = new QuickSort();
        int[] aiDatos = new int [10];
        int[] aiDatos1 = new int [10];
        int[] aiDatos2 = new int [10];
        int[] aiDatos3 = new int [10];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*100 + 1);
        }
        copia(aiDatos, aiDatos1);
        copia(aiDatos, aiDatos2);
        copia(aiDatos, aiDatos3);
        int n = aiDatos3.length;
        System.out.println("Arreglo original");    
        imprimir(aiDatos);
        
        System.out.println("\nSelection Sort");
        selectionSort(aiDatos);
        imprimir(aiDatos);
        
        System.out.println("\nInsertion Sort");
        insertionSort(aiDatos2);
        imprimir(aiDatos2);
        
        System.out.println("\nBubble Sort");
        bubbleSort(aiDatos1);
        imprimir(aiDatos);
        
        System.out.println("\nQuickSort");
        QS.sort(aiDatos3, 0, n-1);
        imprimir(aiDatos3);
    }
    
    public static void imprimir(int[] aiDatos){
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("[" + aiDatos[i] + "]"); 
        }
    }
    
    //Eficiencia es O(n^2)
    public static void selectionSort(int[] aiDatos){
        for (int i = 0; i < aiDatos.length; i++) {
            int iMin = i;
            for (int j = i + 1; j < aiDatos.length; j++) {
                if(aiDatos[j] < aiDatos[iMin]){
                    iMin = j;
                    }
                if(iMin != i){
                int iTemp = aiDatos[i];
                aiDatos[i] = aiDatos[iMin];
                aiDatos[iMin] = iTemp;
            }
                }
        }
    }
    
    public static void insertionSort(int aiDatos[]){
        for (int i = 0; i < aiDatos.length; i++) {
            int iTemp = aiDatos[i];
            int j = i;
            while((j>0) && (iTemp < aiDatos[j-1])){
                aiDatos[j] = aiDatos[j-1];
                j--;
            }
            aiDatos[j] = iTemp;
        }
    }
    
    public static void copia(int aiDatos[], int aiCopia[]){
        for (int i = 0; i < aiDatos.length; i++) {
            aiCopia[i] = aiDatos[i];
        }
    }
    
    //Eficiencia
    //Comparaciones O(N^)
    //Intercambios O(N^)
    public static void bubbleSort(int [] aiDatos){
        for (int i = 0; i < aiDatos.length; i++) {
            int iMax = i;
            for (int j = i + 1; j < aiDatos.length; j++) {
                if(aiDatos[iMax] < aiDatos[j]){
                    iMax = j;
                }
                if(aiDatos[iMax] > aiDatos[j]){
                    int iTemp = aiDatos[iMax];
                    aiDatos[iMax] = aiDatos[j];
                    aiDatos[j] = iTemp;
                }
            }
        }
    }
}

class QuickSort 
{ 
    int partition(int aiDatos[], int low, int high) 
    { 
        int pivot = aiDatos[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            
            if (aiDatos[j] <= pivot) 
            { 
                i++; 
  
                int temp = aiDatos[i]; 
                aiDatos[i] = aiDatos[j]; 
                aiDatos[j] = temp; 
            } 
        } 
  
        int temp = aiDatos[i+1]; 
        aiDatos[i+1] = aiDatos[high]; 
        aiDatos[high] = temp; 
  
        return i+1; 
    } 
  
  
    void sort(int aiDatos[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(aiDatos, low, high); 
  
            sort(aiDatos, low, pi-1); 
            sort(aiDatos, pi+1, high); 
        } 
    }
}