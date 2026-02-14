/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaminera;

/**
 *
 * @author cano_
 */
public class CamionPasajeros extends Camion {
    int capacidadDePasajeros;
    
    // métodos default // 
    // constructor
    public CamionPasajeros(String m, String nm, String p, int c){
        super(m, nm, p);
        capacidadDePasajeros = c;
    }
    // toString
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        sb.append(super.toString() + " Tiene una capacidad de pasajeros de " + capacidadDePasajeros + ".");
        return sb.toString();
    }
}
