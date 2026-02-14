/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaminera;

/**
 *
 * @author cano_
 */
public class CamionVolteo extends Camion {
    double capacidadEnTon;
    
    // métodos default // 
    // constructor
    public CamionVolteo(String m, String nm, String p, double c){
        super(m, nm, p);
        capacidadEnTon = c; // por qué no se puede inicializar y asignar valor aquí?
    }
    
    // toString
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        sb.append(super.toString() + " Tiene una capacidad de carga de " + capacidadEnTon + ".");
        return sb.toString();
    }
    
    // getters //
    public double getCapacidadEnTon(){
        return capacidadEnTon;
    }
    // setters //
    public void setCapacidadEnTon(double nuevaCapacidad){
        capacidadEnTon = nuevaCapacidad;
    }
}
