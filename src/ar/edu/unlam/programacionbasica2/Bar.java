package ar.edu.unlam.programacionbasica2;

import java.util.*;

public class Bar {

	private Boolean abierto;
	private TreeSet <Cliente> Clientes;
	
	public Bar()
	{
		this.Clientes = new TreeSet<Cliente>();
		this.abierto=false;
	}
	public Bar(Comparator<Cliente> Compara) {
		this.Clientes = new TreeSet<Cliente>(Compara);
		this.abierto = false;
	}
	public void cerrarBar()
	{
		this.abierto=false;
	}
	public void abrirBar()
	{
		this.abierto=true;
	}
	public Boolean estadoDelBar()
	{
		return this.abierto;
	}
	public void agregarCliente(Cliente cliente)
	{
		Clientes.add(cliente);
	}
	public TreeSet<Cliente> getClientes()
	{
		return this.Clientes;
	}
}
