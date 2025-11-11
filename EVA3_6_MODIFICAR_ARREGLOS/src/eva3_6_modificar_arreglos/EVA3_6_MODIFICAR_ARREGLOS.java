/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_modificar_arreglos;


public class EVA3_6_MODIFICAR_ARREGLOS {
    
    public static void main(String[] args) {
        int arreglo1[] = new int[10];
        int arreglo2[]= new int [20];
        llenarArreglo(arreglo1);
        imprimirrArreglo(arreglo1);
        llenarArreglo(arreglo2);
        imprimirrArreglo(arreglo2);
    }
    public static void llenarArreglo(int arreglo[]){
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 100);
            
        }
    }
    public static void imprimirrArreglo(int arreglo[]){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
         
}

