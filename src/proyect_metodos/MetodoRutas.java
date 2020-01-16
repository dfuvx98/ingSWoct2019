package proyect_metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
            FileWriter fw = new FileWriter (".\\Rutas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(rutas.getId_Ruta());
            pw.print("|"+rutas.getNombre_Ruta());
            pw.print("|"+rutas.getOrigen_Ruta());
            pw.print("|"+rutas.getDestino_Ruta());
            pw.print("|"+rutas.getCosto_Ruta());
            pw.print("|"+rutas.getHora_Ruta());
            pw.println("|"+rutas.getFecha_Ruta());
            bw.close();
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
            FileReader fr = new FileReader(".\\Rutas.txt");
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
            fr.close();
            br.close();
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        return mdlTablaR;
    }
   
    public Vector BuscarRuta(String unaRuta){
        try {
            FileReader fr = new FileReader(".\\Rutas.txt");
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
    
  public Vector EditarRutas(Rutas rutas) {
        try {
            String id = Integer.toString(rutas.getId_Ruta());
            String linea;

            File archivo = new File(".\\rutas.txt");
            BufferedReader bReader = new BufferedReader(new FileReader(archivo));

            FileWriter fw = new FileWriter(".\\rutas.txt", true);
            BufferedWriter bWriter = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bWriter);

            //archivo temporal
            File temparchivo = new File(".\\temp-rutas.txt");
            FileWriter tempfw = new FileWriter(".\\temp-rutas.txt");
            BufferedWriter tempbWriter = new BufferedWriter(tempfw);
            PrintWriter temppw = new PrintWriter(tempbWriter);

            while ((linea = bReader.readLine()) != null) {
                System.out.println(linea);
                StringTokenizer dato = new StringTokenizer(linea, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                String a = x.elementAt(0).toString();
                if (a.equals(id)) {
                    temppw.print(rutas.getId_Ruta());
                    temppw.print("|" + rutas.getNombre_Ruta());
                    temppw.print("|" + rutas.getOrigen_Ruta());
                    temppw.print("|" + rutas.getDestino_Ruta());
                    temppw.print("|" + rutas.getCosto_Ruta());
                    temppw.print("|" + rutas.getHora_Ruta());
                    temppw.println("|" + rutas.getFecha_Ruta());
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
    
    
    public Vector EliminarRutas(String Id) {
        try {
            String id = Id;
            String linea;

            File archivo = new File(".\\rutas.txt");
            BufferedReader bReader = new BufferedReader(new FileReader(archivo));

            FileWriter fw = new FileWriter(".\\rutas.txt", true);
            BufferedWriter bWriter = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bWriter);

            //archivo temporal
            File temparchivo = new File(".\\temp-rutas.txt");
            FileWriter tempfw = new FileWriter(".\\temp-rutas.txt");
            BufferedWriter tempbWriter = new BufferedWriter(tempfw);
            PrintWriter temppw = new PrintWriter(tempbWriter);

            while ((linea = bReader.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(linea, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                String a = x.elementAt(0).toString();
                if (a.equals(id)) {
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
