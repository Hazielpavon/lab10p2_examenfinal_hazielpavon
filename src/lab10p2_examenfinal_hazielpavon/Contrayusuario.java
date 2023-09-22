
package lab10p2_examenfinal_hazielpavon;


public class Contrayusuario {

    String nombre, usuario, fecha;
    int edad;

    public Contrayusuario(String nombre, String usuario, String fecha, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.fecha = fecha;
        this.edad = edad;
    }

    public Contrayusuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", usuario = " + usuario + ", fecha = " + fecha + " am , pm" + ", edad = " + edad;
    }

}
