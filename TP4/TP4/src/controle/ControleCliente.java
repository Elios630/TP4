package controle;
import modelo.*;

public class ControleCliente {
	private static Cliente[] a;
	private int numCliente;
	
	public ControleCliente(ControleDados d) {
		a = d.getCliente();
		numCliente = d.getNumCliente();
		
	}
	
	public String[] listaCliente() {
		String[] s = new String[numCliente];
		for(int i = 0; i < numCliente; i++) {
			s[i] = a[i].getNome();
		}
		
		return s;
	}
	
	public int getQtd() {
		return numCliente;
	}

	public void setQtd(int qtd) {
		this.numCliente = qtd;
	}
	
	public String getNome(int i) {		
		return a[i].getNome();
	}
	
	public String getEndereco(int i) {		
		return a[i].getEndereco();
	}	

	public String getTelefone(int i) {
		String numTelefone = String.valueOf(a[i].getTelefone());
		return numTelefone;
	}
	
	public String getCPF(int i) {
		String numCPF = String.valueOf(a[i].getCPF());
		return numCPF;
	}
	
	public String getRG(int i) {
		String numRG = String.valueOf(a[i].getRG());
		return numRG;
	}
	
	public static int getID(int i) {
		int numID = a[i].getIdCliente();
		return numID;
	}
	
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
	
}