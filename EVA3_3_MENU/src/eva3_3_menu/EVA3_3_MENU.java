/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA3_3_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
            imprimirMenu();
            opcion = captu.nextInt();
            if (opcion==1){
                calcularPotencia();
            }else if (opcion == 2);{
            calcularSuma();
            
    }
        }while(opcion !=3);

    }
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("1. Calcular una potencia");
        System.out.println("2. Sumar dos numeros");
        System.out.println("3. Salir del sistema");
        System.out.println("4. Selelcciona una opción");
    }
    public static void calcularPotencia(){
        Scanner captu = new Scanner(System.in);
        int base, exp;
        System.out.println("*******CALCULAR POTENCIA********");
        System.out.println("Captura la base:");
        base = captu.nextInt();
        System.out.println("Captura el exponente ");
        exp = captu.nextInt();
        //pendiente el calculo
        System.out.println(base + "elevado a"+ exp + "=" +calcularPont(base, exp));
    
    }
    public static int calcularPont(int base, int expo){
        int resu = 1;
        for(int i = 1; i<= expo; i++){
            resu = resu * base;
        
    }
    return resu;
    }
    public static void calcularSuma () {
        Scanner captu = new Scanner(System.in);
        int num1, num2;
        System.out.println("*******CALCULAR SUMA********");
        System.out.println("Capturar primer numero:");
        num1 = captu.nextInt();
        System.out.println("Captura segundo numero ");
        num2 = captu.nextInt();
        //pendiente el calculo
        System.out.println(num1 + "+"+ num2 + "=" +calcularPont(num1, num2));

    }
    
    public static int sumarEnteros(int num1, int num2){
    int suma = num1 +num2;
    return suma;  
    }

}
            
                    


        
    
        
    

