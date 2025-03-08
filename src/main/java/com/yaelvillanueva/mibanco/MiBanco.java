package com.yaelvillanueva.mibanco;

/**
 *
 * @author YAEL
 */
public class MiBanco {

    public static void main(String[] args) {
        
        //Primer usuario
        Usuario usuario = new Usuario("Alfonso",50000);
        CajeroAutomatico cajero = new CajeroAutomatico();
        cajero.consultarSaldo(usuario);
        cajero.depositar(usuario, 500);
        cajero.retirar(usuario,3000);
        cajero.retirar(usuario, 100000);
        
        //Segundo usuario
        Usuario usuario2 = new Usuario("Yael",1000000);
        CajeroAutomatico cajero2= new CajeroAutomatico();
        cajero2.consultarSaldo(usuario2);
        cajero2.depositar(usuario2, 23500);
        cajero2.retirar(usuario2, 210460);
        
        //Tercer usuario
        Usuario usuario3 = new Usuario("Johana",202300);
        CajeroAutomatico cajero3 = new CajeroAutomatico();
        cajero3.consultarSaldo(usuario3);
        cajero3.depositar(usuario3, 210823);
        cajero3.retirar(usuario3, 240923);
    }
}
