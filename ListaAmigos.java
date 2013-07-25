package dojo_24072013;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaAmigos {
	public List<Amigo> amigos = new ArrayList<Amigo>();

	public void adicionar(Amigo a) {
		amigos.add(a);	
	}

	public List<Amigo> tresMaisProximos(final Amigo a) {
		List<Amigo> amigosProximos = new ArrayList<Amigo>();
		
		for (Amigo amigo : amigos) {
			
			if(!amigo.equals(a)){
				amigosProximos.add(amigo);
			}
		}
		
		Collections.sort(amigosProximos, new Comparator<Amigo>() {
			@Override
			public int compare(Amigo o1, Amigo o2) {
				if(o1.distancia(a) > o2.distancia(a))
					return 1;
				else if (o1.distancia(a) < o2.distancia(a))
					return -1;
				else
					return 0;
			}
		});
		
		List<Amigo> listaProximos = new ArrayList<Amigo>();
		for (int i = 0; i <= 2; i++) {
			if(amigosProximos.size() > i)
				listaProximos.add(amigosProximos.get(i));
		}
		
		return listaProximos;
	}
}
