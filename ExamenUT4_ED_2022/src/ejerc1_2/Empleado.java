package ejerc1_2;
/*
 Ejerc1_2: hacer que el método getSalario sea polimorfico, tenga un comportamiento diferente segun
 el tipo de empleado
 */

/**
 * Clase Empleados: Tiene todos los datos del empleado y podemos elegir si queremos que sea ingeniero, vendedor o director.
 * @author prueba
 *
 */
public class Empleado {
	/**
	 * INGENIERO: es una constante
	 */
    static final String INGENIERO = "ingeniero";
    /**
	 * VENCEDOR: es una constante
	 */
    static final String VENDEDOR = "vendedor";
    /**
	 * DIRECTOR: es una constante
	 */
    static final String DIRECTOR = "director";

    private String nombre;
    private String tipoEmpleado;
    private double salarioBase;
    private double productividad;
    private int ventas;
    private double comision;
    private double bonificacion;
    private double dietas;


    public Empleado() {
    }

    public Empleado(String nombre, String tipoEmpleado) {
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
    }

    public double getSalario() {
        double salarioBruto = 0;
        switch (tipoEmpleado) {
            case INGENIERO:
                salarioBruto = salarioBase + productividad;
                break;
            case VENDEDOR:
                salarioBruto = salarioBase + ventas * comision;
                break;
            case DIRECTOR:
                salarioBruto = salarioBase + bonificacion + dietas;
                break;
            default:
                throw new RuntimeException("Tipo de empleado incorrecto");
        }

        return salarioBruto;
    }


}
