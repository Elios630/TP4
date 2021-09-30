package modelo;

import java.util.Date;

public abstract class Pessoa {

	protected String nome, endereço;
	protected int telefone, cpf, rg;
	
	
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereço;
		}
		public void setEndereço(String endereco) {
			this.endereço = endereço;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		public int getCPF() {
			return cpf;
		}
		public void setCPF(int cpf) {
			this.cpf = cpf;
		}
		public int getRG() {
			return rg;
		}
		public void setRG(int rg) {
			this.rg = rg;
		}

}

