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
            calcularAreacirculo();
            } else if (opcion==2){
            calcularAreaTriangulo();
            } else if (opcion == 3) {   
            calcularAreaTrapecio();
            }
            
        }while(opcion !=4);

    }
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Selelcciona una opción");
        System.out.println("1. Calcular area de un  Circulo");
        System.out.println("2. Calcular area de un Triangulo");
        System.out.println("3. Calcular area de un Trapecio");
        System.out.println("4. Salir del sistema");
    }
    public static void calcularAreacirculo(){
        Scanner captu = new Scanner(System.in);
        double radio;
        double pi = 3.1416;
        System.out.println("*******CALCULAR AREA DE UN CIRCULO********");
        System.out.println("Captura el radio:");
        radio = captu.nextDouble();
        //pendiente el calculo
        System.out.println("El area del circulo con radio de " + radio + " es: " + calcularCirculo(radio, pi));
    
    }
    public static double calcularCirculo(double radio, double pi ){
        double area = pi * radio * radio;
        return area;
    
    }
    public static void calcularAreaTriangulo() {
        Scanner captu = new Scanner(System.in);
        double base,altura;
        System.out.println("*******CALCULAR AREA DE UN TRIANGULO********");
        System.out.println("Capturar base:");
        base = captu.nextInt();
        System.out.println("Capturar altura: ");
        altura = captu.nextInt();
        
        //pendiente el calculo
        System.out.println("El area de un triangulo con "+ base + altura +  " es: " + calcularTriangulo(base, altura));

    }
    
    public static double calcularTriangulo(double base, double altura){
    double area =(base*altura)/2;
    return area;  
    
    }
    
    public static void calcularAreaTrapecio() {
        Scanner captu = new Scanner(System.in);
        double Base,base,altura;
        System.out.println("*******CALCULAR AREA DE UN TRAPECIO********");
        System.out.println("Capturar base mayor:");
        Base = captu.nextInt();
        System.out.println("Capturar base menor: ");
        base= captu.nextInt();
        System.out.println("Capturar altura: ");
        altura= captu.nextDouble();
        
        //pendiente el calculo
        System.out.println("El area del trapecio con bases: " + base + "," + Base + " y altura " + altura + " es: " + calcularTrapecio(Base, base, altura));

    }
    
    public static double calcularTrapecio(double Base, double base, double altura){
    double area = (Base + base)*altura % 2;
    return area;  
    
    }
}   
    
       
