package ejerc1_4;

/*
 Ejerc1_4: ¿qué podrías refactorizar en este ejercicio? Justifica tu respuesta y refactoriza en caso necesario.
 */
public class Asalariado extends Empleado{

    public Asalariado() {
    }

    public Asalariado(String nombre, String direccion, String telefono, String email) {
       super(nombre, direccion, telefono, email);
    }

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public String getDireccion() {
		// TODO Auto-generated method stub
		return super.getDireccion();
	}

	@Override
	public void setDireccion(String direccion) {
		// TODO Auto-generated method stub
		super.setDireccion(direccion);
	}

	@Override
	public String getTelefono() {
		// TODO Auto-generated method stub
		return super.getTelefono();
	}

	@Override
	public void setTelefono(String telefono) {
		// TODO Auto-generated method stub
		super.setTelefono(telefono);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

    
    
}
