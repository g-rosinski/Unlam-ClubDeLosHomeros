package ar.edu.unlam.programacionbasica2;

public class Cliente implements Comparable<Cliente>
{

	private String Nombre;
	private Integer Edad;
	
	public Cliente (String Nombre, Integer Edad)
	{
		this.Nombre=Nombre;
		this.Edad=Edad;
	}

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public Integer getEdad() {
		return this.Edad;
	}

	public void setEdad(Integer edad) {
		this.Edad = edad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Edad == null) ? 0 : Edad.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
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
		Cliente other = (Cliente) obj;
		if (Edad == null) {
			if (other.Edad != null)
				return false;
		} else if (!Edad.equals(other.Edad))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Cliente OtherCli) {

		return this.Nombre.compareTo(OtherCli.getNombre());
	}

	
}
