package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class TelaPessoa implements ActionListener{		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroClientes;
	private JButton editarRemoverClientes;
	private JButton editarRemoverFuncionario;
	private JButton cadastroFun;
	private static ControleDados dados;
	//para o futuro
	private String[] Nomes = new String[50];
	
	private int pos;

	public void menuPessoa(ControleDados d, int op){
		dados = d;

		switch (op) {
		//Clientes
		case 1:
			Nomes = new ControleCliente(dados).listaCliente();
			janela = new JFrame("Clientes");
			titulo = new JLabel("Clientes");
			cadastroClientes = new JButton("Cadastrar");
			editarRemoverClientes = new JButton("Editar/Remover/visualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);

			cadastroClientes.setBounds(30, 50, 100, 30);
			editarRemoverClientes.setBounds(131, 50, 200, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(cadastroClientes);
			janela.add(editarRemoverClientes);

			janela.setSize(400, 150);
			janela.setVisible(true);

			cadastroClientes.addActionListener(this);
			editarRemoverClientes.addActionListener(this);

			break;
			
		//Funcionarios
		case 2:
			Nomes = new ControleFuncionario(dados).listaFuncionario();
			janela = new JFrame("Funcionario");
			titulo = new JLabel("Funcionarios");
			cadastroFun = new JButton("Cadastrar");
			editarRemoverFuncionario = new JButton("Editar/Remover/visualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);


			cadastroFun.setBounds(30, 50, 100, 30);
			editarRemoverFuncionario.setBounds(131, 50, 200, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(cadastroFun);
			janela.add(editarRemoverFuncionario);

			janela.setSize(400, 150);
			janela.setVisible(true);
			
			cadastroFun.addActionListener(this);
			editarRemoverFuncionario.addActionListener(this);
			break;
		}

	}



	//Para catrastro e edição/Remover
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo cliente
		if(src == cadastroClientes)
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);
		
		if(src == editarRemoverClientes) {
			
			String id =
					JOptionPane.showInputDialog("Incira o ID de um cliente");
			
			int ID = Integer.parseInt(id);
			pos = dados.pesquisaIdCliente(ID);
			new TelaDetalhePessoa().inserirEditar(3, dados, this, pos);
		}

		//Cadastro de novo Funcionario
		if(src == cadastroFun)
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);
		
		if(src == editarRemoverFuncionario) {
			
			String id =
					JOptionPane.showInputDialog("Incira o ID de um funcionário");
			
			int ID = Integer.parseInt(id);
			pos = dados.pesquisaIdFun(ID);
			new TelaDetalhePessoa().inserirEditar(4, dados, this, pos);
		}
	}
}