
package proyect_metodos;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Pasajero;

public class Metodos {
    
   
    
    

    public boolean EsNumero(String Str){
        try{
            Integer.parseInt(Str);
            return true;
        }
        catch(Exception ex){
            return false;
        }
            
    }
    
    public boolean EsFecha(String Str){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try{
	    Date javaDate = sdf.parse(Str); 
            }
        catch(Exception ex){
            return false;
        }
        return true;
    }
    
    public boolean EsHora(String Str){
        try{
            LocalTime.parse(Str);
            return true;
        }
        catch(Exception ex){
            return false;
        }
        
    }
}
