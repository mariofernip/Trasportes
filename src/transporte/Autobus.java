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
public class Autobus extends Vehiculo{

    private String ruta;

    public Autobus() {
    }
    
    public Autobus(String ruta,String placa) {
        super(placa);        
        this.ruta = ruta;
    }
        
     @Override
    public void imprimirDatos(){
       System.out.println("***Datos de Autobus***");
        System.out.println("Placa número");
        System.out.println(getPlaca());               
        System.out.println("***Ruta del Autobus***");
       System.out.println(getRuta());
    }

   
    public String getRuta() {
        return ruta;
    }

    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
