/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10p2_examenfinal_hazielpavon;


public class Cancion {
    
    private String titulo; 
    
    private String duracion; 
    
    private String ref; 

    public Cancion(String titulo, String duracion, String ref) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.ref = ref;
    }

    public Cancion() {
    }

    

    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "titulo = " + titulo + ", duracion = " + duracion + ", referencia =" + ref;
    }
    
    
}
