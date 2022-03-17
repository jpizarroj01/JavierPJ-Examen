package ejerc1_4;

/*
 Ejerc1_4: ¿qué podrías refactorizar en este ejercicio? Justifica tu respuesta y refactoriza en caso necesario.
 */
public class Asalariado extends Empleado{
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public Asalariado() {
    }

    public Asalariado(String nombre, String direccion, String telefono, String email) {
       super(nombre, direccion, telefono, email);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
