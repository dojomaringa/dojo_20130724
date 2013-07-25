package dojo_24072013;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MundoPequenoTeste {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void umAmigo_NenhumProximo() {
		ListaAmigos lista = new ListaAmigos();
		Amigo a = new Amigo(1,1);
		lista.adicionar(a);
		List<Amigo> maisProximos = lista.tresMaisProximos(a);
		Assert.assertEquals(0, maisProximos.size());
	}
	
	@Test
	public void doisAmigos_UmProximo() {
		ListaAmigos lista = new ListaAmigos();
		Amigo a1 = new Amigo(1, 1);
		Amigo a2 = new Amigo(2, 2);
		lista.adicionar(a1);
		lista.adicionar(a2);
		List<Amigo> maisProximos = lista.tresMaisProximos(a1);
		Assert.assertEquals(1, maisProximos.size());
	}
	
	@Test
	public void tresAmigos_DoisProximos(){
		ListaAmigos lista = new ListaAmigos();
		Amigo a1 = new Amigo(1, 1);
		Amigo a2 = new Amigo(2, 2);
		Amigo a3 = new Amigo(3, 3);
		lista.adicionar(a1);
		lista.adicionar(a2);
		lista.adicionar(a3);
		List<Amigo> maisProximos = lista.tresMaisProximos(a1);
		Assert.assertEquals(2, maisProximos.size());
	}
	
	@Test
	public void quatroAmigos_TresProximos(){
		ListaAmigos lista = new ListaAmigos();
		Amigo a1 = new Amigo(1, 1);
		Amigo a2 = new Amigo(2, 2);
		Amigo a3 = new Amigo(3, 3);
		Amigo a4 = new Amigo(4, 4);
		lista.adicionar(a1);
		lista.adicionar(a2);
		lista.adicionar(a3);
		lista.adicionar(a4);
		List<Amigo> maisProximos = lista.tresMaisProximos(a1);
		Assert.assertEquals(3, maisProximos.size());
	}
	
	@Test
	public void verificaCoordenada(){
		Amigo a = new Amigo(1,0);
		Assert.assertEquals(1, a.getX());
		Assert.assertEquals(0, a.getY());	
	}
	
	@Test
	public void cincoAmigos_TresProximos(){
		ListaAmigos lista = new ListaAmigos();
		Amigo a1 = new Amigo(1, 1);
		Amigo a2 = new Amigo(2, 2);
		Amigo a3 = new Amigo(3, 3);
		Amigo a4 = new Amigo(4, 4);
		Amigo a5 = new Amigo(5, 5);
		lista.adicionar(a1);
		lista.adicionar(a2);
		lista.adicionar(a3);
		lista.adicionar(a4);
		lista.adicionar(a5);
		List<Amigo> maisProximos = lista.tresMaisProximos(a1);
		Assert.assertEquals(3, maisProximos.size());
	}
	
	@Test
	public void distanciaEntreAmigos() {
		Amigo a1 = new Amigo(3, 0);
		Amigo a2 = new Amigo(6, 0);
		double distancia = a1.distancia(a2);
		Assert.assertEquals(3.0, distancia, 0.01);
	}	
}
