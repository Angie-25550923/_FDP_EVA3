/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author Angie
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1=5, val2=10;
        //1. si necesito guardar el valor de retorno
        int resu = sumarEnteros(val1, val2);//invocar el método
        System.out.println("Suma de 5+10 = " + resu);
        //2.No necesito guardar el valor, un solo uso
        System.out.println("Suma de 5+10 = " + sumarEnteros(val1, val2));
        //3.Solo necesito ejecutar el metodo, no interesa el resultado
        sumarEnteros(val1, val2);
        
    }
    
    //METODO PARA SUMAR DOS ENTEROS
    //llamar a sus metodos usando verbos y escritura camelCase
    //1. Modificador de acceso: public, protected, private, 
    //2.static ---> PARA USAR LOS METODOS DENTRO DEL MAIN
    //3.Valor de retorno: cualquier tipo de dato
    // void --> si no quieren regresar un valor 
    //4. Nombre del método: mismas reglas de identificadores
    //5. Lista de parametros: pueden ser cero o N cantidad
    // 1      2    3       4               5
    public static int sumarEnteros(int num1, int num2){
        int suma = num1 +num2;
        return suma;
        
    }
   
    
    
}
