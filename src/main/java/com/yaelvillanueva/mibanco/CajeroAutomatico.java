package com.yaelvillanueva.mibanco;

/**
 *
 * @author YAEL
 */
public class CajeroAutomatico {
    
    public void consultarSaldo(Usuario usuario){
        System.out.println("** Salgo actual de " + usuario.getNombre() + " es de: $ " + usuario.getCuenta().getSaldo() + "**");
    }
    
    public void depositar(Usuario usuario, double cantidad){
        usuario.getCuenta().depositar(cantidad);
    }
    
    public void retirar(Usuario usuario, double cantidad){
        usuario.getCuenta().retirar(cantidad);
    }
}
