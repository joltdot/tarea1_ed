/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaminera;

/**
 *
 * @author cano_
 */
public class Camion {
    // atributos
    private String marca;
    private String numMotor;
    private String placa;
    
    // métodos default //
    // constructor 
    public Camion(String m, String nm, String p){
        marca = m;
        numMotor = nm;
        placa = p;
    }
    // toString()
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        sb.append("El camión con placa " + placa + " y número de motor " + numMotor + " es de marca " + marca + ".");
        return sb.toString();
    }
    
    // getters //
    // getMarca
    public String getMarca(){
        return marca;
    }
    // getPlaca
    public String getPlaca(){
        return placa;
    }
    
}
