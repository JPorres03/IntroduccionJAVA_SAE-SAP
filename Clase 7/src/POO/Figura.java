package POO;

/**
 * @author jdpor
 */

public abstract class Figura {
 
    protected String color;
    
    public Figura (String color){
        this.color = color;
    }
    
    public abstract double calcularArea();
    
    public void mostrarColor(){
        System.out.println("Color de la figura: " + color);
    }
    
}
