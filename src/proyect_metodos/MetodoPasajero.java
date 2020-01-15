
package proyect_metodos;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Pasajero;

public class MetodoPasajero {
    
    Vector vPrincipal = new Vector();
        
    //guarda datos en el vector
    public void guardarPasajero(Pasajero unPasajero) {
        vPrincipal.addElement(unPasajero);
    }
    
    //guardar archivo txt
    public void guardarArchivoPasajero(Pasajero pasajero){
        
        try {
            FileWriter fw = new FileWriter (".\\Pasajero.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(pasajero.getNombre_pasajero());
            pw.print("|"+pasajero.getApellido_pasajero());
            pw.print("|"+pasajero.getTipo_pasajero());
            pw.print("|"+pasajero.getCedula_pasajero());
            pw.println("|"+pasajero.getEdad_pasajero());
            pw.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
    }
    
    //mostrar los datos en el jtable
    public DefaultTableModel listaPasajero(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("NOMBRE");
        cabeceras.addElement("APELLIDO");
        cabeceras.addElement("CATEGORIA");
        cabeceras.addElement("CEDULA");
        cabeceras.addElement("EDAD");
        
        //Crear vector con nombre apellido pasajero cedula edad
        DefaultTableModel mdlTablaP = new DefaultTableModel(cabeceras,0);
        try {
     
            FileReader fr = new FileReader(".\\Pasajero.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;

            while ((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer (d,"|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTablaP.addRow(x);
            }
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
        return mdlTablaP;
    }
    //-------------------------------------------//
  
    public Vector BuscarPasajero(String cedulaP){
        try {
            FileReader fr = new FileReader(".\\Pasajero.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer (d,"|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                    }
                        String a = x.elementAt(3).toString();
                        if(a.equals(cedulaP)){
                            
                            vPrincipal=x;
                            System.out.println(vPrincipal);     
                }
            }br.close();
            fr.close();
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }       
        return vPrincipal;
    }
    
    public Vector EditaPasajero(Pasajero pasajero) {
        try {
            String cedulaP = Integer.toString(pasajero.getCedula_pasajero());
            String linea;

            File archivo = new File(".\\pasajero.txt");
            BufferedReader bReader = new BufferedReader(new FileReader(archivo));

            FileWriter fw = new FileWriter(".\\pasajero.txt", true);
            BufferedWriter bWriter = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bWriter);
            
            //archivo temporal
            File temparchivo = new File(".\\temp-pasajero.txt");
            FileWriter tempfw = new FileWriter(".\\temp-pasajero.txt");
            BufferedWriter tempbWriter = new BufferedWriter(tempfw);
            PrintWriter temppw = new PrintWriter(tempbWriter);

            while ((linea = bReader.readLine()) != null) {
                System.out.println(linea);
                StringTokenizer dato = new StringTokenizer(linea, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                String a = x.elementAt(3).toString();
                if (a.equals(cedulaP)) {
                    temppw.print(pasajero.getNombre_pasajero());
                    temppw.print("|" + pasajero.getApellido_pasajero());
                    temppw.print("|" + pasajero.getTipo_pasajero());
                    temppw.print("|" + pasajero.getCedula_pasajero());
                    temppw.println("|" + pasajero.getEdad_pasajero());
                    continue;
                }
                temppw.println(linea);
            }
            
            bWriter.close();
            pw.close();
            bReader.close();
            tempbWriter.close();
            temppw.close();
            fw.close();
            
            //eliminar archivo y renombrar archivo temporal
            archivo.delete();
            boolean correcto = temparchivo.renameTo(archivo);
            if (correcto) {
                System.out.println("done!");
            } else {
                System.out.println("nope");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
        return vPrincipal;
    }
    
    public Vector EliminarPasajero(String CedulaP) {

        try {
            String cedulaP = CedulaP;
            String linea;

            File archivo = new File(".\\pasajero.txt");
            BufferedReader bReader = new BufferedReader(new FileReader(archivo));

            FileWriter fw = new FileWriter(".\\pasajero.txt", true);
            BufferedWriter bWriter = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bWriter);

            //archivo temporal
            File temparchivo = new File(".\\temp-pasajero.txt");
            FileWriter tempfw = new FileWriter(".\\temp-pasajero.txt");
            BufferedWriter tempbWriter = new BufferedWriter(tempfw);
            PrintWriter temppw = new PrintWriter(tempbWriter);

            while ((linea = bReader.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(linea, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                String a = x.elementAt(3).toString();
                if (a.equals(cedulaP)) {
                    continue;
                }
                temppw.println(linea);
            }
            
            bWriter.close();
            pw.close();
            bReader.close();
            tempbWriter.close();
            temppw.close();
            fw.close();
            
            //eliminar archivo y renombrar archivo temporal
            archivo.delete();
            boolean correcto = temparchivo.renameTo(archivo);
            if (correcto) {
                System.out.println("done!");
            } else {
                System.out.println("nope");
            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
        return vPrincipal;

    }
}