package ejercicio1_5;

public class Rectangulo extends Figura {
	
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(Coordenada origen, int base, int altura) {
        this.origen = origen;
        this.base = base;
        this.altura = altura;
    }

    public Coordenada getOrigen() {
        return origen;
    }

    public void setOrigen(Coordenada origen) {
        this.origen = origen;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
