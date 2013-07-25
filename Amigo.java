package dojo_24072013;

public class Amigo {

	private int x;
	private int y;
	private double distancia;
	
	
	public Amigo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean equals(Object obj) {
		Amigo amigo = (Amigo)obj;
		
		boolean retorno = amigo.getX() == this.getX() && amigo.getY() == this.getY();
		
		return retorno;
	}
	public double distancia(Amigo amigo) {
		int dx = Math.abs(getX() - amigo.getX());
		int dy = Math.abs(getY() - amigo.getY());
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
}
