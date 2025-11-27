/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_25550923;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXAMEN2_25550923 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int numero, opc;
        int l= 2;
        System.out.println("BIENVENIDO AL SISTEMA. Elija una opción");
        System.out.println("1.Imprimir numeros primos");
        System.out.println("2.Imprimir numeros No primos");
        System.out.println("3. Salir del sistema");
        opc = captu.nextInt();
            if(opc == 1){
                System.out.println("Numeros Primos" );
                System.out.println("Capturar un numero:");
                numero = captu.nextInt();
     
                for (int i = 2; i <= numero; i++) {
                    for(int j =1; j<= i; j++){        
                System.out.println("* " + numero);
                }
            }
                
            }else if(opc == 2){
                System.out.println("¿cuanto vas a retirar?");   
            }
    }
}

                //for (int i=2; i<numero; i++){
                
    
    

