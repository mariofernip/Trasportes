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
public class Transporte {

    
    public static void main(String[] args) {
        
         Vehiculo[] listado = new Vehiculo[3];
        
        //3 elementos hijo
        //imprimir los datos de los 3 hijos
        
        Taxi hijo1 = new Taxi("Cooperativa por defecto ND", "Placa por defecto hbb-000");        
        Autobus hijo2 = new Autobus("Ruta por defecto ND", "Placa por defecto hbb-000");
        Camion hijo3 = new Camion(4, "Placa por defecto hbb-000");
        
        //hijo1.setCooperativa("9 DE OCTUBRE");
        //hijo1.setPlaca("hbb-212");
        //hijo2.setRuta("RIOBAMBA-QUITO");
        //hijo2.setPlaca("hac-452");        
        //hijo3.setNumllantas(18);
        //hijo3.setPlaca("xbb-912");        
        //Mostrar tres hijos 
  
        listado[0] = hijo1;
        listado[1] = hijo2;
        listado[2] = hijo3;        
        
         for (Vehiculo p:listado){                       
            p.imprimirDatos();
             System.out.println("");            
        }
    }
    
}
