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
abstract class Vehiculo extends Terrestre{
    private String placa;

    public Vehiculo() {
    }

    public Vehiculo(String placa) {
        super();
        this.placa = placa;
    }
    

    public String getPlaca() {
        return placa;
    }

    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
