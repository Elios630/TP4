package controle;

import modelo.Loja;

public class ControleLoja {
	private static Loja[] a;
	private int numLoja=1;
	
	public ControleLoja(ControleDados d) {
		a = d.getLoja();
		
	}
}