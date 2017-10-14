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
public interface Calculable {
    
    public static final float IVA=0.19f;
    public static final float DESCUENTO_PERRO=0.1f;
    public static final float DESCUENTO_PEZ=0.2f;
    
    public int obtenerTotalCuenta();
    public int descontar();
    public  int obtenerFinal();
    
}
