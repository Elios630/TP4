package controle;

import modelo.Funcionario;

public class ControleFuncionario {
	private static Funcionario[] a;
	private int numFuncionario;
	
	public ControleFuncionario(ControleDados d) {
		a = d.getFuncionario();
		numFuncionario = d.getNumFun();
		
	}
	
	public String[] listaFuncionario() {
		String[] s = new String[numFuncionario];
		for(int i = 0; i < numFuncionario; i++) {
			s[i] = a[i].getNome();
		}
		
		return s;
	}
	
	public int getQtd() {
		return numFuncionario;
	}

	public void setQtd(int qtd) {
		this.numFuncionario = qtd;
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
		int numID = a[i].getIdFuncionario();
		return numID;
	}
	
	public String getFuncao(int i) {
		return a[i].getFuncao();
	}
	
	public String getCNPJ(int i) {
		return a[i].getCNPJ();
	}
	
	public String getSalario(int i) {
		String numID = String.valueOf(a[i].getSalario());
		return numID;
	}
	
	public String getHorarioTrabalho(int i) {
		String numID = String.valueOf(a[i].getHorarioTrabalho());
		return numID;
	}
	
	public void setNumCliente(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}
	
}
