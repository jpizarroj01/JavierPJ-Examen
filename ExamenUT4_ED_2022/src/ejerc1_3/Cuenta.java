package ejerc1_3;
/*
En el método sacarDinero: Cambiar código de error por excepcion 'ExceptionSaldoInsuficiente'
 */
public class Cuenta {
	ExcepcionSaldoInsuficiente e = new ExcepcionSaldoInsuficiente("Error"); 
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public String sacarDinero(double cantidad) {
        if (cantidad > saldo) return e.getLocalizedMessage();
        else { saldo -= cantidad; return "0"; }
    }
}
