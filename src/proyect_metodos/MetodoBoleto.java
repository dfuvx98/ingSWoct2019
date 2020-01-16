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
import proyect_clases.Pasajero;
import proyect_clases.Usuario;
import proyect_gui.GUI_Principal;

public class MetodoBoleto {
    Vector vPrincipal = new Vector();
    
    public void crearBoleto(Boleto unBoleto) {
        
        //FALTA
        
    }
    
    public void guardarBoleto(Boleto unBoleto) {
        vPrincipal.addElement(unBoleto);
    }
    
    //guardar archivo txt
    public void guardarArchivoBoleto(Boleto boleto){
        try {
            FileWriter fw = new FileWriter(".\\boletos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(boleto.getNumero_boleto());
            pw.print("|" + boleto.getCedula_pasajero());
            pw.print("|" + boleto.getId_ruta());
            pw.print("|" + boleto.getCosto_boleto());
            pw.print("|" + boleto.getFecha_boleto());
            pw.print("|" + boleto.getHora_boleto());
            bw.close();
            pw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //FALTA
        
    }

    public void BuscarBoleto(Usuario unUsuario){
      
        //FALTA
        
    }
    public DefaultTableModel listaBoletos() {
        Vector vCabeceras = new Vector();
        vCabeceras.addElement("BOLETO");
        vCabeceras.addElement("PASAJERO");
        vCabeceras.addElement("RUTA");
        vCabeceras.addElement("COSTO");
        vCabeceras.addElement("FECHA");
        vCabeceras.addElement("HORA");
        DefaultTableModel mdlTablaB = new DefaultTableModel(vCabeceras, 0);
        try {
            FileReader fr = new FileReader(".\\boletos.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdlTablaB.addRow(x);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTablaB;
    }
}
