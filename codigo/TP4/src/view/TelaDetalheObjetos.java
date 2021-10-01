package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class TelaDetalheObjetos implements ActionListener {

	private JFrame janela;
	private JLabel labelIDMeia = new JLabel("ID da meia: ");
	private JTextField valorIDMeia;
	private JLabel labelIDSapato = new JLabel("ID do sapato: ");
	private JTextField valorIDSapato;
	private JLabel labelTamanho = new JLabel("Tamanho: ");
	private JTextField valorTamanho;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;
	private JLabel labelPreco = new JLabel("Preço: ");
	private JTextField valorPreco;
	private JLabel labelCor = new JLabel("Cor: ");
	private JTextField valorCor;
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[50];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, TelaObjetos p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Sapato";
		if (op == 2) s = "Cadastro de Meia";
		if (op == 3) s = "Detalhe de Sapato";
		if (op == 4) s = "Detalhe de Meia";

		janela = new JFrame(s);

		//Preenche dados com dados do sapato clicado
		if (op == 3) {
			
			valorTamanho = new JTextField(String.valueOf(dados.getSapato()[pos].getTamanho()), 200);
			valorMarca = new JTextField(dados.getSapato()[pos].getMarca(), 200);
			valorTipo = new JTextField(dados.getSapato()[pos].getTipo(),200);
			valorPreco = new JTextField(String.valueOf(dados.getSapato()[pos].getPreco()), 200);
			valorCor = new JTextField(dados.getSapato()[pos].getCor(),200);
			
			valorIDSapato = new JTextField(String.valueOf(dados.getSapato()[pos].getIdSapato()), 200);
			
			labelIDSapato.setBounds(30, 50, 150, 25);
			valorIDSapato.setBounds(180, 50, 180, 25);
		//Preenche dados com dados da meia clicado 
		} else if (op == 4) { 
			valorTamanho = new JTextField(String.valueOf(dados.getMeia()[pos].getTamanho()), 200);
			valorMarca = new JTextField(dados.getMeia()[pos].getMarca(), 200);
			valorTipo = new JTextField(dados.getMeia()[pos].getTipo(),200);
			valorPreco = new JTextField(String.valueOf(dados.getMeia()[pos].getPreco()), 200);
			valorCor = new JTextField(dados.getMeia()[pos].getCor(),200);
			
			valorIDMeia = new JTextField(String.valueOf(dados.getMeia()[pos].getIdMeia()), 200);
			
			labelIDMeia.setBounds(30, 50, 150, 25);
			valorIDMeia.setBounds(180, 50, 180, 25);	
			

		} else {

			valorTamanho = new JTextField(200);
			valorMarca = new JTextField(200);
			valorTipo = new JTextField(200);
			valorPreco = new JTextField(200);
			valorCor = new JTextField(200);
			valorIDMeia = new JTextField(200);
			valorIDSapato = new JTextField(200);
			
			labelIDSapato.setBounds(30, 50, 180, 25);
			valorIDSapato.setBounds(180, 50, 180, 25);
			labelIDMeia.setBounds(30, 50, 150, 25);
			valorIDMeia.setBounds(180, 50, 180, 25);
			

			botaoSalvar.setBounds(245, 230, 115, 30);
		}
		
		labelTamanho.setBounds(30, 80, 150, 25);
		valorTamanho.setBounds(180, 80, 150, 25);
		labelMarca.setBounds(30, 110, 150, 25);
		valorMarca.setBounds(180, 110, 180, 25);
		labelTipo.setBounds(30, 140, 150, 25);
		valorTipo.setBounds(180, 140, 180, 25);
		labelPreco.setBounds(30, 170, 150, 25);
		valorPreco.setBounds(180, 170, 180, 25);
		labelCor.setBounds(30, 200, 150, 25);
		valorCor.setBounds(180, 200, 180, 25);
		
		
		//Coloca os campos relacionados a ID do sapato
		if (op == 1 || op == 3 ) {
			this.janela.add(labelIDSapato);
			this.janela.add(valorIDSapato);

		}

		//Coloca campos relacionados a ID da meia
		if (op == 2 || op == 4) {

			this.janela.add(labelIDMeia);
			this.janela.add(valorIDMeia);
		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 230, 115, 30);
			botaoExcluir.setBounds(245, 230, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelTamanho);
		this.janela.add(valorTamanho);
		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelTipo);
		this.janela.add(valorTipo);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);
		this.janela.add(labelCor);
		this.janela.add(valorCor);

		this.janela.add(botaoSalvar);
		
		

		this.janela.setLayout(null);

		this.janela.setSize(400, 450);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			
				
				 //cadastro de novo sapato
				if(opcao == 1) {
					novoDado[0] = Integer.toString(dados.getNumSapato());
					
				// cadastro de nova meia
				}else if (opcao == 2) { 
					novoDado[0] = Integer.toString(dados.getNumMeia());
					
				// edicao de dado existente
				}else { 
					novoDado[0] = Integer.toString(posicao);
				}
				novoDado[1] =  valorTamanho.getText();
				novoDado[2] =  valorMarca.getText();
				novoDado[3] =  valorTipo.getText();
				novoDado[4] =  valorPreco.getText();
				novoDado[5] =  valorCor.getText();

				if (opcao == 1 || opcao == 3) {
					novoDado[6] =  valorIDSapato.getText();
					
					dados.inserirEditarSapato(novoDado);
					janela.dispose();
				} else {
					novoDado[6] =  valorIDMeia.getText();
					dados.inserirEditarMeia(novoDado);
				}
					janela.dispose();
			}
		

		if(src == botaoExcluir) {
			
			//exclui Sapato
			if (opcao == 3) {
				dados.removerSapato(posicao);
				janela.dispose();
			}
			
			//exclui Meia
			if (opcao == 4){
				dados.removerMeia(posicao);
				janela.dispose();
			}
			
		}
	}
}