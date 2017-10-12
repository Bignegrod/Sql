/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author duoc
 */
public class Producto {
    private static final ArrayList<Computador> listaProducto=new ArrayList();
    
    public Producto(){
        
    }
    
    public boolean guardadProducto(Computador compu)
    {
        for(Computador pc:listaProducto){
            if(pc.getCodigo()== compu.getCodigo())
            {
                System.out.println("Ya existe el computador con ese codigo");
                return false;
                
            }
        }
         listaProducto.add(compu);
         System.out.println("Computador agregado!!");
         return true;
    }
    public void listarProducto()
    {
        for(Computador listar:listaProducto){
            System.out.println(listar);
        }
    }    
    
    public boolean eliminarCompu(int codigo)
    {
        for(Computador eliminar:listaProducto)
        {
            if(eliminar.getCodigo()==codigo)
            {
                listaProducto.remove(eliminar);
                System.out.println("Computador Eliminado");
                return true;
                
            }
        }
        return false;
    }
    
    public int cantidadTouch()
    {
        int cantidad=0;
        for(Computador touch:listaProducto)
        {
            if(touch.isTouch())
            {
                cantidad++;
            }
        }
        return cantidad;
    }
}
