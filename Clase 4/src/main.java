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
        //clase2();
        // -------------------------------------------------------------- //
        
        // ----------------------- CLASE NUMERO 3 ----------------------- //
        //clase3();
        // -------------------------------------------------------------- //
        
        // ----------------------- CLASE NUMERO 4 ----------------------- //
        clase4();
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
    
    
    public static void clase3(){
        System.out.println("------------------------------------ INSTRUCCIONES CICLICAS ------------------------------------");
        
        System.out.println("------------------------------------ CICLO FOR ------------------------------------");
        // Ciclo for: inicia en 1, sigue mientras i sea menor o igual a 5, y aumenta i en cada vuelta.
        for (int i = 1; i <= 5; i++) {
            // Imprime el valor actual de i en cada iteracion.
            System.out.println(i);
        }

        // Variable acumuladora para guardar la suma de los numeros del 1 al 10.
        int suma = 0;
        // Ciclo for que recorre del 1 al 10 para ir agregando cada numero a la suma.
        for (int i = 1; i <= 10; i++) {
            // Suma el valor actual de i al total acumulado.
            suma += i;
        }

        System.out.println("Suma de los primeros 10 numeros: " + suma);


        System.out.println("------------------------------------ WHILE ------------------------------------");
        // Variable que controla cuantas veces se repetira el ciclo while.
        int contador = 1;
        // While: evalua la condicion antes de ejecutar el bloque.
        while (contador <= 5) {
            // Imprime el valor actual del contador.
            System.out.println(contador);
            // Aumenta el contador para evitar un ciclo infinito.
            contador++;
        }


        System.out.println("------------------------------------ DO WHILE ------------------------------------");
        // Variable que controla el ciclo do-while.
        int numero = 1;
        // Do-while: ejecuta primero el bloque y despues revisa la condicion.
        do {
            // Imprime el numero actual y muestra que el bloque corre al menos una vez.
            System.out.println("Se ejecuta al menos una vez: " + numero);
            // Incrementa el numero para que el ciclo avance.
            numero++;
        // Mientras numero sea menor o igual a 3, el ciclo se repite.
        } while (numero <= 3);


        System.out.println("------------------------------------ BREAK Y CONTINUE ------------------------------------");

        System.out.print("Numeros del 0 al 9 usando break: ");
        // Ciclo for que recorre del 0 al 9.
        for (int i = 0; i < 10; i++) {
            // Si i llega a 5, break detiene el ciclo por completo.
            if (i == 5) {
                break;
            }
            // Imprime los valores antes de que el ciclo se rompa.
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Numeros impares usando continue: ");
        // Otro ciclo for que recorre del 0 al 9.
        for (int i = 0; i < 10; i++) {
            // Si i es par, continue salta esa vuelta y pasa a la siguiente.
            if (i % 2 == 0) {
                continue;
            }
            // Imprime solo los numeros impares.
            System.out.print(i + " ");
        }


        System.out.println();

        System.out.println("------------------------------------ CICLOS ANIDADOS ------------------------------------");
        // Ciclo externo: controla la fila o el primer numero de la multiplicacion.
        for (int i = 1; i <= 3; i++) {
            // Ciclo interno: se ejecuta completo en cada vuelta del ciclo externo.
            for (int j = 1; j <= 3; j++) {
                // Imprime la tabla de multiplicar en formato i x j = resultado.
                System.out.print(i + "x" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }


        System.out.println("------------------------------------ EJEMPLO DO WHILE CON MENU ------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        // El menu se mostrara al menos una vez y se repetira hasta elegir salir.
        do {
            // Opcion 1 del menu.
            System.out.println("1. Volver a mostrar ciclos");
            // Opcion 2 del menu.
            System.out.println("2. Salir");
            // Pide al usuario que escriba una opcion.
            System.out.print("Elige una opcion: ");
            // Lee la opcion ingresada por teclado.
            opcion = scanner.nextInt();

            // Si el usuario elige 1, se muestra un mensaje.
            if (opcion == 1) {
                System.out.println("Ya se mostraron los ciclos.");
            // Si el usuario elige 2, se muestra un mensaje de salida.
            } else if (opcion == 2) {
                System.out.println("Has elegido salir.");
            // Cualquier otro valor se considera invalido.
            } else {
                System.out.println("No se reconoce la opcion.");
            }
        // El ciclo se repite mientras la opcion sea distinta de 2.
        } while (opcion != 2);
        
    }
    
    
    public static void clase4(){
        /*
        System.out.println("------------------------------------ VECTORES ------------------------------------");
        
        
        System.out.println("------------------------------------ EJEMPLO 1 ------------------------------------");
        String [] frutas = {"mango", "kiwi", "pera", "uva", "melon"};
        String busqueda = "mango";
        
        boolean encontrado = false;
        
        int posicion = -1; 
        
        for (int i =0;  i < frutas.length; i++){
            if(frutas[i].equals(busqueda)){
                encontrado = true;
                posicion = i;
                break;        
            }
        }
        
        if (encontrado){
            System.out.println("La fruta se encontro en la poscion: " + posicion);
        }else{
            System.out.println("La fruta NO se encontro");
        }
        
        
        System.out.println("------------------------------------ EJEMPLO 2 ------------------------------------");
                
        int [] notas = {85,92,78,95,88};
        int suma = 0, maximo = notas[0];
        
        for (int nota: notas){
            suma += nota;
            if (nota > maximo)maximo = nota;
        }
        
        double promedio = (double)suma/notas.length;
        
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota maxima: " + maximo);
        
        System.out.println("------------------------------------ EJEMPLO 3 ------------------------------------");
        
        int [] nums = new int[]{10, 20, 30, 40, 50}; // Creamos un vector de numeros
        
        for (int i = 0; i < nums.length; i++) { // Recorremos el vector de forma normal
            System.out.println("La posicion: " + i + " es igual a: " + nums[i]);
        }
        
        System.out.println("---------------For en reversa--------------------");
        for (int i = nums.length - 1; i >= 0; i--) { // Recorremos el vector al reves
            System.out.println("La posicion: " + i + " es igual a: " + nums[i]);
        }
        
        System.out.println("----------------Con For Each------------------");
        for(int numero : nums){ // Recorremos el vector con for each
            System.out.println("numero es: " + numero);
        }*/
        
        
        System.out.println("------------------------------------ MATRICES ------------------------------------");
        
        System.out.println("------------------------------------ EJEMPLO 1 ------------------------------------");
        int [][] ventas = {
            {200, 350, 150},
            {400, 220, 310},
            {180, 500, 270}
        };
        
        for (int i=0; i < ventas.length; i++){
            int sumaSemana = 0;
            for (int j=0; j < ventas[0].length; j++){
                sumaSemana += ventas[i][j];
            }
            System.out.println("Semana " + (i + 1) + ": " + sumaSemana);
        }
        
        System.out.println("------------------------------------ EJEMPLO 2 ------------------------------------");
        
        int [][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("/////// FOR ////////");
        
        for (int i= 0; i <mat.length; i++){
            for(int j = 0; j <mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("/////// FOR EACH ////////");
        
        for (int [] fila : mat){
            for(int valor : fila){
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    
}
