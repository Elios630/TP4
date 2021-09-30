package controle;

import modelo.*;

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.fillLoja();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Cliente[] getCliente() {
		return this.d.getCliente();
	}
	
	public Funcionario[] getFuncionario() {
		return this.d.getFuncionario();
		
	}
	
	public Sapato[] getSapato() {
		return this.d.getSapato();
	}
	
	public Meia[] getMeia() {
		return this.d.getMeia();
		
	}
	public Loja[] getLoja() {
		return this.d.getLoja();
		
	}
	
	public int pesquisaIdCliente(int id) {
		int fim=-10;
		for (int j = 0; j < getNumCliente(); j++) {
			if (id == ControleCliente.getID(j)) {
				fim = j;
			}
		}
		return fim;
	}
	
	public int pesquisaIdFun(int id) {
		int fim=-10;
		for (int j = 0; j < getNumFun(); j++) {
			if (id == ControleFuncionario.getID(j)) {
				fim = j;
			}
		}
		return fim;
	}
	
	public int pesquisaIdSapato(int id) {
		int fim=-10;
		for (int j = 0; j < getNumSapato(); j++) {
			if (id == ControleSapato.getID(j)) {
				fim = j;
			}
		}
		return fim;
	}
	
	public int pesquisaIdMeia(int id) {
		int fim=-20;
		for (int j = 0; j < getNumMeia(); j++) {
			if (id == ControleMeia.getID(j)) {
				fim = j;
			}
		}
		return fim;
	}
	
	public int getNumCliente() {
		return this.d.getNumCliente();
	}
	
	public int getNumFun() {
		return this.d.getNumFun();
	}
	
	public int getNumSapato() {
		return this.d.getNumSapato();
	}
	
	public int getNumMeia() {
		return this.d.getNumMeia();
	}
	

	

	
	public boolean inserirEditarCliente(String[] dadosClinte) {
		if(!dadosClinte[3].matches("[0-9]+") || !dadosClinte[4].matches("[0-9]+") || 
				!dadosClinte[5].matches("[0-9]+")|| !dadosClinte[6].matches("[0-9]+")) {
			return false;
			
		} else {
				Cliente c = new Cliente(dadosClinte[1], dadosClinte[2], Integer.parseInt(dadosClinte[3]), 
						Integer.parseInt(dadosClinte[4]), Integer.parseInt(dadosClinte[5]),
								Integer.parseInt(dadosClinte[6]));
				d.inserirEditarCliente(c, Integer.parseInt(dadosClinte[0]));
				return true;
		}
	}
	
	
	public boolean inserirEditarFun(String[] dadosFun) {
		if(!dadosFun[3].matches("[0-9]+") || !dadosFun[4].matches("[0-9]+") || 
				!dadosFun[5].matches("[0-9]+")) {
			return false;
		} else {
				Funcionario f = new Funcionario(dadosFun[1], dadosFun[2], 
						Integer.parseInt(dadosFun[3]), Integer.parseInt(dadosFun[4]), Integer.parseInt(dadosFun[5]),
						Integer.parseInt(dadosFun[6]), dadosFun[7], 
						dadosFun[8], Integer.parseInt(dadosFun[9]), Integer.parseInt(dadosFun[10]));
				d.inserirEditarFun(f, Integer.parseInt(dadosFun[0]));
				return true;
		}
	}
	
	public boolean inserirEditarSapato(String[] dadosSapato) {
		if(!dadosSapato[1].matches("[0-9]+") || !dadosSapato[4].matches("[0-9]+") || !dadosSapato[6].matches("[0-9]+")) {
			return false;
			
		} else {
				Sapato s = new Sapato(Integer.parseInt(dadosSapato[1]), dadosSapato[2], dadosSapato[3], 
						Integer.parseInt(dadosSapato[4]), dadosSapato[5], Integer.parseInt(dadosSapato[6]));
				d.inserirEditarSapato(s, Integer.parseInt(dadosSapato[0]));
				return true;
		}
	}
	
	
	public boolean inserirEditarMeia(String[] dadosMeia) {
		if(!dadosMeia[1].matches("[0-9]+") || !dadosMeia[4].matches("[0-9]+") || !dadosMeia[6].matches("[0-9]+")) {
			return false;
			
		} else {
				Meia m = new Meia(Integer.parseInt(dadosMeia[1]), dadosMeia[2], dadosMeia[3], 
						Integer.parseInt(dadosMeia[4]), dadosMeia[5], Integer.parseInt(dadosMeia[6]));
				d.inserirEditarMeia(m, Integer.parseInt(dadosMeia[0]));
				return true;
		}
	}
	public boolean inserirEditarLoja(String[] dadosLoja) {
		if(!dadosLoja[4].matches("[0-9]+") || !dadosLoja[5].matches("[0-9]+") || !dadosLoja[6].matches("[0-9]+")|| 
				!dadosLoja[7].matches("[0-9]+")) {
			return false;
			
		} else {
				Loja l = new Loja(dadosLoja[1], dadosLoja[2], dadosLoja[3], 
					Integer.parseInt(dadosLoja[4]), Integer.parseInt(dadosLoja[5]), Integer.parseInt(dadosLoja[6]),
					Integer.parseInt(dadosLoja[7]));
				d.inserirEditarLoja(l);
				return true;
		}
	}
	
	//Remove cliente
	public void removerCliente(int i) {

		d.getCliente()[i] = null;
		d.getCliente()[i] = d.getCliente()[i+1];
		d.getCliente()[d.getNumCliente()] = null;
		d.setNumCliente(d.getNumCliente() - 1);
		
	}
	
	//Remove funcionario
	public void removerFuncionario(int i) {
		
		d.getFuncionario()[i] = null;
		d.getFuncionario()[i] = d.getFuncionario()[i+1];
		d.getFuncionario()[d.getNumFun()] = null;
		d.setNumFun(d.getNumFun() - 1);
	}
	
	//Remove sapato
	public void removerSapato(int i) {

		d.getSapato()[i] = null;
		d.getSapato()[i] = d.getSapato()[i+1];
		d.getSapato()[d.getNumSapato()] = null;
		d.setNumSapato(d.getNumSapato() - 1);
	}
	
	//Remove meia
	public void removerMeia(int i) {
		
		d.getMeia()[i] = null;
		d.getMeia()[i] = d.getMeia()[i+1];
		d.getMeia()[d.getNumMeia()] = null;
		d.setNumMeia(d.getNumMeia() - 1);
	}
}