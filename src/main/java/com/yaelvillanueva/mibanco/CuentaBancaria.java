package com.yaelvillanueva.mibanco;

/**
 *
 * @author YAEL
 */
public class CuentaBancaria {
    
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public void depositar(double cantidad){
        if(cantidad>0){
            saldo+=cantidad;
            System.out.println("Deposito exitoso. El nuevo saldo es: $" + saldo);
        }
    else {
            System.out.println("La cantidad a depositar debe ser mayor a cero");
}
    }
    
    public boolean retirar(double cantidad){
        if (cantidad>0 && cantidad<=saldo){
          saldo-=cantidad;
            System.out.println("Retiro exitoso. El saldo actual es: $" + saldo);
            return true;
        } else {
            System.out.println("Fondos insuficientes o cantidad no valida");
                    return false;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
}
