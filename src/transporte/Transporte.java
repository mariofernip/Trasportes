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
        // TODO code application logic here
        
         Vehiculo[] listado = new Vehiculo[3];
        
        //3 elementos hijo
        //imprimir los datos de los 3 hijos
        
        Taxi hijo1 = new Taxi();
        //Hijo hijo2 = new Hijo();
        Autobus hijo2 = new Autobus();
        Camion hijo3 = new Camion();
        
        hijo1.setCooperativa("9 DE OCTUBRE");
                
        hijo2.setRuta("RIOBAMBA-QUITO");
        
        hijo3.setNumllantas(18);
        
        //Mostrar tres hijos 
        
        //BOXING UNBOXING
        
//         Padre objPadre;
//         objPadre = hijo1;        
//         Padre objPadre2;
//         objPadre2 = hijo2;
//         Padre objPadre3;
//         objPadre3 = hijo3;
//         
//        Hijo objHijo1 = (Hijo)objPadre;
//        objHijo1.imprimirDatos();
//         Hijo objHijo2 = (Hijo)objPadre2;
//        objHijo2.imprimirDatos(); 
//        Hijo objHijo3 = (Hijo)objPadre3;
//        objHijo3.imprimirDatos();
        //objPadre.imprimirDatos();
        
       
        listado[0] = hijo1;
        listado[1] = hijo2;
        listado[2] = hijo3;
        
        
         for (Vehiculo p:listado){
                       
            p.imprimirDatos();
            
        }
    }
    
}
