/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresaminera;

public class EmpresaMinera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 0) Almacenar los datos acerca de todos los camiones de la empresa en un solo arreglo
        int numCamiones = 5;
        Camion[] camiones = new Camion[numCamiones];
                                      // marca, numero de motor, placa, capacidad
        camiones[0] = new CamionVolteo("HelloKitty", "HK4010", "666-HD", 666);
        camiones[1] = new CamionVolteo("HelloKitty", "HK6767", "677-HD", 870);
        camiones[2] = new CamionVolteo("MyLittlePony", "MLP7705", "111-PO", 111);
        camiones[3] = new CamionPasajeros("Barbie", "BB2379", "222-BB", 100);
        camiones[4] = new CamionPasajeros("ChicasSuperPoderosas", "SP3099", "444-SP", 99);
        
        // a) imprimir todos los datos de todos los camiones de pasajeros
        System.out.println(infoCamiones(camiones, "Volteo"));
        
        // b) imprimir todos los datos de todos los camiones de volteo
        System.out.println(infoCamiones(camiones, "Pasajeros"));
                
        // c) dada la placa de un camión de volteo, actualizar su capacidad de transporte (el usuario indicará la nueva capacidad)
        String placaParaActualizar = "666-HD";
            // placas de volteo: "666-HD", "111-PO"
            // placas de pasajeros: "222-BB", "444-SP"
        double nuevaCapacidad = 500;
        System.out.println(actualizarCapacidad(camiones, placaParaActualizar, nuevaCapacidad));
        
        // d) calcular e imprimir la cantidad total de camiones de pasajeros que sean de una marca específica (el usuario indicará cuál)
        String marcaParaChecar = "HelloKitty"; // "MyLittlePony", "Barbie", "ChicasSuperPoderosas"
        System.out.println(totalCamionesPorMarca(camiones, marcaParaChecar));
        
        // e) calcular e imprimir la cantidad total de toneladas de tierra que puede ser transportada simultáneamente (por todos los camiones de volteo de la empresa)
        System.out.println(capacidadVolteo(camiones));
    }
    
    
    // a) y b)
    /**
     * 
     * @param c arreglo de camiones
     * @param t tipo de camión escrito en una cadena de caracteres (pasajeros/volteo)
     * @return 
     */
    public static String infoCamiones(Camion[] c, String t) {
        StringBuilder sb = new StringBuilder("");
        String clase=String.format("camion%s",t);
        for(int i = 0; i < c.length; i++) 
            if(c[i].getClass().getSimpleName().equalsIgnoreCase(clase))
                sb.append(c[i]).append("\n");                
        return sb.toString();
    }
    
    // c) 
    /**
     * 
     * @param c arreglo de camiones
     * @param t placa del camión que se desea actualizar en una cadena de caracteres
     * @param nc nueva capacidad del camión en un double
     * @return 
     */
    public static String actualizarCapacidad(
            Camion[] c,
            String p,
            double nc) {
        
        StringBuilder sb = new StringBuilder("");
        
        for(int i = 0; i < c.length; i++){

            if(p.equals(c[i].getPlaca())){

                if(c[i] instanceof CamionVolteo){

                    ((CamionVolteo) c[i]).setCapacidadEnTon(nc);
                    
                    sb.append("Se ha actualizado la capacidad del camion con placa ");
                    sb.append(p);
                    sb.append(". Ahora es de ");
                    sb.append(nc);
                    sb.append(".\n");
                    
                    return sb.toString();
                }
                else{
                    sb.append("La placa provista refiere a un camión que no es de volteo.\n");
                    return sb.toString();
                }
            }
        }
        sb.append("No se encontró ningún camión con esa placa.\n");
        return sb.toString();
    }
    
    // d)
    /**
     * 
     * @param c arreglo de camiones
     * @param t marca de camiones que se desea verificar en una cadena de caracteres
     * @return 
     */
    public static String totalCamionesPorMarca(Camion[] c, String m) {

        int cuenta = 0;

        for (int i = 0; i < c.length; i=i+1) {
            if (m.equals(c[i].getMarca())) {
                cuenta++;
            }
        }
        StringBuilder sb = new StringBuilder("");
        sb.append("La cantidad total de camiones de la marca ");
        sb.append(m);
        sb.append(" es ");
        sb.append(cuenta);
        sb.append(".\n");
        return sb.toString();
    }
    
    // e) 
    /**
     * 
     * @param c arreglo de camiones
     * @return 
     */
    public static String capacidadVolteo(Camion[] c){
        double total = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i] instanceof CamionVolteo){
                total = total + ((CamionVolteo) c[i]).getCapacidadEnTon();
            }
        }
        StringBuilder sb = new StringBuilder("");
        sb.append("La capacidad total de los camiones de volteo es de ");
        sb.append(total);
        sb.append(" toneladas.\n");
        
        return sb.toString();
    }
}
