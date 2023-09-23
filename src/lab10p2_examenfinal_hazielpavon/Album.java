/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10p2_examenfinal_hazielpavon;

import java.util.ArrayList;

public class Album {

    private ArrayList<Cancion> Album = new ArrayList();
    private String nombre; 

    public Album(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getAlbum() {
        return Album;
    }

    public void setAlbum(ArrayList<Cancion> Album) {
        this.Album = Album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Album() {
    }

    public ArrayList<Cancion> getCanciones() {
        return Album;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.Album = canciones;
    }

    public void addcancion(Cancion c) {
        this.Album.add(c);
    }
}
