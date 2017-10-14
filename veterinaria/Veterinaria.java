/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author duoc
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Perro dog1=new Perro(true,"chiguagua","123456","Misifu","Las maravillas",15);
        Pez pescado=new Pez(4,"14526","DORI","Fondo de vikini",4);
        
        Consulta son1 =new Consulta(pescado, 5000, 20000, 80000);
        Consulta con2 = new Consulta(dog1, 15000, 8000, 0);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Cuenta total del pescaoh"+son1.obtenerTotalCuenta());
        System.out.println("Descuento: "+son1.descontar());
        System.out.println("Total a pagar: "+son1.obtenerFinal());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Cuenta total del pescaoh"+con2.obtenerTotalCuenta());
        System.out.println("Descuento: "+con2.descontar());
        System.out.println("Total a pagar: "+con2.obtenerFinal());
    }
    
}
