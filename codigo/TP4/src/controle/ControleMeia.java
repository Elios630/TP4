package controle;

import modelo.Meia;

public class ControleMeia {
	private static Meia[] a;
	private int numMeia;
	
	public ControleMeia(ControleDados d) {
		a = d.getMeia();
		numMeia = d.getNumMeia();
		
	}
	
	public String[] listaMeia() {
		String[] s = new String[numMeia];
		for(int i = 0; i < numMeia; i++) {
			s[i] = String.valueOf(a[i].getIdMeia());
		}
		
		return s;
	}
	
	public int getQtd() {
		return numMeia;
	}

	public void setQtd(int qtd) {
		this.numMeia = qtd;
	}
	public static int getID(int i) {
		int numID = a[i].getIdMeia();
		return numID;
	}
}