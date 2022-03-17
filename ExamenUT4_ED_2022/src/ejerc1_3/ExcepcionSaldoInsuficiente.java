package ejerc1_3;

public class ExcepcionSaldoInsuficiente extends Exception {

    public ExcepcionSaldoInsuficiente() {
    }

    public ExcepcionSaldoInsuficiente(String message) {
        super(message);
    }
}
