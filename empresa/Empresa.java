/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author duoc
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Marca mac1= new Marca("MSI",1);
        Notebook note=new Notebook(3,true,123456,21,250000,2000,false,mac1);
        Tablet tab1=new Tablet("lapiz1",11,4,2000000,10,true,mac1);
        int precioNote=note.precioFinal(2);
        System.out.println("Precio notebook: "+note.precioFinal(2));
        System.out.println("Precio tablet: "+tab1.precioFinal(2));
        System.out.println("Rebajar Stock tablet: "+tab1.rebajarStock(2));
        
        Producto prod=new Producto();
        prod.guardadProducto(note);
        prod.guardadProducto(tab1);
        
        prod.listarProducto();
        System.out.println("cantidad computador touch: "+prod.cantidadTouch());
        System.out.println("-----------------");
        prod.eliminarCompu(123456);
        System.out.println("---------------------");
        prod.listarProducto();
        
    }
    
}
