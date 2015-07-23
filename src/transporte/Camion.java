/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transporte;

/**
 *
 * @author mario
 */
public class Camion extends Vehiculo{
     
    
     private int numllantas;

     
    public Camion() {
    }

    public Camion(int numllantas,String placa) {
        super(placa);
        this.numllantas = numllantas;
    }
     
     
    @Override 
    public void imprimirDatos(){
        System.out.println("***Datos de Camion***"); 
         System.out.println("Placa número");
        System.out.println(getPlaca());               
        System.out.println("***Numero de llantas***");
        System.out.println(getNumllantas());
    }

   
    public int getNumllantas() {
        return numllantas;
    }

    
    public void setNumllantas(int numllantas) {
        this.numllantas = numllantas;
    }
    
}
