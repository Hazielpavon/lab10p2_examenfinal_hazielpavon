/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10p2_examenfinal_hazielpavon;

import java.util.ArrayList;

public class Cliente {

    ArrayList<Cancion> Cancionfav = new ArrayList();

    ArrayList<Cancion> listarep = new ArrayList();

    ArrayList<Cancion> listasdereplikeadas = new ArrayList();

    public Cliente() {
    }

    public ArrayList<Cancion> getCancionfav() {
        return Cancionfav;
    }

    public void setCancionfav(ArrayList<Cancion> Cancionfav) {
        this.Cancionfav = Cancionfav;
    }

    public ArrayList<Cancion> getListarep() {
        return listarep;
    }

    public void setListarep(ArrayList<Cancion> listarep) {
        this.listarep = listarep;
    }

    public ArrayList<Cancion> getListasdereplikeadas() {
        return listasdereplikeadas;
    }

    public void setListasdereplikeadas(ArrayList<Cancion> listasdereplikeadas) {
        this.listasdereplikeadas = listasdereplikeadas;
    }

    public void addCancionFav(Cancion c) {
        this.Cancionfav.add(c);
    }

    public void addlistarep(Cancion c) {
        this.listarep.add(c);
    }

    public void addListalikeada(Cancion c) {
        this.listasdereplikeadas.add(c);
    }
}
