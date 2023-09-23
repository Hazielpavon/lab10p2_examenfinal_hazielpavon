/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10p2_examenfinal_hazielpavon;

public class Single {

    private Cancion cancion;
    private String nombrez;

    public Single(Cancion cancion, String nombrez) {
        this.cancion = cancion;
        this.nombrez = nombrez;
    }

    public String getNombrez() {
        return nombrez;
    }

    public void setNombre(String nombrez) {
        this.nombrez = nombrez;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public Single() {
    }

    public Single(Cancion cancion) {
        this.cancion = cancion;
    }

}
