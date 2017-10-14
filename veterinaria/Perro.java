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
public class Perro extends Mascota{
    
    protected boolean vacunas;
    protected String raza;

    public Perro() {
    }

    

    public Perro(boolean vacunas, String raza, String nroFicha, String nombreMascota, String direccion, int edad) {
        super(nroFicha, nombreMascota, direccion, edad);
        setVacunas(vacunas);
        setRaza(raza);
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "vacunas=" + vacunas + ", raza=" + raza + '}';
    }

 
     @Override
     public String datosMascota(){
         //tipo mascota nombre edad años raza
         return "Perro"+super.getNombreMascota()+" "+super.getEdad()+" Años "+ getRaza() ;
     }
    
}
