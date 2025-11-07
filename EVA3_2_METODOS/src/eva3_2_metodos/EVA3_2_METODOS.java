/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_metodos;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA3_2_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String mensaje;
        int valor;
        System.out.println("Captura mensaje:");
        mensaje = captu.nextLine();
        System.out.println("Captura repeticiones: ");
        valor = captu.nextInt();
        imprimirMensaje(mensaje, valor);//INVOCACIÓN
    }
                            //imprimirMensaje(String, int)
        public static void imprimirMensaje(String mensaje, int repeticiones){
            for (int i = 0; i< repeticiones; i++){
                System.out.println(mensaje);
        }
        
    }
    
}
