/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.util.ArrayList;

/**
 *
 * @author duoc
 */
public class RegistroMascota {
    
    private static final ArrayList<Mascota>pets=new ArrayList();

    public RegistroMascota() {
    }
    
    public boolean guardadPet(Mascota mas){
        for(Mascota guardar:pets){
            if(guardar.getNroFicha().equals(mas.getNroFicha()))
            {
                System.out.println("Numero de ficha ya registrado");
                return false;
                
            }
        }
        pets.add(mas);
        System.out.println("Mascotta Agregada");
        return true;
    }
    
    
    public boolean buscarPet(String numeroFicha)
    {
        for(Mascota buscar:pets){
            if(buscar.getNroFicha().equals(numeroFicha))
            {
                System.out.println("Masconta Encontrada");
                return true;
            }
        }
        System.out.println("Mascota no encontrada");
        return false;
    }
    public void listaPet()
    {
        for(Mascota lista:pets)
        {
            System.out.println(lista.toString());
        }
    }
    public boolean eliminarPet(String numeroFicha){
        for(Mascota eliminar:pets){
            if(eliminar.getNroFicha().equals(numeroFicha))
            {
                pets.remove(eliminar);
                System.out.println("Registro eliminado");
                return true;
            }
        }
        return false;
    }
    public int mascotasAnciana(){
        int cantidad=0;
        for(Mascota viejo:pets)
        {
        if(viejo instanceof Perro && viejo.getEdad()>10){
            cantidad++;
        }
    }
    
    return cantidad;
    }
}
