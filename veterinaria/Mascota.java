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
public abstract class  Mascota  {
    
    protected String nroFicha;
    protected String nombreMascota;
    protected String direccion;
    protected int edad;

    public Mascota() {
    }

    public Mascota(String nroFicha, String nombreMascota, String direccion, int edad) {
        setNroFicha(nroFicha);
        setNombreMascota(nombreMascota);
        setDireccion(direccion);
        setEdad(edad);
      
    }

    public String getNroFicha() {
        return nroFicha;
    }

    public void setNroFicha(String nroFicha) {
        this.nroFicha = nroFicha;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        if(nombreMascota !=null){
        this.nombreMascota = nombreMascota;
        }else{
            System.out.println("Ingrese un nombre");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>0){
        this.edad = edad;
        }else{
            System.out.println("Error: Edad invalida");
        }
    }

    @Override
    public String toString() {
        return "Mascota{" + "nroFicha=" + nroFicha + ", nombreMascota=" + nombreMascota + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
    public abstract String datosMascota();
    
    

    
}
