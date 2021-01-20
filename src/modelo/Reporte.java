/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Favia Elizalde
 */
public class Reporte implements Comparable<Reporte>{
    public ArrayList<Reporte> reportes = new ArrayList<>();
    Date fecha;
    double duracion;
    String usuario;
    String cantOponentes;
    String alineacion;
    
    public Reporte( Date fecha, double duracion, String usuario, String cantOponentes, String alineacion){
        this.fecha = fecha;
        this.duracion = duracion;
        this.usuario = usuario;
        this.cantOponentes = cantOponentes;
        this.alineacion = alineacion;
        
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCantOponentes() {
        return cantOponentes;
    }

    public void setCantOponentes(String cantOponentes) {
        this.cantOponentes = cantOponentes;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }
    
    
    @Override
    public int compareTo(Reporte r){
        return fecha.compareTo(r.getFecha());
    }

    @Override
    public String toString() {
        return "Reporte{" + "Fecha=" + fecha + ", Duracion=" + duracion + ", Usuario=" + usuario + ", Cantidad de Oponentes=" + cantOponentes + ", Alineacion=" + alineacion + '}';
    }
    
    
    public void escribirReporte(String ruta) throws IOException{
        String archivoCSV = ruta;
        Writer writer = Files.newBufferedWriter(Paths.get(archivoCSV));
    }
    
    public void actualizarReporte(String rute){
        FileWriter writer = null;
        try{
            String ruta = rute;
            writer = new FileWriter(ruta);
            for(Reporte rep : reportes){
                writer.write(rep.getFecha()+ ";" + rep.getDuracion()+ ";" + rep.getUsuario()+";"+ rep.getCantOponentes()+";"+ rep.getAlineacion() +System.lineSeparator());
            }
            writer.close();
        } catch(IOException e){
            System.out.println("IOException "+e);
        } finally {
            try{
                writer.close();
            } catch(IOException e){
                System.out.println("IOEception"+e);
            }
        }
    }
    
}
