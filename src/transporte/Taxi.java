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

    public Taxi() {
    }

    public Taxi(String cooperativa) {
        super();
        this.cooperativa = cooperativa;
    }
    
    private String cooperativa;
    
     @Override
    public void imprimirDatos(){
    System.out.println("Datos de Taxi");       
        System.out.println(getCooperativa());
    }

    
    public String getCooperativa() {
        return cooperativa;
    }

    /**
     * @param cooperativa the cooperativa to set
     */
    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }
}
