package ar.edu.unlam.programacionbasica2;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")

public class TestBar {

	@Test
	public void BarAbiertoSinClientes()
	{
		Bar ClubDeHomer = new Bar();
		ClubDeHomer.abrirBar();
		Assert.assertTrue(ClubDeHomer.getClientes().size()==0);
	}
	

	@Test
	public void ClientesOrdenadosAlfabeticamente()
	{
		Bar ClubDeHomer= new Bar();
		ClubDeHomer.abrirBar();
		
		Cliente Lisa = new Cliente("Lisa",8);
		Cliente Bart = new Cliente("Bart",10);
		Cliente Maggie = new Cliente("Maggie",1);
		Cliente Marge = new Cliente("Marge",30);

		ClubDeHomer.agregarCliente(Lisa);
		ClubDeHomer.agregarCliente(Bart);
		ClubDeHomer.agregarCliente(Maggie);
		ClubDeHomer.agregarCliente(Marge);
		
		//Ordena los clientes por Nombre
		Assert.assertTrue(ClubDeHomer.getClientes().first().getNombre()=="Bart");
		Assert.assertTrue(ClubDeHomer.getClientes().last().getNombre()=="Marge");
		
	}
	@Test
	public void ClientesOrdenadosPorEdad()
	{
		Bar ClubDeHomer= new Bar(new ComparadorDeClientes());
		ClubDeHomer.abrirBar();
		
		Cliente Lisa = new Cliente("Lisa",8);
		Cliente Bart = new Cliente("Bart",10);
		Cliente Maggie = new Cliente("Maggie",1);
		Cliente Marge = new Cliente("Marge",30);

		ClubDeHomer.agregarCliente(Lisa);
		ClubDeHomer.agregarCliente(Bart);
		ClubDeHomer.agregarCliente(Maggie);
		ClubDeHomer.agregarCliente(Marge);
		
		//Ordena los clientes por Edad
		Assert.assertTrue(ClubDeHomer.getClientes().first().getEdad()==30);
		Assert.assertTrue(ClubDeHomer.getClientes().last().getEdad()==1);
	}
	@Test
	public void BarNoAdmiteClientesConElMismoNombre()
	{
		Bar ClubDeHomer= new Bar();
		ClubDeHomer.abrirBar();
		
		Cliente Homer = new Cliente("Homer",32);
		Cliente OtherHomer = new Cliente("Homer",32);

		ClubDeHomer.agregarCliente(Homer);
		ClubDeHomer.agregarCliente(OtherHomer);
		//Solo se Acepta un cliente con el mismo nombre
		Assert.assertTrue(ClubDeHomer.getClientes().size()==1);
	}
	@Test
	public void compararUnClienteDentroDelBarPorUnoDeAfuera()
	{
		Bar ClubDeHomer= new Bar();
		ClubDeHomer.abrirBar();
		
		Cliente Lenny = new Cliente("Lenny",32); 
		Cliente Carl = new Cliente("Carl",32); 
		
		ClubDeHomer.agregarCliente(Lenny);
		//Cliente ClienteDentroDelBar = ClubDeHomer.getClientes().first();
		
		Assert.assertTrue(ClubDeHomer.getClientes().first().compareTo(Carl)!=0);
		
	}
}
