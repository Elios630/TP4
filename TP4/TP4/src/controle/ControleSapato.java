package controle;

import modelo.Sapato;

public class ControleSapato {
	private static Sapato[] a;
	private int numSapato;
	
	public ControleSapato(ControleDados d) {
		a = d.getSapato();
		numSapato = d.getNumSapato();
		
	}
	
	public String[] listaSapato() {
		String[] s = new String[numSapato];
		for(int i = 0; i < numSapato; i++) {
			s[i] = String.valueOf(a[i].getIdSapato());
		}
		
		return s;
	}
	public static int getID(int i) {
		int numID = a[i].getIdSapato();
		return numID;
	}
}