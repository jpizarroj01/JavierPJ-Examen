package ejercicio1_5;

public class Circulo {

    private Coordenada origen;
    private float radio;

    public Circulo() {
    }

    public Circulo(Coordenada origen, float radio) {
        this.origen = origen;
        this.radio = radio;
    }

    public Coordenada getOrigen() {
        return origen;
    }

    public void setOrigen(Coordenada origen) {
        this.origen = origen;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
