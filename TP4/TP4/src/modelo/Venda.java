package modelo;

import java.util.Date;

public class Venda {

	private int idVenda, quantidade, precoTotal;
	private Funcionario funcionario;
	private Cliente cliente;
	private Sapato sapato;
	private Meia meia;
	
	
	public Venda (int id, int qua, int pec, Funcionario fun, Cliente cli){

		idVenda = id;
		quantidade = qua;
		precoTotal = pec;
		funcionario = fun;
		cliente = cli;
	}
	public void Venda() {
		Cliente cli = this.getCliente();
		Funcionario fun = this.getFuncionario();
		
	}
	
	
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(int precoTotal) {
		this.precoTotal = precoTotal;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Sapato getSapato() {
		return sapato;
	}
	public void setSapato(Sapato sapato) {
		this.sapato = sapato;
	}
	public Meia getMeia() {
		return meia;
	}
	public void setMeia(Meia meia) {
		this.meia = meia;
	}
	
	
		
}
