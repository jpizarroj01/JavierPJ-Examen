package ejerc1_1;
/*
Ejerc1_1: Extraer los datos relacionados con el telefono en otra clase llamada Telefono
 */
public class Cliente {
    private String nombre;
    private String prefijoTelefonoTrabajo;
    private String telefonoTrabajo;
    private String prefijoTelefonoCasa;
    private String telefonoCasa;

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrefijoTelefonoTrabajo() {
        return prefijoTelefonoTrabajo;
    }

    public void setPrefijoTelefonoTrabajo(String prefijoTelefonoTrabajo) {
        this.prefijoTelefonoTrabajo = prefijoTelefonoTrabajo;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public String getPrefijoTelefonoCasa() {
        return prefijoTelefonoCasa;
    }

    public void setPrefijoTelefonoCasa(String prefijoTelefonoCasa) {
        this.prefijoTelefonoCasa = prefijoTelefonoCasa;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }
}
