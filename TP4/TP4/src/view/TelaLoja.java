package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class TelaLoja implements ActionListener{
	
	
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JTextField valorEnd;
	private JLabel labelFun = new JLabel("Numero de funcionarios");
	private JLabel labelFunVis = new JLabel("para visualização apenas:");
	private JTextField valorFun;
	private JLabel labelHF = new JLabel("Horario de funcionamento: ");
	private JTextField valorHF;
	private JLabel labelCNPJ = new JLabel("CNPJ: ");
	private JTextField valorCNPJ;
	private JLabel labelestoqueSapato = new JLabel("Estoque de sapatos: ");
	private JTextField valorestoqueSapato;
	private JLabel labelestoqueMeia = new JLabel("Estoque de meia: ");
	private JTextField valorestoqueMeia;
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[50];
	private static ControleDados dados;
	private String s;

	public void Editar(ControleDados d) {

		dados = d;
		janela = new JFrame("Tela da loja");
		
		
		valorNome = new JTextField(200);
		valorEnd = new JTextField(200);
		valorHF = new JTextField(200);
		valorCNPJ = new JTextField(200);
		valorestoqueSapato = new JTextField(200);
		valorestoqueMeia = new JTextField(200);

		botaoSalvar.setBounds(245, 350, 115, 30);
		
		valorNome = new JTextField(dados.getLoja()[0].getNome(), 200);
		valorEnd = new JTextField(dados.getLoja()[0].getEndereco(),200);
		valorHF = new JTextField(String.valueOf(dados.getLoja()[0].getHorarioFuncionamento()), 200);
		valorCNPJ = new JTextField(String.valueOf(dados.getLoja()[0].getCnpj()), 200);
		valorestoqueSapato = new JTextField(String.valueOf(dados.getLoja()[0].getEstoqueSapato()), 200);
		valorestoqueMeia = new JTextField(String.valueOf(dados.getLoja()[0].getEstoqueMeia()), 200);
		valorFun = new JTextField(String.valueOf(dados.getNumFun()));
			
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEnd.setBounds(30, 50, 150, 25);
		valorEnd.setBounds(180, 50, 180, 25);
		labelFun.setBounds(30, 80, 150, 25);
		labelFunVis.setBounds(30, 90, 150, 25);
		valorFun.setBounds(180, 100, 180, 25);
		labelHF.setBounds(30, 140, 150, 25);
		valorHF.setBounds(180, 140, 150, 25);
		labelCNPJ.setBounds(30, 170, 150, 25);
		valorCNPJ.setBounds(180, 170, 180, 25);
		labelestoqueSapato.setBounds(30, 200, 150, 25);
		valorestoqueSapato.setBounds(180, 200, 150, 25);
		labelestoqueMeia.setBounds(30, 230, 150, 25);
		valorestoqueMeia.setBounds(180, 230, 150, 25);

		
		botaoSalvar.setBounds(120, 315, 115, 30);
		
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEnd);
		this.janela.add(valorEnd);
		this.janela.add(labelFun);
		this.janela.add(labelFunVis);
		this.janela.add(valorFun);
		this.janela.add(labelHF);
		this.janela.add(valorHF);
		this.janela.add(labelCNPJ);
		this.janela.add(valorCNPJ);
		this.janela.add(labelestoqueSapato);
		this.janela.add(valorestoqueSapato);
		this.janela.add(labelestoqueMeia);
		this.janela.add(valorestoqueMeia);

		this.janela.add(botaoSalvar);
		
		

		this.janela.setLayout(null);

		this.janela.setSize(400, 450);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorEnd.getText();
				novoDado[3] =  valorHF.getText();
				novoDado[4] =  String.valueOf(dados.getNumFun());
				novoDado[5] =  valorCNPJ.getText();
				novoDado[6] =  valorestoqueSapato.getText();
				novoDado[7] =  valorestoqueMeia.getText();
				dados.inserirEditarLoja(novoDado);
					janela.dispose();
		}
	}
}
