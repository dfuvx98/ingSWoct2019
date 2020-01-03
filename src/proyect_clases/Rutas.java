package proyect_clases;

import java.sql.Time;
import java.util.Date;

public class Rutas {
    
    private int id_Ruta;
    private String nombre_Ruta;
    private String origen_Ruta;
    private String destino_Ruta;
    private String fecha_Ruta;
    private String hora_Ruta;
    private String costo_Ruta;

    public Rutas(){
    
    }

    public Rutas(int id_Ruta, String nombre_Ruta, String origen_Ruta, String destino_Ruta, String fecha_Ruta, String hora_Ruta, String costo_Ruta) {
        this.id_Ruta = id_Ruta;
        this.nombre_Ruta = nombre_Ruta;
        this.origen_Ruta = origen_Ruta;
        this.destino_Ruta = destino_Ruta;
        this.fecha_Ruta = fecha_Ruta;
        this.hora_Ruta = hora_Ruta;
        this.costo_Ruta = costo_Ruta;
    }

    public int getId_Ruta() {
        return id_Ruta;
    }

    public void setId_Ruta(int id_Ruta) {
        this.id_Ruta = id_Ruta;
    }

    public String getNombre_Ruta() {
        return nombre_Ruta;
    }

    public void setNombre_Ruta(String nombre_Ruta) {
        this.nombre_Ruta = nombre_Ruta;
    }

    public String getOrigen_Ruta() {
        return origen_Ruta;
    }

    public void setOrigen_Ruta(String origen_Ruta) {
        this.origen_Ruta = origen_Ruta;
    }

    public String getDestino_Ruta() {
        return destino_Ruta;
    }

    public void setDestino_Ruta(String destino_Ruta) {
        this.destino_Ruta = destino_Ruta;
    }

    public String getFecha_Ruta() {
        return fecha_Ruta;
    }

    public void setFecha_Ruta(String fecha_Ruta) {
        this.fecha_Ruta = fecha_Ruta;
    }

    public String getHora_Ruta() {
        return hora_Ruta;
    }

    public void setHora_Ruta(String hora_Ruta) {
        this.hora_Ruta = hora_Ruta;
    }

    public String getCosto_Ruta() {
        return costo_Ruta;
    }

    public void setCosto_Ruta(String costo_Ruta) {
        this.costo_Ruta = costo_Ruta;
    }

   
}
