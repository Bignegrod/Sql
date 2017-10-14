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
public class Pez extends Mascota {
    protected int nroAletas;

    public Pez() {
        super();
    }

    public Pez(int nroAletas, String nroFicha, String nombreMascota, String direccion, int edad) {
        super(nroFicha, nombreMascota, direccion, edad);
        setNroAletas(nroAletas);
    }

    public int getNroAletas() {
        return nroAletas;
    }

    public void setNroAletas(int nroAletas) {
        if(nroAletas>=0 && nroAletas<=10){
        this.nroAletas = nroAletas;
        }else{
            System.out.println("Error numero de aletas incorrecto");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Pez{" + "nroAletas=" + nroAletas + '}';
    }
    
     @Override
     public String datosMascota(){
         
         return "Pez "+super.getNombreMascota()+" "+super.getEdad() + " "+ super.edad+" Años";
     }
    
}
