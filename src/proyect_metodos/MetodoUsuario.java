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
import proyect_clases.Usuario;

public class MetodoUsuario {
    
    Vector vUsuario = new Vector();
    Vector v1 = new Vector();

    public void guardarUsuario(Usuario unUsuario) {
        vUsuario.addElement(unUsuario);
    }

    public void guardarArchivoUsuario(Usuario usuario){
        try {
            FileWriter fw = new FileWriter (".\\Usuario.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(usuario.getId_usuario());
            pw.print("|"+usuario.getNombre_usuario());
            pw.print("|"+usuario.getApellido_usuario());
            pw.print("|"+usuario.getUsarname());
            pw.println("|"+usuario.getPassword());
            bw.close();
            pw.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel listaUsuario(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("ID");
        cabeceras.addElement("NOMBRE");
        cabeceras.addElement("APELLIDO");
        cabeceras.addElement("USER");
        cabeceras.addElement("PASSWORD");
        //Crear vector con nombre apellido pasajero cedula edad
        DefaultTableModel mdlTablaU = new DefaultTableModel(cabeceras,0);
        try {
            FileReader fr = new FileReader(".\\Usuario.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer (d,"|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTablaU.addRow(x);
            }
            br.close();
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        return mdlTablaU;
    }
   
    public Vector BuscarUsuario(String unIdUser){
        try {
            FileReader fr = new FileReader(".\\Usuario.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer (d,"|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                    }
                        String a = x.elementAt(0).toString();
                        if(a.equals(unIdUser)){
                            v1=x;
                            System.out.println(v1);     
                }
            }br.close();
            fr.close();
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }       
        return v1;
    }
    
     public Vector EditarUsuario(Usuario usuario) {
        try {
            String id = Integer.toString(usuario.getId_usuario());
            String linea;

            File archivo = new File(".\\usuario.txt");
            BufferedReader bReader = new BufferedReader(new FileReader(archivo));

            FileWriter fw = new FileWriter(".\\usuario.txt", true);
            BufferedWriter bWriter = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bWriter);

            //archivo temporal
            File temparchivo = new File(".\\temp-usuario.txt");
            FileWriter tempfw = new FileWriter(".\\temp-usuario.txt");
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
                    temppw.print(usuario.getId_usuario());
                    temppw.print("|" + usuario.getNombre_usuario());
                    temppw.print("|" + usuario.getApellido_usuario());
                    temppw.print("|" + usuario.getUsarname());
                    temppw.println("|" + usuario.getPassword());
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
        return v1;
    }
    
    
    public Vector EliminarUsuario(String Id) {

        try {
            String id = Id;
            String linea;

            File archivo = new File(".\\usuario.txt");
            BufferedReader bReader = new BufferedReader(new FileReader(archivo));

            FileWriter fw = new FileWriter(".\\usuario.txt", true);
            BufferedWriter bWriter = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bWriter);

            //archivo temporal
            File temparchivo = new File(".\\temp-usuario.txt");
            FileWriter tempfw = new FileWriter(".\\temp-usuario.txt");
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
        return v1;

    }
  
}


