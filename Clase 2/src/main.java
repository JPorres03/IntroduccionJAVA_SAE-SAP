/**
 * @author jdpor
 */

import java.util.Scanner;

public class main { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ----------------------- CLASE NUMERO 1 ----------------------- //
        //clase1();
        // -------------------------------------------------------------- //
        
        // ----------------------- CLASE NUMERO 2 ----------------------- //
        clase2();
        // -------------------------------------------------------------- //
        
    }
    
    public static void clase1(){
    
        int edad = 45;
        double estatura = 1.75;
        String nombre = "Josue Porres";
        char genero = 'M';
        
        //System.out.println("Hola a todos!");
        
        System.out.println("-----------------------------------");
        System.out.println("Hola mi nombre es: " + nombre);
        System.out.println("Tengo la edad de: " + edad + " anios");
        System.out.println("Tengo una estatura de: " + estatura + " m");
        System.out.println("Soy de genero: " + genero);
        System.out.println("-----------------------------------");
        
        System.out.println("AREA DE UN TRIANGULO");
        double altura = 10;
        double base = 8;
        
        double areaTriangulo = (base * altura)/2;   // Aca se realiza una multiplicacion y una division
        
        System.out.println("El area del triangulo es de: " + areaTriangulo);
        
    }
    
    public static void clase2(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if(edad >= 18){
            System.out.println("Puede ingresar");
        }else{
            System.out.println("Acceso denegado");
        }
        
        /*  Conectores logicos
            !      not (niega o invierte el resultado de una condicion) !true = false
            !a = b
            !true = false 
            !false = true
            
            &&     and (la todas sus condiciones deben ser true para que devuelva un true)
            a && b = c
            true && true = true
            false && true = false
            false && true = false 
            false && fasle = false
            
            ||  or (para que sea true el resultado, debe de haber al menos un true entre sus condiciones)
            
            a || b = c
            true || true = true
            true || false = true
            false || true = true
            false || false = false 
            
        */
        
        
        int edad1 = 23;
        double estatura = 1.75;
        
        System.out.println("------------------------------------ INSTRUCIONES IF ------------------------------------ ");
        
        // AND ambas condiciones se cumplen
        if ((edad1 >= 18 ) && (estatura > 1.70)){
            System.out.println(" Eres MAYOR de edad Y mides MAS de 1.70");
        }else if ((edad1 < 18) && (estatura < 1.70) ){
            System.out.println(" Eres MENOR de edad Y mides MENOS de 1.70 ");
            
        // OR una de las dos condiciones se cumplen
        } else if ((edad1 >= 18) || (estatura > 1.70) ) {
            System.out.println(" Eres MAYOR de edad O mides MAS de 1.70");
            
        // NOT cambia de sentido    
        } else if (!(edad1 >= 18)){
            System.out.println(" NO eres mayor de edad");
            
        // NOT se combina con un AND    
        } else if (!(estatura > 1.70) && (edad1 >= 18)){
            System.out.println("Eres mayor de edad pero NO mides mas de 1.70");
            
        } else {
            System.out.println("No se cumple ninguna de las condiciones");
        }
        
       
        System.out.println("------------------------------------ INSTRUCIONES SWITCH ------------------------------------ ");
        
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Ingrese su opcion: ");
        int opciones = sc1.nextInt();

        
        switch (opciones){ 
            case 1:
                System.out.println("Selecciono opcion 1");
                break;
            case 2:
                System.out.println("Selecciono opcion 2");
                break;
            case 3:
                System.out.println("Selecciono opcion 3");
                break;
            default:
                System.out.println("NO SELECCIONO NINGUNA OPCION CORRECTA");
                clase2();
        
        }
        
    }
    
}
