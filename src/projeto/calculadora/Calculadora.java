package projeto.calculadora;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora {
	
	private JFrame janela;
	private ArrayList<JButton> button = new ArrayList<JButton>();
	private String conta, lastButton;
	private JTextField visor, visorSuperior;
	private int separacao,auxInt = 0;;
	
	ImageIcon backspace = new ImageIcon(getClass().getResource("backspace.png"));
	ImageIcon raiz = new ImageIcon(getClass().getResource("raiz.png"));
	
	public static void main(String[] args) {
		new Calculadora().mostraJanela();
	}
	
	public void mostraJanela() {
		conta="";
		lastButton="";
		montaJanela();
		montaVisor();
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
		montaBotaoBackspace();
		montaBotaoCE();
		montaBotaoC();
		montaBotaoMudancaDeSinal();
		montaBotaoRaizQuadrada();
		montaBotaoPorcentagem();
		montaBotaoDivisaoBinaria();
		montaBotaoResultado();
		separacao=0;
	}
	
	private void montaVisor() {
		visor = new JTextField();
		visor.setText(lastButton);
		visor.setBounds(20, 70, 292, 30);
		visor.setHorizontalAlignment(JTextField.RIGHT);;
		visor.setEnabled(true);
		janela.add(visor);
		
		visorSuperior = new JTextField();
		visorSuperior.setText(conta);
		visorSuperior.setBounds(20, 40, 292, 30);
		visorSuperior.setHorizontalAlignment(JTextField.RIGHT);;
		visorSuperior.setEnabled(true);
		janela.add(visorSuperior);
	}

	public void acaoBotao(JButton b, String x){
		b.setEnabled(true);
		janela.add(b);
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				verificaCaracteres(x);
				if(separacao==1) {
					visorSuperior.setText(null);
					conta+= lastButton;
					conta+=x;
					visorSuperior.setText(conta);
					visor.setText(null);
					lastButton="";
					visor.setText(lastButton);
				} else if(separacao==2) {
					resultado(conta);
					separacao=1;
					conta="";
					atribueProximoSinal(x);
					visorSuperior.setText(null);
					visorSuperior.setText(conta);
					lastButton="";
					visor.setText(null);
					visor.setText(lastButton);
					} else {
						visor.setText(null);
						lastButton+=x;
						visor.setText(lastButton);
					}
			}
			
			});
		
	}

	private void atribueProximoSinal(String x) {
		if(x=="+") {
			conta=lastButton+"+";
		} else if(x=="-") {
			conta=lastButton+"-";
			} else if(x=="*") {
				conta=lastButton+"*";
				} else if(x=="/") {
					conta=lastButton+"/";
					}
	}
	
	private void verificaCaracteres(String x) {
		if(x=="+") {
			separacao++;
			} else if(x=="-") {
				separacao++;
				} else if(x=="*") {
					separacao++;
					} else if(x=="/") {
						separacao++;
						}
	}

	public void resultado(String conta) {
		String contaComCharVazio = conta.replace("+", " ").replace("-", " ")
				.replace("/", " ").replace("*", " ");
		int indexDaOperacao = contaComCharVazio.indexOf(" ");
		String pegarPrimeiroValor = conta.substring(0, indexDaOperacao);
		String pegarSegundoValor = conta.substring(indexDaOperacao+1);
		Double primeiroValorDouble = Double.parseDouble(pegarPrimeiroValor);
		Double segundoValorDouble = Double.parseDouble(pegarSegundoValor);
		Double resposta = null;
		
		if(conta.contains("+")) {
			resposta = primeiroValorDouble+segundoValorDouble;
		} else if (conta.contains("-")) {
				resposta=primeiroValorDouble-segundoValorDouble;
			} else if(conta.contains("/")){
					resposta = primeiroValorDouble/segundoValorDouble;
				}else if(conta.contains("*")) {
						resposta= primeiroValorDouble*segundoValorDouble;
				}
		
		
		lastButton="";
		lastButton=String.valueOf(resposta);
		visor.setText(null);
		visor.setText(lastButton);
	}

	public void montaBotaoZero() {
		button.add( new JButton("0"));
		button.get(0).setBounds(20, 290, 114, 30);
		String x= "0";
		acaoBotao(button.get(0), x);
	}
	
	public void montaBotaoUm() {
		button.add( new JButton("1"));
		button.get(1).setBounds(20, 256, 55, 30);
		String x= "1";
		acaoBotao(button.get(1), x);
	}
	
	public void montaBotaoDois() {
		button.add( new JButton("2"));
		button.get(2).setBounds(79, 256, 55, 30);
		String x= "2";
		acaoBotao(button.get(2), x);
	}
	
	public void montaBotaoTres() {
		button.add( new JButton("3"));
		button.get(3).setBounds(138, 256, 55, 30);
		String x= "3";
		acaoBotao(button.get(3), x);
	}
	
	public void montaBotaoQuatro() {
		button.add( new JButton("4"));
		button.get(4).setBounds(20, 222, 55, 30);
		String x= "4";
		acaoBotao(button.get(4), x);
	}
	
	public void montaBotaoCinco() {
		button.add( new JButton("5"));
		button.get(5).setBounds(79, 222, 55, 30);
		String x= "5";
		acaoBotao(button.get(5), x);
	}
	
	public void montaBotaoSeis() {
		button.add( new JButton("6"));
		button.get(6).setBounds(138, 222, 55, 30);
		String x= "6";
		acaoBotao(button.get(6), x);
	}
	
	public void montaBotaoSete() {
		button.add( new JButton("7"));
		button.get(7).setBounds(20, 188, 55, 30);
		String x= "7";
		acaoBotao(button.get(7), x);
	}
	
	public void montaBotaoOito() {
		button.add( new JButton("8"));
		button.get(8).setBounds(79, 188, 55, 30);
		String x= "8";
		acaoBotao(button.get(8), x);
	}
	
	public void montaBotaoNove() {
		button.add( new JButton("9"));
		button.get(9).setBounds(138, 188, 55, 30);
		String x= "9";
		acaoBotao(button.get(9), x);
	}
	
	public void montaBotaoVirgula() {
		button.add( new JButton(","));
		button.get(10).setBounds(138, 290, 55, 30);
		String x= ".";
		acaoBotao(button.get(10), x);
	}
	
	public void montaBotaoAdicao() {
		button.add( new JButton("+"));
		button.get(11).setBounds(197, 290, 55, 30);
		String x= "+";
		acaoBotao(button.get(11), x);
	}
	
	public void montaBotaoSubtracao() {
		button.add( new JButton("-"));
		button.get(12).setBounds(197, 256, 55, 30);
		String x= "-";
		acaoBotao(button.get(12), x);
	}
	
	public void montaBotaoMultiplicacao() {
		button.add( new JButton("*"));
		button.get(13).setBounds(197, 222, 55, 30);
		String x= "*";
		acaoBotao(button.get(13), x);
	}
	
	public void montaBotaoDivisao() {
		button.add( new JButton("/"));
		button.get(14).setBounds(197, 188, 55, 30);
		String x= "/";
		acaoBotao(button.get(14), x);
	}
	
	public void montaBotaoBackspace() {
		button.add( new JButton());
		button.get(15).setIcon(backspace);
		button.get(15).setBounds(20, 154, 55, 30);
		janela.add(button.get(15));
		button.get(15).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lastButton.length()==0) {
					
				} else {
				lastButton = lastButton.substring(0, lastButton.length()-1);
				visor.setText(null);
				visor.setText(lastButton);
				}
			}
		});
		
	}
	
	public void montaBotaoCE() {
		button.add( new JButton("CE"));
		button.get(16).setBounds(79, 154, 55, 30);
		janela.add(button.get(16));
		button.get(16).addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(null);
				lastButton="";
				visor.setText(lastButton);
			}
		});
	}
	
	public void montaBotaoC() {
		button.add( new JButton("C"));
		button.get(17).setBounds(138, 154, 55, 30);
		janela.add(button.get(17));
		button.get(17).addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				visorSuperior.setText(null);
				conta="";
				visor.setText(conta);
				visor.setText(null);
				lastButton="";
				visor.setText(lastButton);
			}
		});
	}
	
	public void montaBotaoMudancaDeSinal() {
		button.add( new JButton("+/-"));
		button.get(18).setBounds(197, 154, 55, 30);
		janela.add(button.get(18));
		button.get(18).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String aux ="";
				aux+=lastButton;
				if(lastButton=="0") {
					
				} else {
					if(auxInt==0) {
						visor.setText(null);
						lastButton="";
						lastButton="-"+aux;
						visor.setText(lastButton);
						auxInt=1;
					} else {
						visor.setText(null);
						lastButton="";
						aux = aux.replace("-", "");
						lastButton=aux;
						visor.setText(lastButton);
						auxInt=0;
					}
				}
				
			}
		});
	}
	
	public void montaBotaoRaizQuadrada() {
		button.add( new JButton());
		button.get(19).setIcon(raiz);
		button.get(19).setBounds(257, 154, 55, 30);
		janela.add(button.get(19));
		button.get(19).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double raizQuadrada = Math.sqrt(Double.parseDouble(lastButton));
				visor.setText(null);
				lastButton="";
				lastButton=String.valueOf(raizQuadrada);
				visor.setText(lastButton);
			}
		});
	}
	
	public void montaBotaoPorcentagem() {
		button.add( new JButton("%"));
		button.get(20).setBounds(257, 188, 55, 30);
		janela.add(button.get(20));
	}
	
	public void montaBotaoDivisaoBinaria() {
		button.add( new JButton("1/x"));
		button.get(21).setBounds(257, 222, 55, 30);
		janela.add(button.get(21));
	}
	
	public void montaBotaoResultado() {
		button.add( new JButton("="));
		button.get(22).setBounds(257, 256, 55, 64);
		janela.add(button.get(22));
		button.get(22).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(conta.isEmpty()) {
					
				} else {
					conta+=lastButton;
					visorSuperior.setText(null);
					visorSuperior.setText(conta);
					lastButton="";
					visor.setText(null);
					visor.setText(lastButton);
					resultado(conta);
				}
			}
		});
	}


	
	public void montaJanela() {
		janela = new JFrame("Calculadora");
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setSize(350,380);
		janela.setVisible(true);	
	}

}
