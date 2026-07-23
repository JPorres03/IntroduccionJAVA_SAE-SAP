/**
 * @author jdpor
 */

public class main { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Esta va ser una funcion principal
        
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
    
}
