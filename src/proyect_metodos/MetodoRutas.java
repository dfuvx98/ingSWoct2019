package proyect_metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Boleto;
import proyect_clases.Rutas;

public class MetodoRutas {
    
    Vector vPrincipal = new Vector();
    
    //guarda datos en el vector
    public void guardarRutas(Rutas unaRuta) {
        vPrincipal.addElement(unaRuta);
    }
    //guardar archivo txt
    public void guardarArchivoRutas(Rutas rutas){
        try {
            FileWriter fw = new FileWriter ("C:\\Rutas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(rutas.getId_Ruta());
            pw.print("|"+rutas.getNombre_Ruta());
            pw.print("|"+rutas.getOrigen_Ruta());
            pw.print("|"+rutas.getDestino_Ruta());
            pw.print("|"+rutas.getCosto_Ruta());
            pw.print("|"+rutas.getHora_Ruta());
            pw.println("|"+rutas.getFecha_Ruta());
            pw.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //mostrar los datos en el jtable
    public DefaultTableModel listaRutas(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("ID");
        cabeceras.addElement("RUTA");
        cabeceras.addElement("ORIGEN");
        cabeceras.addElement("DESTINO");
        cabeceras.addElement("COSTO");
        cabeceras.addElement("HORA");
        cabeceras.addElement("FECHA");
        //Crear vector con nombre apellido pasajero cedula edad
        DefaultTableModel mdlTablaR = new DefaultTableModel(cabeceras,0);
        try {
            FileReader fr = new FileReader("C:\\Rutas.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer (d,"|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTablaR.addRow(x);
            }
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        return mdlTablaR;
    }
   
    public Vector BuscarRuta(String unaRuta){
        try {
            FileReader fr = new FileReader("C:\\Rutas.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer (d,"|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                    }
                        String a = x.elementAt(1).toString();
                        if(a.equals(unaRuta)){
                            vPrincipal=x;
                            System.out.println(vPrincipal);     
                }
            }br.close();
            fr.close();
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }       
        return vPrincipal;
    }
    
    public void EditarRutas() {
           
        //FALTA
    }
    
    
    public void EliminarRutas() {
           
        //FALTA
    }
    
    
}
