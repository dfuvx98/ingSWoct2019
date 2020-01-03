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
    
      public void EditarRutas() {
           
        //FALTA
    }
    
    
    public void EliminarRutas() {
           
        //FALTA
    }
  
}


