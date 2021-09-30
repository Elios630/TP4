package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class TelaObjetos implements ActionListener{		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroSapato;
	private JButton editarRemoverSapato;
	private JButton editarRemoverMeia;
	private JButton cadastroMeia;
	private static ControleDados dados;
	private String[] Nomes = new String[50];
	private int pos;

	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
		//Sapatos
		case 1:
			Nomes = new ControleSapato(dados).listaSapato();
			janela = new JFrame("Sapatos");
			titulo = new JLabel("Sapatos");
			cadastroSapato = new JButton("Cadastrar");
			editarRemoverSapato = new JButton("Editar/Remover");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);

			cadastroSapato.setBounds(30, 50, 100, 30);
			editarRemoverSapato.setBounds(131, 50, 130, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(cadastroSapato);
			janela.add(editarRemoverSapato);

			janela.setSize(300, 150);
			janela.setVisible(true);

			cadastroSapato.addActionListener(this);
			editarRemoverSapato.addActionListener(this);

			break;
			
		//Meias
		case 2:
			Nomes = new ControleMeia(dados).listaMeia();
			janela = new JFrame("Meia");
			titulo = new JLabel("Meias");
			cadastroMeia = new JButton("Cadastrar");
			editarRemoverMeia = new JButton("Editar/Remover");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);


			cadastroMeia.setBounds(30, 50, 100, 30);
			editarRemoverMeia.setBounds(131, 50, 130, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(cadastroMeia);
			janela.add(editarRemoverMeia);

			janela.setSize(300, 150);
			janela.setVisible(true);
			
			cadastroMeia.addActionListener(this);
			editarRemoverMeia.addActionListener(this);
			break;
		}

	}



	//Para catrastro e edição/Remover
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo Sapato
		if(src == cadastroSapato)
			new TelaDetalheObjetos().inserirEditar(1, dados, this, 0);
		
		if(src == editarRemoverSapato) {
			
			String id =
					JOptionPane.showInputDialog("Incira o ID do Sapato");
			
			int ID = Integer.parseInt(id);
			pos = dados.pesquisaIdSapato(ID);
			new TelaDetalheObjetos().inserirEditar(3, dados, this, pos);
			pos = dados.getNumCliente();
		}

		//Cadastro de nova meia
		if(src == cadastroMeia)
			new TelaDetalheObjetos().inserirEditar(2, dados, this, 0);
		
		if(src == editarRemoverMeia) {
			
			String id =
					JOptionPane.showInputDialog("Incira o ID de uma meia");
			
			int ID = Integer.parseInt(id);
			pos = dados.pesquisaIdMeia(ID);
			new TelaDetalheObjetos().inserirEditar(4, dados, this, pos);
		}
	}
}