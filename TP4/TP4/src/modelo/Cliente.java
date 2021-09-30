package modelo;

import java.util.Date;

public class Cliente extends Pessoa {
	
	private int idCliente;
	private Venda[] venda = new Venda[1];
	
	public Cliente (String n, String e, int t, int c, int r,int id){

		nome = n;
		endereço = e;
		telefone = t;
		cpf = c;
		rg = r;
		idCliente = id;
	}
	
	public  Cliente() {
	
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Venda[] getVenda() {
		return venda;
	}

	public void setVenda(Venda[] venda) {
		this.venda = venda;
	}
	
	
}
