
public class Empleado implements Comparable<Empleado>{
	private int idEmpleado;
	private String nombre;
	private double salario;
	public Empleado(int idEmpleado, String nombre, double salario) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.salario = salario;
	}
	public Empleado() {
		super();
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmpleado;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (idEmpleado != other.idEmpleado)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	public double salarioMensual(int pagas) {
		return salario/pagas;
	}
	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
	//	return this.idEmpleado - o.idEmpleado;
		return this.nombre.compareTo(o.nombre);
	}

}
