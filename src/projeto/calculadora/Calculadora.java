package projeto.calculadora;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculadora {
	
	private JFrame janela;
	private ArrayList<JButton> button = new ArrayList<JButton>();
	private String conta;
	private JLabel mostrador;
	
	public static void main(String[] args) {
		new Calculadora().mostraJanela();
	}
	
	public void mostraJanela() {
		conta="";
		montaJanela();
		montaMostrador();
		montaBotaoZero();
		montaBotaoUm();
		montaBotaoDois();
		montaBotaoTres();
		montaBotaoQuatro();
		montaBotaoCinco();
		montaBotaoSeis();
		montaBotaoSete();
		montaBotaoOito();
		montaBotaoNove();
		montaBotaoVirgula();
		montaBotaoAdicao();
		montaBotaoSubtracao();
		montaBotaoMultiplicacao();
		montaBotaoDivisao();
		
	}
	
	private void montaMostrador() {
		mostrador = new JLabel();
		mostrador.setText(conta);
		mostrador.setBounds(20, 50, 220, 80);
		janela.add(mostrador);
	}

	public void acaoBotao(JButton b, String x){
		janela.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrador.setText(null);
				conta+=x;
				mostrador.setText(conta);
			}
		});
	}

	public void montaBotaoZero() {
		button.add( new JButton("0"));
		button.get(0).setBounds(20, 350, 98, 44);
		String x= "0";
		acaoBotao(button.get(0), x);
	}
	
	public void montaBotaoUm() {
		button.add( new JButton("1"));
		button.get(1).setBounds(20, 296, 44, 44);
		String x= "1";
		acaoBotao(button.get(1), x);
	}
	
	public void montaBotaoDois() {
		button.add( new JButton("2"));
		button.get(2).setBounds(74, 296, 44, 44);
		String x= "2";
		acaoBotao(button.get(2), x);
	}
	
	public void montaBotaoTres() {
		button.add( new JButton("3"));
		button.get(3).setBounds(128, 296, 44, 44);
		String x= "3";
		acaoBotao(button.get(3), x);
	}
	
	public void montaBotaoQuatro() {
		button.add( new JButton("4"));
		button.get(4).setBounds(20, 242, 44, 44);
		String x= "4";
		acaoBotao(button.get(4), x);
	}
	
	public void montaBotaoCinco() {
		button.add( new JButton("5"));
		button.get(5).setBounds(74, 242, 44, 44);
		String x= "5";
		acaoBotao(button.get(5), x);
	}
	
	public void montaBotaoSeis() {
		button.add( new JButton("6"));
		button.get(6).setBounds(128, 242, 44, 44);
		String x= "6";
		acaoBotao(button.get(6), x);
	}
	
	public void montaBotaoSete() {
		button.add( new JButton("7"));
		button.get(7).setBounds(20, 188, 44, 44);
		String x= "7";
		acaoBotao(button.get(7), x);
	}
	
	public void montaBotaoOito() {
		button.add( new JButton("8"));
		button.get(8).setBounds(74, 188, 44, 44);
		String x= "8";
		acaoBotao(button.get(8), x);
	}
	
	public void montaBotaoNove() {
		button.add( new JButton("9"));
		button.get(9).setBounds(128, 188, 44, 44);
		String x= "9";
		acaoBotao(button.get(9), x);
	}
	
	public void montaBotaoVirgula() {
		button.add( new JButton(","));
		button.get(10).setBounds(128, 350, 44, 44);
		String x= ".";
		acaoBotao(button.get(10), x);
	}
	
	public void montaBotaoAdicao() {
		button.add( new JButton("+"));
		button.get(11).setBounds(182, 350, 44, 44);
		String x= "+";
		acaoBotao(button.get(11), x);
	}
	
	public void montaBotaoSubtracao() {
		button.add( new JButton("-"));
		button.get(12).setBounds(182, 296, 44, 44);
		String x= "-";
		acaoBotao(button.get(12), x);
	}
	
	public void montaBotaoMultiplicacao() {
		button.add( new JButton("*"));
		button.get(13).setBounds(182, 242, 44, 44);
		String x= "*";
		acaoBotao(button.get(13), x);
	}
	
	public void montaBotaoDivisao() {
		button.add( new JButton("/"));
		button.get(14).setBounds(182, 188, 44, 44);
		String x= "/";
		acaoBotao(button.get(14), x);
	}

	
	public void montaJanela() {
		janela = new JFrame("Calculadora");
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setSize(300,450);
		janela.setVisible(true);	
	}

}
