package POO;

/**
 * @author jdpor
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;
    
    public CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Deposito exitoso de Q" + monto);
        } else {
            System.out.println("El monto debe ser mayor a Q0.00");
        }
    }
    
    public void retirar(double monto){
        if (monto > 0 && monto <= saldo){
            saldo -= monto;
            System.out.println("Retiro exitoso de Q" + monto);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public String getTitular(){
        return titular;
    }
    
}


