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
public class Taxi extends Vehiculo{

    private String cooperativa;
    
    public Taxi() {
    }

    public Taxi(String cooperativa, String placa) {
        super(placa);
        this.cooperativa = cooperativa;
    }
    
    
    
     
    
    @Override
    public void imprimirDatos(){
        System.out.println("***Datos de Taxi***");        
        System.out.println("Placa número");
        System.out.println(getPlaca());               
        System.out.println("***Nombre de la Cooperativa***");
        System.out.println(getCooperativa());
    }

    
    public String getCooperativa() {
        return cooperativa;
    }

    
    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }
}
