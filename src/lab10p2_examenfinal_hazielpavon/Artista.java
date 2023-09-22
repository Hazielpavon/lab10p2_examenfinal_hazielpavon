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

    String nombreart;
    ArrayList<Cancion> canciones = new ArrayList();
    ArrayList<Album> albumes = new ArrayList();
    ArrayList<Single> singles = new ArrayList();

    public Artista() {
    }

    public ArrayList<Single> getSingles() {
        return singles;
    }

    public void setSingles(ArrayList<Single> singles) {
        this.singles = singles;
    }

    public Artista(String nombreart) {
        this.nombreart = nombreart;
    }

    public String getNombreart() {
        return nombreart;
    }

    public void setNombreart(String nombreart) {
        this.nombreart = nombreart;
    }

    public ArrayList getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList canciones) {
        this.canciones = canciones;
    }

    public ArrayList getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList albumes) {
        this.albumes = albumes;
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

}
