package com.yaelvillanueva.mibanco;

/**
 *
 * @author YAEL
 */
public class Usuario {
    
    private String nombre;
    private CuentaBancaria cuenta;
    
    public Usuario(String nombre, double saldoInicial){
        this.nombre= nombre;
        this.cuenta= new CuentaBancaria(saldoInicial);
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public CuentaBancaria getCuenta(){
        return cuenta;
    }
}
