/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10p2_examenfinal_hazielpavon;

import java.util.ArrayList;

/**
 *
 * @author hapav
 */
public class Artista {

    private String nombreart;
    private ArrayList<Cancion> canciones = new ArrayList();
    private ArrayList<Album> albumes = new ArrayList();
    private ArrayList<Single> singles = new ArrayList();

    public Artista() {
    }

    public String getNombreart() {
        return nombreart;
    }

    public void setNombreart(String nombreart) {
        this.nombreart = nombreart;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    public ArrayList<Single> getSingles() {
        return singles;
    }

    public void setSingles(ArrayList<Single> singles) {
        this.singles = singles;
    }

    public void addCanciones(Cancion c) {
        this.canciones.add(c);
    }

    public void addAlbum(Album a) {
        this.albumes.add(a);
    }

    public void addaSingle(Single s) {
        this.singles.add(s);
    }

    @Override
    public String toString() {
        return "Artista: " + "nombreart = " + nombreart + ", canciones = " + canciones + ", albumes = " + albumes + ", singles = " + singles;
    }

    
    
    
}
