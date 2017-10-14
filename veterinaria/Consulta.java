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
public class Consulta implements Calculable{
    
    private Mascota mascota;
    private int valorChequeo;
    private int valorRemedio;
    private int ValorProcedimiento;

    public Consulta() {
    }

    public Consulta(Mascota mascota, int valorChequeo, int valorRemedio, int ValorProcedimiento) {
        setMascota(mascota);
        setValorChequeo(valorChequeo);
        setValorRemedio(valorRemedio);
        setValorProcedimiento(ValorProcedimiento);
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getValorChequeo() {
        return valorChequeo;
    }

    public void setValorChequeo(int valorChequeo) {
        this.valorChequeo = valorChequeo;
    }

    public int getValorRemedio() {
        return valorRemedio;
    }

    public void setValorRemedio(int valorRemedio) {
        this.valorRemedio = valorRemedio;
    }

    public int getValorProcedimiento() {
        return ValorProcedimiento;
    }

    public void setValorProcedimiento(int ValorProcedimiento) {
        this.ValorProcedimiento = ValorProcedimiento;
    }

    @Override
    public String toString() {
        return "Consulta{" + "mascota=" + mascota + ", valorChequeo=" + valorChequeo + ", valorRemedio=" + valorRemedio + ", ValorProcedimiento=" + ValorProcedimiento + '}';
    }
      @Override
      
      
    public int obtenerTotalCuenta()
    {
        int total=0;
        total=getValorChequeo()+getValorProcedimiento()+getValorRemedio();
        
        total=total+ (int)(total*IVA);
               
        return total;
    }
    
    public int descontar(){
        
        float descuento=0f;
        if(mascota instanceof Perro){//instanceoff permite saber de que tipo es un objeto
        descuento= obtenerTotalCuenta()*DESCUENTO_PERRO;
                }else{
            {
                if(mascota instanceof Pez)
                {
                    descuento=obtenerTotalCuenta()*DESCUENTO_PEZ;
                }
            }
        }
        return (int)descuento;
    }
    public int obtenerTotalFinal(){
        int total=0;
        total=obtenerTotalCuenta()-descontar();
        return total;
    }
}
