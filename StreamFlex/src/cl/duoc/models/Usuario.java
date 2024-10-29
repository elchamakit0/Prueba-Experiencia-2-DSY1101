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
public class Usuario implements ICalculadora {
    private int idUsuario;
    private String username;
    private List usuarios, contenidos;

    public Usuario() {
        this.idUsuario = 0;
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(int idUsuario, String username, List usuarios, List contenidos) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.usuarios = usuarios;
        this.contenidos = contenidos;
    }

    public List getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List usuarios) {
        this.usuarios = usuarios;
    }

   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List getContenidos() {
        return contenidos;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setContenidos(List contenidos) {
        this.contenidos = contenidos;
    }

    @Override
    public String toString() {
        return "IdUsuario: " + idUsuario + ", Username: " + username;
    }

    
    
    public void crearUsuario(String nombre, List usuarios) {
        Usuario u1 = new Usuario();
        usuarios.add(u1);
        int idset;
        idset = usuarios.size();
        u1.setIdUsuario(idset);
    }
    
    public void consumirPelicula(Pelicula pelicula){
        contenidos.add(pelicula);
    }
    
    public void consumirSerie(Serie serie){
        contenidos.add(serie);
    }
    
    public void consumirDocumental(Documental documental){
        contenidos.add(documental);
    }
    
    public void mostrarContenidos(List usuarios){
        for(int i =0; i<usuarios.size(); i++){
            System.out.println(usuarios.get(i));
            System.out.println(getContenidos());
        }
    }

    @Override
    public void calcularSuscripcion() {
        System.out.println("No tengo idea de como programar el concepto de recorrer la lista de contenidos y comprar con if si es Pelicula Serie o Documental");
        System.out.println("Pero lo intentamos jaj, gracias por chequear este punto.");
    }
}
