/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Serie extends Contenido {
    private int numeroTemporadas;
    private boolean estadoFinalizacion;
    private List series;

    public Serie() {
    }

    public Serie(int id, String nombre) {
        super(id, nombre);
    }

    public Serie(int numeroTemporadas, boolean estadoFinalizacion, List series, int id, String nombre) {
        super(id, nombre);
        this.numeroTemporadas = numeroTemporadas;
        this.estadoFinalizacion = estadoFinalizacion;
        this.series = series;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public List getSeries() {
        return series;
    }

    public void setSeries(List series) {
        this.series = series;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public boolean isEstadoFinalizacion() {
        return estadoFinalizacion;
    }

    public void setEstadoFinalizacion(boolean estadoFinalizacion) {
        this.estadoFinalizacion = estadoFinalizacion;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()+" Id: " + super.getId() + " Numero de Temporadas: " + numeroTemporadas + ", Finalizada?: " + estadoFinalizacion + '}';
    }

    //El método crearXXXX comprueba por si mismo que su código no se repita.
    public void crearSerie(String nombre, List series, int nT, boolean estF) {
        Serie s1 = new Serie();
        series.add(s1);
        int idset;
        idset = series.size();
        s1.setId(idset);
        s1.setNombre(nombre);
        s1.setNumeroTemporadas(nT);
        s1.setEstadoFinalizacion(estF);  
    }
    
    public void listarSeries(List series){
        for(int i =0; i<series.size(); i++){
            System.out.println(series.get(i));
        }
    }
}
