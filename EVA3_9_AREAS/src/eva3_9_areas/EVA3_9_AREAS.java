/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_areas;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA3_9_AREAS {

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
            AreaCirculo();
            break;
            } else if (opcion==2){
            AreaRectangulo();
            break;
            } else if (opcion == 3) {   
            AreaTrapecio();
            break;
            }
            
        }while(opcion !=4);

    }
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Selelcciona una opción");
        System.out.println("1. Calcular area de un  Circulo");
        System.out.println("2. Calcular area de un Rectangulo");
        System.out.println("3. Calcular area de un Trapecio");
        System.out.println("4. Salir del sistema");
    }
    public static void AreaCirculo(){
        Scanner captu = new Scanner(System.in);
        double radio;
        double pi = 3.1416;
        System.out.println("*******CALCULAR AREA DE UN CIRCULO********");
        System.out.println("Captura el radio:");
        radio = captu.nextDouble();
        //pendiente el calculo
        System.out.println("El area del circulo con radio de " + radio + " es: " + calcularArea(radio, pi));
    
    }
    public static double calcularArea(double radio ){
        double area = Math.PI * radio * radio;
        return area;
    
    }
    public static void AreaRectangulo(){
        Scanner captu = new Scanner(System.in);
        double base,altura;
        System.out.println("*******CALCULAR AREA DE UN RECTANGULO********");
        System.out.println("Capturar base:");
        base = captu.nextDouble();
        System.out.println("Capturar altura: ");
        altura = captu.nextDouble();
        
        //pendiente el calculo
        System.out.println("El area de un rectangulo con "+ base + altura +  " es: " + calcularArea(base, altura));

    }
    
    public static double calcularArea(double base, double altura){
    double area =(base*altura);
    return area;  
    
    }
    
    public static void AreaTrapecio() {
        Scanner captu = new Scanner(System.in);
        double Base,base,altura;
        System.out.println("*******CALCULAR AREA DE UN TRAPECIO********");
        System.out.println("Capturar base mayor:");
        Base = captu.nextDouble();
        System.out.println("Capturar base menor: ");
        base= captu.nextDouble();
        System.out.println("Capturar altura: ");
        altura= captu.nextDouble();
        
        //pendiente el calculo
        System.out.println("El area del trapecio con bases: " + base + "," + Base + " y altura " + altura + " es: " + calcularArea(Base, base, altura));

    }
    
    public static double calcularArea(double Base, double base, double altura){
    double area = (Base + base)*altura % 2;
    return area;  
    
    }
}   
    
       
